// Exercise. 3.17: HealthProfileTest.java
import java.util.Scanner;

public class HealthProfileTest
{
	public static void main(String[] args)
	{
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		HealthProfile person = new HealthProfile("Usman", "Qayyum", "Male", "10/09/1999", 1.65, 77);
	
	// Display First Name
	System.out.printf("%nYour First Name is %s.%n", person.getFirstName());
	
	// Display Last Name
	System.out.printf("Your Last Name is %s.%n", person.getLastName());
	
	// Display Gender
	System.out.printf("Your Gender is %s.%n", person.getGender());
	
	// Display Date Of Birth
	System.out.printf("Your Date Of Birth :%s.%n", person.getDateOfBirth());
	
	// Display Height
	System.out.printf("Your Height:%.2f.%n", person.getHeight());
	
	// Display Weight
	System.out.printf("Your Weight:%.2f.%n", person.getWeight());
	
	// Display Heart Rate
	System.out.printf("Your Heart Rate: %.2f.%n", person.heartRate());
	
	// Display Target Heart Rate
	System.out.printf("Your Target Heart Rate: %.2f.%n", person.targetHeartRate());
	
	// Display BMI
	System.out.printf("Your BMI:%.2f.%n", person.BMI());
	
	
	System.out.print("\nEnter Your First Name:");
	String firstName = input.nextLine();
	person.setFirstName(firstName);
	
	
	System.out.print("\nEnter Your Last Name:");
	String lastName = input.nextLine();
	person.setLastName(lastName);
	
	System.out.print("\nEnter Your First Gender:");
	String gender = input.nextLine();
	person.setGender(gender);
	
	System.out.print("\nEnter Your Data Of Birth(For Example:01/01/2001):");
	String dateOfBirth = input.nextLine();
	person.setDateOfBirth(dateOfBirth);
	
	System.out.print("\nEnter Your Weight(Kg):");
	double weight = input.nextDouble();
	person.setWeight(weight);
	
	System.out.print("\nEnter Your Height(Meter):");
	double height = input.nextDouble();
	person.setHeight(height);
	
	// Display First Name
	System.out.printf("%nYour First Name is %s.%n", person.getFirstName());
	
	// Display Last Name
	System.out.printf("Your Last Name is %s.%n", person.getLastName());
	
	// Display Gender
	System.out.printf("Your Gender is %s.%n", person.getGender());
	
	// Display Date Of Birth
	System.out.printf("Your Date Of Birth :%s.%n", person.getDateOfBirth());
	
	// Display Height
	System.out.printf("Your Height:%.2f.%n", person.getHeight());
	
	// Display Weight
	System.out.printf("Your Weight:%.2f.%n", person.getWeight());
	
	// Display Heart Rate
	System.out.printf("Your Heart Rate: %.2f.%n", person.heartRate());
	
	// Display Target Heart Rate
	System.out.printf("Your Target Heart Rate: %.2f.%n", person.targetHeartRate());
	
	// Display BMI
	System.out.printf("Your BMI:%.2f.%n", person.BMI());
	
   }
	
}