import java.util.Scanner;

public class Population
{
	public static void main(String[]args)
	{
	   Scanner input = new Scanner(System.in);

	   long currentPopulation;
	   double growthRate;
	   double estimated;
	   
	   System.out.print("Enter World Current Population: ");
	   currentPopulation = input.nextLong();
	   
	   System.out.print("Enter Annual Growth Rate: ");
	   growthRate = input.nextDouble();
	   
	   estimated = currentPopulation + (currentPopulation * growthRate / 100);
	   
	   System.out.printf("After 1 year world population estimated: %.2f%n",
	   estimated);
	   
	   estimated = estimated + (estimated * growthRate / 100);
	   
	   System.out.printf("After 2 year world population estimated: %.2f%n",
	   estimated);
	   
	   estimated = estimated + (estimated * growthRate / 100);
	   
	   System.out.printf("After 3 year world population estimated: %.2f%n",
	   estimated);
	   
	   estimated = estimated + (estimated * growthRate / 100);
	   
	   System.out.printf("After 4 year world population estimated: %.2f%n",
	   estimated);
	   
	   estimated = estimated + (estimated * growthRate / 100);
	   
	   System.out.printf("After 5 year world population estimated: %.2f%n",
	   estimated);
	   
	}
}