import java.util.Scanner;

public class GasMileage
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		 int miles;
		 int gallon;
		
		System.out.println("Enter the Miles Driven:");
		miles = input.nextInt();
		
		System.out.println("Enter Gallon used:");
		gallon = input.nextInt();
		
		 double result() {
			double result = miles * gallon;
			return result;
		};

			System.out.printf("Per miles gallon used is %.2f", result());
	}
}