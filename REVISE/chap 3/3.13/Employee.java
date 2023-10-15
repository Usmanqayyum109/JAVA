 /**                                UML
		     _______________________________________________________ 
		    |                     Employee                         |
            |______________________________________________________|
            |                                                      |
            |-firstName:String  		                           |
            |-lastName:String                                      |
			|-monthlySalary: double                                |
            |______________________________________________________|
            |                                                      |
            |<<constructor>>Employee(firstName: String,            |
			| lastName: String, monthlySalary: double)             |
            |+setFirstName(firstName : String)                     |
            |+getFirstName() : String                              |
            |+setLastName(lastName : String)                       |
            |getLastName() : String                                |
            |+setMonthlySalary(monthlySalary : double)             |
			|+getMonthlySalary() : double                          |
            |______________________________________________________|      */
			
			
// Exercise. 3.13: Employee.java
// employee monthly salary calculate


public class Employee
{
	String firstName; // instance variable
	String lastName; // instance variable
	double monthlySalary; // instance variable
	
	// Employee constructor that recives three parameters
	public Employee(String firstName, String lastName, double monthlySalary)
	{
		// assign firstName to instance variable firstName
		this.firstName = firstName; 
		
		// assign lastName to instance variable lastName
		this.lastName = lastName;
		
		
		// validate that the monthlySalary is greater then 0.0; if it's not,
		// instance monthlySalary balance keeps its default initial value of 0.0
		if (monthlySalary > 0.0) // if the monthlySalary is validate
			this.monthlySalary = monthlySalary; // assign it to instance monthlySalary
	}	
		
		// method that sets the first name
		public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}
		
		// method that returns the first name
		public String getFirstName()
		{
			return firstName;
		}
		
		
		// method that sets the last name
		public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}
		
		// method that returns the last name
		public String getLastName()
		{
			return lastName;
		}
		
		
		// method that sets the monthly  salary
		public void setMonthlySalary(double monthlySalary)
		{
		// validate that the monthlySalary is greater then 0.0; if it's not,
		// instance monthlySalary balance keeps its default initial value of 0.0
			if (monthlySalary > 0.0) // if monthlySalary is validate
			this.monthlySalary = monthlySalary; // assign it to instance monthlySalary
		}
		
		// method that returns the monthly salary
		public double getMonthlySalary()
		{
			return monthlySalary; // give value of monthlySalary back to caller
			
		} // end getMonthlySalary method
	 
} // end class Employee