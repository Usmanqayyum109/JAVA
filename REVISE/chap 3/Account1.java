// Fig. 3.5: Account.java
// Account with a constructor that initializes the name.

public class Account1
{
	private String name; // instance variable
	
	// constructor initializes name with parameter name
	public Account1(String name)
	{
		this.name = name;
	}
	
	// method to set the name
	public void setName(String name)
	{
		this.name = name;
	}
	
	// method to retrieve the name
	public String getName()
	{
		return name;
	}
} // end class Account1