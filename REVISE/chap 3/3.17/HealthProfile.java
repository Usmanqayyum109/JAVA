  /**                                UML
		     _______________________________________________________ 
		    |                   HealthProfile                      |
            |______________________________________________________|
            |                                                      |
            |-firstName:String  		                           |
            |-lastName:String                                      |
			|-gender: String                                       |
			|-dateOfBirth: String                                  |
            |-height: double                                       |
            |-weight: double                                       |			
            |______________________________________________________|
            |                                                      |
            |<<constructor>>HealthProfile(firstName: String,       |
			|lastName:String, gender: String, dateOfBirth:int      |
			|height: double, weight: double)                       |
            |                                                      |			
            |+setFirstName(firstName : String)                     |
            |+getFirstName() : String                              |
            |+setLastName(lastName : String)                       |
            |+getLastName() : String                               |
            |+setGender(gender : String)                           |
			|+getGender() : String                                 |
			|+setDateOfBirth(dateOfBirth : String)                 |
            |+getDateOfBirth() : String                            |
            |+setHeight(height: double)                            |
            |+getHeight(): double		                           |
            |+setWeight(weight: double)                            |
            |+getWeight(): double                                  |
            |+getAge(): int                                        |
            |+heartRate(): double                                  |
            |+targetHeartRate(): double                            |
            |+BMI(): double                                        |   			
            |______________________________________________________|     */
			
// Exercise. 3.17: HealthProfile.java	

	
import java.util.Scanner;			
public class HealthProfile
{
	private String firstName; // instance variable
	private String lastName; // instance variable
	private String gender; // instance variable
	private String dateOfBirth; // instance variable
	private double height; // instance variable
	private double weight; // instance variable
	private int age; // instance variable
	
	// create a constructor that receive six parameters
	public HealthProfile(String firstName, String lastName, String gender,
		String dateOfBirth, double height, double weight)
		{
			this.firstName = firstName; // assign it to instance variable firstName
			this.lastName = lastName; // assign it to instance variable lastName
			this.gender = gender; // assign it to instance variable gender
			this.dateOfBirth = dateOfBirth; // assign it to instance variable dateOfBirth
			this.height = height; // assign it to instance variable height
			this.weight = weight; // assign it to instance variable weight
		}
		
		
	// create Scanner Object
	Scanner input = new Scanner(System.in);
		
		
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
	
	
	// method that sets the gender
	public void setGender(String gender)
	{
		this.gender = gender; // assign it to instance variable gender
	}
	
	
	// method that returns the gender
	public String getGender()
	{
		return gender;
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
	
	
	// method that sets the height
	public void setHeight(double height)
	{
		this.height = height; // assign it to instance variable height
	}
	
	
	// method that returns the height
	public double getHeight()
	{
		return height;
	}
	
	
	// method that sets the weight
	public void setWeight(double weight)
	{
		this.weight = weight; // assign it to instance variable weight
	}
	
	
	// method that returns the weight
	public double getWeight()
	{
		return weight;
	}
	
	
	// method that returns age
	public int getAge()
	{
		System.out.print("Enter your Age in YEAR:"); // prompt
		int year = input.nextInt(); // obtain user input
		return year;
	}
	
	// method that returns person heart rate
	public double heartRate()
	{
		 age = 220 - getAge();
		return age;
	}
	
	
	// method that returns  heart rate target;
	public double targetHeartRate()
	{
		
		double target =  age * 0.85;
		return  target;
		
	} 
	
	
	// BMI returns
	public double BMI()
	{
		double weight = getWeight();
		//weight	= weight * 703;
		double height = getHeight();
		height =  height * height;
		double bmi = weight / height;
		return bmi;
	}
}