// Exercises 2.35: Car_PoolSavingsCalculator.java
// create program that inputs five integers (total miles driven per day,
// cost per gallon of gasoline, average miles per gallon,
// parking fees per day and tolls pre day) then calculate daily driving cost
// then display reults
import java.util.Scanner; // program uses class Scanner

public class Car_PoolSavingsCalculator
{
	
	// main method begins execution of java application
	public static void main(String[]args)
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		float totalMilesDrivenPerDay;// total miles driven per day to add
		int costPerGallonOfGasoline;// cost per gallon of gasoline to add
		float averageMilesPerGallon;// average miles per gallon to add
		int parkingFeesPerDay;// parking fees per day and to add
		int tollsPerDay;// tolls pre day to add
		
		System.out.print("Enter total miles driven per day: ");// prompt
		// read total miles driven per day from user
		totalMilesDrivenPerDay = input.nextFloat();
		
		System.out.print("Enter cost per gallon of gasoline: ");// prompt
		// read cost per gallon of gasoline from user
		costPerGallonOfGasoline = input.nextInt();
		
		System.out.print("Enter average miles per gallon: ");// prompt
		// read average miles per gallon from user
		averageMilesPerGallon = input.nextFloat();
		
		System.out.print("Enter parking fees per day: ");// prompt
		// read parking fees per day from user
		parkingFeesPerDay = input.nextInt();
		
		System.out.print("Enter tolls pre day: ");// prompt
		// read tolls pre day  from user
		tollsPerDay = input.nextInt();
		
		float drivingCost = 
			totalMilesDrivenPerDay * costPerGallonOfGasoline;
			
		System.out.printf("%nYour daily driving cost is:%.4f%n", drivingCost);
		
		
	}// end main method
}// end class Car-PoolSavingsCalculator
