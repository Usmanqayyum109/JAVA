// Exercises 2.26: Multiples.java
// create program that inputs two integers then display 
// whether the number is a multiple of second number or no?
import java.util.Scanner; // program uses class Scanner

public class Multiples
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
		
		int mod = number1 % number2;// number1 mod number2 and store to mod variable
		
		if (mod == 0)
			System.out.printf("%d is multiples by %d ", number1, number2);
		else
			System.out.printf("%d is not multiples by %d ", number1, number2);
	}// end main method
}// end class Multiples