// Exercises 2.33: BodyMassIndexCalculator.java
// create program that inputs weight in pounds and 
// height in inches then display BMI value
import java.util.Scanner; // program uses class Scanner

public class BodyMassIndexCalculator
{
	// main method begins execution of java application
	public static void main(String[]args)
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		float weight;// weight to add
		float height;// height to add
		
		float BMI;// add BMI value
		
		System.out.print("Enter your weight in pounds: ");// prompt
		weight = input.nextFloat();// read weight from user
		
		System.out.print("Enter your height in inches: ");// prompt
		height = input.nextFloat();// read height from user
		
		BMI = (weight * 703) / (height * height)  ;// calculate BMI value
		
		System.out.printf("Your BMI value is: %.2f%n", BMI);
		
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("OverWeight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater ");
	}// end main method
}// end class BodyMassIndexCalculator