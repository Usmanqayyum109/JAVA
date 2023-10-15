public class PayrollSystemTest 
{
	public static void main(String[] args) {
		
		Date bd1 = new Date(10,2,1986);
		Date bd2 = new Date(30,3,1999);
		Date bd3 = new Date(7,20,1993);
		
		SalariedEmployee salariedEmployee = new SalariedEmployee(
			"john", "Smith", "111-11-111",bd1, 450.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee(
			"Karen", "Price", "222-22-222",bd1, 12.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee(
			"Sua", "jones", "333-33-333",bd2, 10000,.06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
			"Bob","Lewis","444-44-444",bd3, 900,.04, 300);

		System.out.println("Employees processed individually :"); 
		System.out.printf("%n%s%n%s:$%.2f%n%n",salariedEmployee,
		"earned", salariedEmployee.earnings());
		System.out.printf("%n%s%n%s:$%.2f%n%n",hourlyEmployee,
		"earned", hourlyEmployee.earnings());
		System.out.printf("%n%s%n%s:$%.2f%n%n",commissionEmployee,
		"earned", commissionEmployee.earnings());
		System.out.printf("%n%s%n%s:$%.2f%n%n",basePlusCommissionEmployee,
		"earned", basePlusCommissionEmployee.earnings());

		
		Employee[] employees = new Employee[4];

		
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;

		System.out.printf("Employees processed polymorphically:%n%n");

		
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);

			
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());

				System.out.printf("new base salary with 10%% increase is: %.2f%n",
				employee.getBaseSalary());
			} 

			System.out.printf("earned: $%,.2f%n%n",currentEmployee.earnings());
		} 
		
		System.out.printf("<--------%s-------->%n%n","After adding bonus $100.00");
		for(Employee currentEmployee : employees)
		{
			int currentMonth = 1;
			if(currentEmployee.getBirthDay().getMonth() == currentMonth)
			{
				if(currentEmployee instanceof BasePlusCommissionEmployee)
				{
					System.out.printf("%s%n%n",currentEmployee);
					BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
					employee.setBaseSalary(100.00 + employee.getBaseSalary());
					System.out.printf("earnings with $100.00 birthday bonus is: $%,.2f",
						employee.earnings() + 100.00);
				} 
				else if(currentEmployee instanceof HourlyEmployee)
				{
					System.out.printf("%s",currentEmployee);
					System.out.printf("%n%s$%,.2f%n%n","earnings with birthday bonus is: ",currentEmployee.earnings() + 100.00);
				}
				else if(currentEmployee instanceof SalariedEmployee)
				{
					SalariedEmployee employee = (SalariedEmployee) currentEmployee;
					System.out.printf("%s",employee);
					employee.setWeeklySalary(employee.getWeeklySalary() + 100.00);
					System.out.printf("%nearnings with birthday bonus is: $%,.2f%n%n",employee.getWeeklySalary());
				} 
				else if(currentEmployee instanceof CommissionEmployee)
				{
					System.out.printf("%s",currentEmployee);
					System.out.printf("%nearnings with birthday bonus is: $%,.2f%n%n",currentEmployee.earnings() + 100.00);

					
				}
				
			} 
		} 
		System.out.printf("<--x-----%s-------->%n%n","After adding bonus $100.00");
		
		for (int j = 0; j < employees.length; j++)
			System.out.printf("Employees %d is a %s%n", j,employees[j].getClass().getName());
	}
}