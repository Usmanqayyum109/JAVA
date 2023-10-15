// Exercises 2.28: DiameterCircumfernceAndAreaOfCircle.java
// create program that inputs one integer the radius of circle
// then display diameter, circumference and area of circle 
 
import java.util.Scanner; // program uses class Scanner

public class DiameterCircumfernceAndAreaOfCircle
{
	// main method begins execution of java application
	public static void main(String[]args)
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		int radius;// radius to add
		
		System.out.print("Enter radius of circle: ");// prompt
		radius = input.nextInt();// read radius from user
		
		// display diameter of circle
		System.out.printf("%nDiameter of circle is %d.%n", (2 * radius));
		
		// display circumference of circle
		System.out.printf("Circumference of circle is %.2f.%n", (2 * 3.14 * radius));
		
		// display area of circle
		System.out.printf("Area of circle is %.2f.%n", (3.14 * (radius * radius)));
		
		
	}// end main method
}// end class DiameterCircumfernceAndAreaOfCircle