// Exercise. 3.14: DateTest.java
// Display Date 

import java.util.Scanner;

public class DateTest
{
	public static void main(String []args)
	{
		Date date = new Date(2, 15, 2023);
		
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		// Display Date
		System.out.printf("\nCurrent Date is %s.\n", date.displayDate());
		
		System.out.print("\n Enter Current Month:"); // propmt
		int month = input.nextInt(); // obtain user input
		date.setMonth(month);
		
		System.out.print("\n Enter Current Day:"); // propmt
		int day = input.nextInt(); // obtain user input
		date.setDay(day);
		
		System.out.print("\n Enter Current Year:"); // propmt
		int year = input.nextInt(); // obtain user input
		date.setYear(year);
		
		// Display Date Again
		System.out.printf("%nCurrent Date is %s.%n%n", date.displayDate());
	}
}