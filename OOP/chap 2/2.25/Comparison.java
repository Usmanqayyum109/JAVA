import java.util.Scanner;

public class Comparison
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int number1;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		

		
		if (number1 % 2 == 0 )
			System.out.printf("%d is even number ", number1 );
		else
			System.out.printf("%d is odd number ", number1 );
		
		
	}
}