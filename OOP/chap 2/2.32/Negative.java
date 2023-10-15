import java.util.Scanner;

public class Negative
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		int negative = 0;
		int positive = 0;
		int zero = 0;
		
		System.out.print("Enter first integer number ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer number ");
		number2 = input.nextInt();
		
		System.out.print("Enter third integer number ");
		number3 = input.nextInt();
		
		System.out.print("Enter forth integer number ");
		number4 = input.nextInt();
		
		System.out.print("Enter fifth integer number ");
		number5 = input.nextInt();
		
		if (number1 < 0)
			negative = negative + 1;
		
		if (number2 < 0)
			negative = negative + 1;
		
		if (number3 < 0)
			negative = negative + 1;
		
		if (number4 < 0)
			negative = negative + 1;
		
		if (number5 < 0)
			negative = negative + 1;
		
		
		
		if (number1 > 0)
			positive = positive + 1;
		
		if (number2 > 0)
			positive = positive + 1;
		
		if (number3 > 0)
			positive = positive + 1;
		
		if (number4 > 0)
			positive = positive + 1;
		
		if (number5 > 0)
			positive = positive + 1;
		
		
		
		
		if (number1 == 0)
			zero = zero + 1;
		
		if (number2 == 0)
			zero = zero + 1;
		
		if (number3 == 0)
			zero = zero + 1;
		
		if (number4 == 0)
			zero = zero + 1;
		
		if (number5 == 0)
			zero = zero + 1;
		
		System.out.printf("Total Positive:%d%n", positive);
		System.out.printf("Total Negative:%d%n", negative);
		System.out.printf("Total Zero:%d", zero);
		
	}
}