import java.util.Scanner;

public class Salary
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		double base_hours = 40.00;
		double overTime_rate = 1.5;
		double workedHours;
		double hourlyRates = 200.00;
		double grossPay;
		
		System.out.print("Enter hours worked last week: ");
		workedHours = input.nextDouble();
		
		while (workedHours >= 40.00)
		{
			if (workedHours > 40.00)
			{grossPay = workedHours * hourlyRates;
				grossPay = grossPay * overTime_rate / 100;
			System.out.printf("Your salary is %.2f",grossPay);
			break;}

			else
                grossPay = workedHours  * hourlyRates;	
                System.out.printf("Your salary is %.2f",grossPay);			
		}
	    
	}
}