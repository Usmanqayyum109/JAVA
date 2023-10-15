import java.util.Scanner;

public class Car_pool
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		double drive;
		double gasoline;
		double average;
		double parking;
		double tolls;
		double dailyDrivingCost;
		
		System.out.print("Total miles driven per day: ");
			drive = input.nextDouble();
			
		System.out.print("Cost per gallon of gasoline: ");
			gasoline = input.nextDouble();
			
		System.out.print("Average miles per day: ");
			average = input.nextDouble();
			
		System.out.print("Parking fees per day: ");
			parking = input.nextDouble();
			
		System.out.print("Tolls per day: ");
			tolls = input.nextDouble();
			
		dailyDrivingCost = parking + tolls + (
			(average / drive) * gasoline);
			
		System.out.printf("Your daily driving cost is  %.2f",dailyDrivingCost);
	}
}