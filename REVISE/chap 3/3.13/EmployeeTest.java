// Exercise. 3.13: EmployeeTest.java
// show yearly salary with 10% raise 

public class EmployeeTest
{
	public static void main(String[]args)
	{
		Employee employee1 = new Employee("USMAN", "Qayyum", 35000.00);
		Employee employee2 = new Employee("MUHAMMAD", "AHMAD", 55000.00);
		
		// Display Employee1 Data
		System.out.printf("%nEmployee1 First Name is %s.%n",
			employee1.getFirstName());
			
		System.out.printf("Employee1 Last Name is %s.%n",
			employee1.getLastName());
			
		System.out.printf("Employee1 Monthly Salary is %.2f.%n",
			employee1.getMonthlySalary());
			
		System.out.printf("Employee1 Yearly Salary is %.2f.%n",
			employee1.getMonthlySalary() * 12);
			
		double raise1 = employee1.getMonthlySalary() * 12;
			raise1 = raise1 + (raise1 * 10 / 100);
			
		System.out.printf("Employee1 Yearly Salary With 10 percent Raise is %.2f.%n%n", 
			raise1);
			
			
		// Display Employee2 Data
		System.out.printf("Employee2 First Name is %s.%n",
			employee2.getFirstName());
			
		System.out.printf("Employee2 Last Name is %s.%n",
			employee2.getLastName());
			
		System.out.printf("Employee2 Monthly Salary is %.2f.%n",
			employee2.getMonthlySalary());
			
		System.out.printf("Employee2 Yearly Salary is %.2f.%n",
			employee2.getMonthlySalary() * 12);
			
		double raise = employee2.getMonthlySalary() * 12;
			raise = raise + (raise * 10 / 100);
			
		System.out.printf("Employee2 Yearly Salary With 10 percent Raise is %.2f.%n%n", 
			raise);
	}
}