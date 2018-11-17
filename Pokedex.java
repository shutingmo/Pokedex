
public class Pokedex 
{
	Pokemon[] pokemon; //declaring an array of element type Pokemon and naming it pokemon
	
	public Pokedex(int size) //constructor that takes in user input size from main method and makes the size the array size
	{
		pokemon = new Pokemon[size]; //create an array called pokemon and assigning the array size to whatever the user wants
	}
	
	int PokemonCount = 0; //variable that stores the number of pokemon stored so far
	
	public boolean addPokemon(String species)
	{
		if (pokemon[pokemon.length - 1] != null) //if the last index of the pokemon is not null (aka full) then the array is at max capacity
		{
			System.out.println("Max");
			return false;
		}
		
		//check if there are duplicate pokemons already in the pokemon array
		//compares species already in the pokemon array to the species the user entered
		for(int i = 0; i < PokemonCount; i++)
		{
			if (pokemon[i].getSpecies().equalsIgnoreCase(species))
			{
				System.out.println("Duplicate");
				return false;
			}
		}
		
		/*if newly entered species is not a duplicatre or does not surpass the
		the max array size, then we add the species to the array */
		
		Pokemon addedSpecies = new Pokemon(species); //create new object called addedSpecies, which takes in the parameter species
		pokemon[PokemonCount] = addedSpecies; //adds the new species to the pokemon array at the pokemonCount index
		PokemonCount++; //once we add a new species to the array, we increment the pokemonCount by 1 
		return true; 
	}
	
	public String[] listPokemon()
	{
		if (PokemonCount == 0) //if there's no pokemon stored, theres nothing to list
		{
			return null;
		}
		
		/* since we can't have empty indexes, we make the
		 array size the number of pokemon the user has stored, which is the PokemonCount*/
		String[] currPokemonList = new String[PokemonCount]; 
		
		for (int i = 0; i < PokemonCount; i++)
		{
			/*gets the species stored at the i index of the pokemon array
			 and assigns that species to the same i index of the currPokemonList array*/
			currPokemonList[i] = pokemon[i].getSpecies(); 
		}
		return currPokemonList;
	}
	
	public int[] checkStats(String species)
	{
		boolean exists = false; 
		int[] stats = new int[3]; //we report 3 traits of each species, so the array size is always 3
		
		for (int i = 0; i < PokemonCount; i++)
		{
			if (pokemon[i].getSpecies().equalsIgnoreCase(species))
			{
				stats[0] = pokemon[i].getAttack(); 
				stats[1] = pokemon[i].getDefense();
				stats[2] = pokemon[i].getSpeed();
				exists = true;
			}		
		}
		
		
		if (exists)
		{
			return stats; 
		}
		
		else 
		{
			return null;
		}
	}
	
	public void sortPokemon()
	{
		for (int i = 0; i < PokemonCount - 1; i++)
		{
			int minimumIndex = i;
			for (int j = i + 1; j < PokemonCount; j++)
			{
				if(pokemon[j].getSpecies().compareToIgnoreCase(pokemon[minimumIndex].getSpecies()) < 0)
				{
					minimumIndex = j; 
				}
			}
			
			Pokemon temp = pokemon[i];
			pokemon[i] = pokemon[minimumIndex];
			pokemon[minimumIndex] = temp; 
		}
	}
	
}
