public class Employee
{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		if (monthlySalary > 0.0)
			this.monthlySalary = monthlySalary;
		else
			System.out.println("Monthly salary is not > 0.0");
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setMonthlySalary(double monthlySalary)
	{
		if (monthlySalary > 0.0)
			this.monthlySalary = monthlySalary;
		else
			System.out.println("Monthly salary is not > 0.0");
	}
	
	public double getMonthlySalary()
	{
		return monthlySalary *12;
	}
	
	public double raise()
	{
		return monthlySalary = getMonthlySalary() +(monthlySalary *12*10/100);
	}
}