public class EmployeeTest
{
	public static void main(String[]args)
	{
		Date birth = new Date(1949,24,07);
		Date hire = new Date(1988,12,03);
		Date death = new Date(2010,05,02);
		Employee employee = new  Employee("bob","blue",birth,hire,death);
	   
		
		System.out.println(employee);
	}
}