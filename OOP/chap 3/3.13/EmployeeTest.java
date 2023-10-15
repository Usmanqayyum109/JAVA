public class EmployeeTest
{
	public static void main(String[]args)
	{
		Employee employee1 = new Employee("Huzafa","Ahmed",1000.00);
		Employee employee2 = new Employee("Faiz","Muneer",3500.00);
		
		System.out.printf("First name is %s%nLast name is %s%nyearly salary:%.2f%n",
			employee1.getFirstName(),employee1.getLastName(),
			employee1.getMonthlySalary());
			
			System.out.printf("Your yearly raise is %.2f%n",
			employee1.raise());	
			
		System.out.printf("First name is %s%nLast name is %s%nyearly salary:%.2f%n",
			employee2.getFirstName(),employee2.getLastName(),
			employee2.getMonthlySalary());

			

        	

        System.out.printf("Your yearly raise is %.2f%n",
			employee2.raise());		
	}
}