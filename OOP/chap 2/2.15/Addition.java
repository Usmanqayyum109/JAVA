import java.util.Scanner;

public class Addition
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		int product;
		int difference;
		int quotient;  //division
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2 ;
		
		System.out.printf("Sum is %d%n", sum);
		
		product = number1 * number2 ;
		
		System.out.printf("Product is %d%n", product);
		
		difference = number1 - number2 ;
		
		System.out.printf("Difference is %d%n", difference);
		
		quotient = number1 / number2 ;
		
		System.out.printf("Quotient is %d%n", quotient);
	}
}