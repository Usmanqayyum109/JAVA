public class HealthProfileTest
{
	public static void main(String[]args)
	{
		HealthProfile person = new HealthProfile(
			"USMAN","QAYYUM","Male",10,9,1999,5.4,158.733);
		System.out.printf("Your first name is %s%nYour last name is %s%n",
				person.getFirstName(),person.getLastName());
				
		System.out.printf("Your gender is %s%nYour date of birth is %s%n",
				person.getGender(),person.getDateOfBirth());
				
		System.out.printf("Your age in year %d%n",person.getAge());
		
		person.setHeartRate(220);
		System.out.printf("Your maximum heart in beats per minute is %d%n",
			person.getHeartRate());
			
		System.out.printf("Your target heart in a range is %.2f to %.2f%n",
			person.getTargetHeartRate(),person.getTargetHeartRate1());

	    System.out.printf("Your BMI report is %.2f%n",person.getBmi());  			
	}
}