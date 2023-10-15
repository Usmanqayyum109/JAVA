import java.util.Scanner;

public class Circle
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int r;
		
		System.out.print("Enter circle number ");
		r = input.nextInt();
		
		float diameter = 2 * r;
		
		double circumference = 2 * Math.PI * 2;
		
		double area = Math.PI * 2 * 2;
		
		System.out.printf("Diameter is %.2f%nCircumference is %.2f%nArea is %.2f",
		diameter, circumference, area);
	}
}