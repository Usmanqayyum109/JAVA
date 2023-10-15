// Exercises 2.30: SeparatingTheDigitsInAnInteger.java
// create program that inputs one integer then 
// separate each number and display with three spaces
import java.util.Scanner; // program uses class Scanner

public class SeparatingTheDigitsInAnInteger
{
	// main method begins execution of java application
	public static void main(String[]args)
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		int number1;// first number to add
		
		System.out.print("Enter integer number consisting of five digitis: ");// prompt
		number1 = input.nextInt();// read  number from user
		
		int digit1 = number1 / 10000;// separate 1st number of 5 
		int digit2 = (number1 / 1000) % 10;// separate 2nd number of 5
		int digit3 = (number1 / 100) % 10;// separate 3rd number of 5
		int digit4 = (number1 / 10) % 10;// separate 4th number of 5
		int digit5 = number1 % 10;// separate 5th number of 5 		
		
		System.out.printf(" %d	%d	%d	%d	%d",
			digit1, digit2, digit3, digit4, digit5);
	}// end main method
}// end class SeparatingTheDigitsInAnInteger