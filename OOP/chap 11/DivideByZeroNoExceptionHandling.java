import java.util.Scanner;

public class DivideByZeroNoExceptionHandling
{
	public static int quoient(int numerator, int denominator)
	{
		return numerator / denominator;
	}
	
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter integer numerator: ");
		int numerator = scanner.nextInt();
		
		System.out.print("Please enter integer denominator: ");
		int denominator = scanner.nextInt();
		
		int result = quoient(numerator, denominator);
		
		System.out.printf(
			"%nResult: %d / %d = %d%n",numerator, denominator, result);
		
	}
}