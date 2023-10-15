  /**                               UML
		     _______________________________________________________ 
		    |                   HeartRates                         |
            |______________________________________________________|
            |                                                      |
            |-firstName:String  		                           |
            |-lastName:String                                      |
			|-dateOfBirth: int                                     |
            |______________________________________________________|
            |                                                      |
            |<<constructor>>HeartRates(firstName: String, lastName:|
			|String, dateOfBirth: int)                             |
            |+setFirstName(firstName : String)                     |
            |+getFirstName() : String                              |
            |+setLastName(lastName : String)                       |
            |+getLastName() : String                               |
            |+setDateOfBirth(dateOfBirth : String)                 |
			|+getDateOfBirth() : String                            |
			|+getAge() : int                                       |
            |+personHeartRate() : double                           |
            |+personTargetHeartRate() : double                     |			
            |______________________________________________________|  */
	
// Exercise. 3.16: HeartRates.java
// calculate and show person heart beats rate	

import java.util.Scanner;
public class HeartRates
{
	private String firstName; // instance variable
	private String lastName; // instance variable
	private String dateOfBirth; // instance variable
	private double age; // intance variable
	// create Scanner Object
	Scanner input = new Scanner(System.in);
	
	// create constructor that recives three parameter
	public HeartRates(String firstName, String lastName, String dateOfBirth)
	{
		this.firstName = firstName; // assign it to instance variable firstName
		this.lastName = lastName; // assign it to instance variable lastName
		this.dateOfBirth = dateOfBirth; // assign it to instance variable dateOfBirth
	}
	
	// method that sets the firstName
	public void setFirstName(String firstName)
	{
		this.firstName = firstName; // assign it to instance variable firstName
	}
	
	
	// method that returns the firstName
	public String getFirstName()
	{
		return firstName;
	}
	
	// method that sets the lastName
	public void setLastName(String lastName)
	{
		this.lastName = lastName; // assign it to instance variable lastName
	}
	
	
	// method that returns the lastName
	public String getLastName()
	{
		return lastName;
	}
	
	// method that sets the dateOfBirth
	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth; // assign it to instance variable dateOfBirth
	}
	
	
	// method that returns the dateOfBirth
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	// method that returns age
	public int getAge()
	{
		System.out.print("Enter your Age in YEAR:"); // prompt
		int year = input.nextInt(); // obtain user input
		return year;
	}
	
	// method that returns person heart rate
	public double personHeartRate()
	{
		 age = 220 - getAge();
		return age;
	}
	
	
	// method that returns  heart rate target;
	public double personTargetHeartRate()
	{
		
		double target =  age * 0.85;
		return  target;
		
	} // end method personTargetHeartRate
} // end class HeartRates


