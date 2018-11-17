
public class Pokemon 
{
	public String species1;
	public int attack;
	public int defense;
	public int speed;
	
	//constructor that assigns values to the fields
	//only use species as the argument because attack, defense, and speed are calculated based on species
	public Pokemon(String species) 
	{
		species1 = species; 
		attack = ((species.length() * 4) + 2);
		defense = ((species.length() * 2) + 7);
		speed = ((species.length() * 3) + 5);
	}
	public void grow(int boost) //modifier method that increases attack
	{
		attack = (attack + boost);
	}
	
	public void harden(int boost) //modifier method that increases defense
	{
		defense = (defense + boost);
	}
	
	public void haste(int boost) //modifier method that increases speed
	{
		speed = (speed + boost);
	}
	
	public String getSpecies() //getter that allows user to access the species1
	{
		return species1;
	}
	
	public void setSpecies(String species) //setter that assigns the species1 a String value species
	{
		species1 = species;
	}
	
	public int getAttack() //getter that allows user to access the attack
	{
		return attack;
	}
	
	public void setAttack(int atk) //setter that assigns the attack to an int value atk
	{
		attack = atk;
	}
	
	public int getDefense() //getter that allows user to access the defense
	{
		return defense;
	}
	
	public void setDefense(int def) //setter that assigns the defense to a int value def
	{
		defense = def; 
	}
	
	public int getSpeed() //getter that allows user to access the speed
	{
		return speed;
	}
	
	public void setSpeed(int spd) //setter that allows the user to set the speed to an int value spd
	{
		speed = spd; 
	}
}
