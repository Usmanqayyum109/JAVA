import java.util.Scanner;

public class Product
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int result;
		
		System.out.printf("Enter first integer: ");
		x = input.nextInt();
		
		System.out.printf("Enter  second integer: ");
		y = input.nextInt();
		
		System.out.printf("Enter third integer: ");
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.printf("Product is %d%n",result);
	}
}