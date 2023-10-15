// Exercises 2.24: LargestAndSmallestIntegers.java
// create program that inputs five integers then display largest
// of them and smallest
import java.util.Scanner; // program uses class Scanner

public class LargestAndSmallestIntegers
{
	
	// main method begins execution of java application
	public static void main(String[]args)
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		int number1;// first number to add
		int number2;// second number to add
		int number3;// third number to add
		int number4;// forth number to add
		int number5;// fivth number to add
		
		System.out.print("Enter first integer number: ");// prompt
		number1 = input.nextInt();// read first number from user
		
		System.out.print("Enter second integer number: ");// prompt
		number2 = input.nextInt();// read second number from user
		
		System.out.print("Enter third integer number: ");// prompt
		number3 = input.nextInt();// read third number from user
		
		System.out.print("Enter forth integer number: ");// prompt
		number4 = input.nextInt();// read forth number from user
		
		System.out.print("Enter fivth integer number: ");// prompt
		number5 = input.nextInt();// read fivth number from user
		
		int largest = number1;// number1 value assign to largest
		int smallest = number1;// number1 value assign to smallest
		
		if (number2 > largest)
			largest = number2;
		
		if (number3 > largest)
			largest = number3;
		
		if (number4 > largest)
			largest = number4;
		
		if (number5 > largest)
			largest = number5;
		
		System.out.printf("largest number is %d%n", largest);
		
		if (number2 < smallest)
			smallest = number2;
		
		if (number3 < smallest)
			smallest = number3;
		
		if (number4 < smallest)
			smallest = number4;
		
		if (number5 < smallest)
			smallest = number5;
		
		System.out.printf("smallest number is %d%n", smallest);
	}// end main method
}// end class LargestAndSmallestIntegers
