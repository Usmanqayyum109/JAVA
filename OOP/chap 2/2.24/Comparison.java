import java.util.Scanner;

public class Comparison
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		int smallest;
		int largest;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		number3 = input.nextInt();
		
		System.out.print("Enter forth integer: ");
		number4 = input.nextInt();
		
		System.out.print("Enter fifth integer: ");
		number5 = input.nextInt();
		
		smallest = number1;
		
		if (number2 <= smallest)
			smallest = number2;
		
		if (number3 <= smallest)
			smallest = number3;
		
		if (number4 <= smallest)
			smallest = number4;
		
		if (number5 <= smallest)
			smallest = number5;
		System.out.printf("%d is smallest %n",smallest);
		
		largest = number1;
		
		if (number2 >= largest)
			largest = number2;
		
		if (number3 >= largest)
			largest = number3;
		
		if (number4 >= largest)
			largest = number4;
		
		if (number5 >= largest)
			largest = number5;
		System.out.printf("%d is largest %n",largest);
	}
}