import java.util.Scanner;

public class Comparison
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		

		
		if (number1 % number2 == 0 )
			System.out.printf("%d is multiple of %d %n ", number1, number2 );
		else
			System.out.printf("%d is is not multiple of %d ", number1, number2 );
		
		
	}
}