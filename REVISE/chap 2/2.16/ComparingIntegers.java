// Exercises 2.16: ComparingIntegers.java
// display larger number 
// if the numbers are equel print the message "These numbers are equel"
import java.util.Scanner; // program uses class Scanner

public class ComparingIntegers
{
	// main method begins execution of java application
	public static void main(String[]args)
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		int number1;// first number to add
		int number2;// second number to add
		
		System.out.print("Enter first integer number: ");// prompt
		number1 = input.nextInt();// read first number from user
		
		System.out.print("Enter second integer number: ");// prompt
		number2 = input.nextInt();// read second number from user
		
		int larger = number1;// number1 valus assign to larger
		
		if (number1 > number2)
			System.out.println("number1 is larger");
		
		if (number1 == number2)
			System.out.println("These numbers are equel");
	}// end main method
}// end class ComparingIntegers