// Exercises 2.34: WorldPopulationGrowthCalculator.java
// create program that inputs current world population
// and annual world population growth rate
// then display the estimated population 
// after one, two, three, four and five years
import java.util.Scanner; // program uses class Scanner

public class WorldPopulationGrowthCalculator
{
	
	// main method begins execution of java application
	public static void main(String[]args)
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		long currentWorldPopulation;// current world population to add
		
		// annual world population growth rate to add
		float annualWorldPopulationGrowthRate;
		
		System.out.print("Enter current world population: ");// prompt
		// read current world population from user
		currentWorldPopulation = input.nextLong();
		
		System.out.print("Enter annual world population growth rate: ");// prompt
		// read annual world population growth rate from user
		annualWorldPopulationGrowthRate = input.nextFloat();
		
		// after 1 years
		float after1 = 
			currentWorldPopulation * annualWorldPopulationGrowthRate / 100;
		after1 = after1 + currentWorldPopulation;
		
		// after 2 years
		float after2 = 
			after1 * annualWorldPopulationGrowthRate / 100;
		after2 = after2 + after1;
		
		// after 3 years
		float after3 = 
			after2 * annualWorldPopulationGrowthRate / 100;
		after3 = after3 + after2;
		
		// after 4 years
		float after4 = 
			after3 * annualWorldPopulationGrowthRate / 100;
		after4 = after4 + after3;
		
		// after 5 years
		float after5 = 
			after4 * annualWorldPopulationGrowthRate / 100;
		after5 = after5 + after4;
		
		System.out.printf("After 1 years world population estimated is: %.6f%n",
			after1);
			
		System.out.printf("After 2 years world population estimated is: %.6f%n",
			after2);
			
		System.out.printf("After 3 years world population estimated is: %.6f%n",
			after3);
			
		System.out.printf("After 4 years world population estimated is: %.6f%n",
			after4);
			
		System.out.printf("After 5 years world population estimated is: %.6f%n",
			after5);
			
			
	}// end main method
}// end class WorldPopulationGrowthCalculator