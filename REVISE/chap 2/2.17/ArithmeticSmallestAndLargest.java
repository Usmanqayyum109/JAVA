// Exercises 2.17: ArithmeticSmallestAndLargest.java
// Arithmetic,smallest and largest program that inputs three numbers
// then display their sum, average, product , smallest and largest
import java.util.Scanner; // program uses class Scanner

public class ArithmeticSmallestAndLargest
{
	// main method begins execution of java application
	public static void main(String[]args)
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		int number1;// first number to add
		int number2;// second number to add
		int number3;// third number to add
		
		int sum;// sum of number1,number2 and number3
		int product;// product of number1,number2 and number3
		int average;// average of number1,number2 and number3
		
		System.out.print("Enter first integer number: ");// prompt
		number1 = input.nextInt();// read first number from user
		
		System.out.print("Enter second integer number: ");// prompt
		number2 = input.nextInt();// read second number from user
		
		System.out.print("Enter third integer number: ");// prompt
		number3 = input.nextInt();// read third number from user
		
		int largest = number1;// number1 value assign to largest
		int smallest = number1;// number1 value assign to smallest
		
		// add numbers, then store total in sum
		sum = number1 + number2 + number3;
		System.out.printf("sum is %d%n", sum);
		
		// product numbers, then store total in product
		product = number1 * number2 * number3;
		System.out.printf("product is %d%n", product);
		
		// average numbers, then store total in average
		average = (number1 + number2 + number3) / 3;
		System.out.printf("average is %d%n", average);
		
		if (number2 > largest)
			largest = number2;
		
		if (number3 > largest)
			largest = number3;
		
		System.out.printf("largest number is %d%n", largest);
		
		if (number2 < smallest)
			smallest = number2;
		
		if (number3 < smallest)
			smallest = number3;
		
		System.out.printf("smallest number is %d%n", smallest);
	}// end main method
}// end class ArithmeticSmallestAndLargest