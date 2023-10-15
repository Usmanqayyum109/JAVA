public class HourlyEmployeeTest1
{
   public static void main(String[] args)
   {
	  HourlyEmployee employee = new HourlyEmployee(
	   "sue", "jones", "222-22-2222", 158.00, 100.00);
	   
	   System.out.println("Employee information obtained by get methods:");
	   System.out.printf("%n%s %s%n", "First name is",
	                     employee.getFirstName());
       System.out.printf("%s %s%n", "Last name is",
                         employee.getLastName());
       System.out.printf("%S %s%n", "Social security number is",
	                     employee.getSocialSecurityNumber());
       System.out.printf("%s %S%n", "hour is ",
	                     employee.getHour());
      System.out.printf("%S %S%n", "Wage is ",
	                     employee.getWage());

     employee.setHour(160.00);
     employee.setWage(200.00);

   System.out.printf("%n%s:%n%n%s%n",
                "up dateed employee information obtained by  toString",employee);	 
   }
}