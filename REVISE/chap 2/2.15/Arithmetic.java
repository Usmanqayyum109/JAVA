// Exercises 2.15: Arithmetic.java
// print sum,product,difference 
// and division of two user numbers
import java.util.Scanner; // program uses class Scanner

public class Arithmetic
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
		
		int sum = number1 + number2;// add numbers, then store total in sum
		int product = number1 * number2;// product numbers, then store total in product
		int difference = number1 - number2; // difference numbers, then store total in difference
		int division = number1 / number2; // division numbers, then store total in division
		
		System.out.printf("Sum is %d%nproduct is %d%ndifference is %d%ndivision is %d%n"
			, sum, product, difference, division);
	}// end main method
}// end class Arithmetic