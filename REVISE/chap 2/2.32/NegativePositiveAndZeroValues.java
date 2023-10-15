// Exercises 2.32: NegativePositiveAndZeroValues.java
// create program that inputs five integers then display 
// total positive numbers, total negative numbers and
// zero values numbers
import java.util.Scanner; // program uses class Scanner

public class NegativePositiveAndZeroValues
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
		
		int positiveNumbers = 0;// positive numbers to add
		int negativeNumbers = 0;// negative numbers to add
		int zeroValuesNumbers = 0;// zero value numbers to add
		
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
		
		// check number1
		if (number1 == 0)
			zeroValuesNumbers = ++zeroValuesNumbers;
		
		if (number1 > 0)
			positiveNumbers = ++positiveNumbers;
		
		if (number1 < 0)
			negativeNumbers = ++negativeNumbers;
		
		// check number2
		if (number2 == 0)
			zeroValuesNumbers = ++zeroValuesNumbers;
		
		if (number2 > 0)
			positiveNumbers = ++positiveNumbers;
		
		if (number2 < 0)
			negativeNumbers = ++negativeNumbers;
		
		// check number3
		if (number3 == 0)
			zeroValuesNumbers = ++zeroValuesNumbers;
		
		if (number3 > 0)
			positiveNumbers = ++positiveNumbers;
		
		if (number3 < 0)
			negativeNumbers = ++negativeNumbers;
		
		// check number4
		if (number4 == 0)
			zeroValuesNumbers = ++zeroValuesNumbers;
		
		if (number4 > 0)
			positiveNumbers = ++positiveNumbers;
		
		if (number4 < 0)
			negativeNumbers = ++negativeNumbers;
		
		// check number5
		if (number5 == 0)
			zeroValuesNumbers = ++zeroValuesNumbers;
		
		if (number5 > 0)
			positiveNumbers = ++positiveNumbers;
		
		if (number5 < 0)
			negativeNumbers = ++negativeNumbers;
		
		System.out.printf("%nTotal positive numbers enter is:%d%n", positiveNumbers);
		System.out.printf("Total negative numbers enter is:%d%n", negativeNumbers);
		System.out.printf("Total zero value numbers enter is:%d%n", zeroValuesNumbers);
		
		
	}// end main method
}// end class NegativePositiveAndZeroValues
