public class HeartRatesTest
{
	public static void main(String[]args)
	{
		HeartRates person = new HeartRates(9,10,1999);
		
		person.setFirstName("USMAN");
		System.out.printf("Your first name is %s%n",person.getFirstName());
	
	
		person.setLastName("QAYYUM");
		System.out.printf("Your last name is %s%n",person.getLastName());
		
		
		System.out.printf("Your date of birth is %s%n",person.getDateOfBirth());
		
		
		System.out.printf("Your age in year %d%n",person.getAge());
		
		person.setHeartRate(220);
		System.out.printf("Your maximum heart in beats per minute is %d%n",
			person.getHeartRate());
			
		System.out.printf("Your target heart in a range is %.2f to %.2f%n ",
			person.getTargetHeartRate(),person.getTargetHeartRate1());			
	}
}