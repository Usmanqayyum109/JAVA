// Exercise. 3.16: RemovingDuplicatedCodeTest.java
import java.util.Scanner;
public class HeartRatesTest
{
	public static void main(String[]args)
	{
		
		// create Scanner Object
		Scanner input = new Scanner(System.in);
		
		HeartRates person1 = new HeartRates("USMAN", "QAYYUM"," 23/02/2002");
		
		//Display result
		System.out.printf("%nFirst Name is %s.%n%nLast Name is %s.%n%nDate Of Birth is %s.%n%n", 
			person1.getFirstName(), person1.getLastName(), person1.getDateOfBirth());
			
			
			
		System.out.print("\nEnter Your First Name:"); //prompt
		String fName = input.nextLine(); // obtain user input
		person1.setFirstName(fName); // call setFirstName method
		
		
		System.out.print("\nEnter Your Last Name:"); //prompt
		String lName = input.nextLine(); // obtain user input
		person1.setLastName(lName); // call setFirstName method
		
		System.out.print("\nEnter Your Date of Birth(For Exp:01/01/2001):"); //prompt
		String birth = input.nextLine(); // obtain user input
		person1.setDateOfBirth(birth); // call setFirstName method
		
		// Display result again
		System.out.printf("%nFirst Name is %s.%n%nLast Name is %s.%n%nDate Of Birth is %s.%n%n", 
			person1.getFirstName(), person1.getLastName(), person1.getDateOfBirth());
			
		System.out.printf("%nYour Maximam Heart Rate is %.2f.%n%nYour Target Heart Rate is %.2f.%n", 
			person1.personHeartRate(), person1.personTargetHeartRate());
		

		
		
		
	}
}