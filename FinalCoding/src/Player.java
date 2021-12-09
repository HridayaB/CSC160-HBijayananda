/*
 * Hridaya Bijayananda
 */
public class Player
{
	private Die die; // the object die 
	private String name; // the player's name
	
	// getters and setters below
	public Die getDie( )
	{
		return die;
	}
	public void setDie( Die die )
	{
		this.die = die;
	}
	public String getName( )
	{
		return name;
	}
	public void setName( String name )
	{
		this.name = name;
	}
	// end of getters and setters
	
	@Override
	public String toString( )
	{
		return "Player [die=" + die + ", name=" + name + "]";
	} // end of toString
} // end of class Player
