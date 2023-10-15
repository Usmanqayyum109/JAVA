import java.util.Scanner;

public class Largest
{
	public static void main(String[]args)
	{
		
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int num;
		
		System.out.print("Enter your integer number");
		num = input.nextInt();
		
		
		
		int largest = num;
		
		
		
		while (counter <= 9)
		{
			System.out.print("Enter your integer number");
		num = input.nextInt();
		counter++;
		    if (num > largest)
				largest = num;
		}
		System.out.printf("your largest number is: %d",largest);
	}
}