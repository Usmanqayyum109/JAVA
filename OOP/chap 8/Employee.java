public class Employee
{
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	private Date deathDate;
	
	public Employee(String firstName,String lastName,Date birthDate,
	Date hireDate,Date deathDate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
		this.deathDate = deathDate;
	}
	
	public String toString()
	{
		return String.format("%s, %s Hired: %s Birthday: %s deathDate: %s",
		lastName,firstName,hireDate,birthDate,deathDate);
	}
}