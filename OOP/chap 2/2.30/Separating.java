import java.util.Scanner;

public class Separating
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter five digits integer");
		num = input.nextInt();
		
		System.out.printf("%d   ", (num / 10000));
		System.out.printf("%d   ", (num / 1000) %10 );
		System.out.printf("%d   ", (num / 100) %10);
		System.out.printf("%d   ", (num % 100)  /10);
		System.out.printf("%d   ", (num % 10) );
	}
}