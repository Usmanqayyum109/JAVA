// Fig. 4.5: StudentTest.java
// Create and test Student Objects
public class StudentTest
{
	public static void main(String []arsg)
	{
		Student account1 = new Student("MUSA", 93.59);
		Student account2 = new Student("ESA", 72.75);
		
		System.out.printf("%s 's letter grade is: %s%n",
			account1.getName(), account1.getLetterGrade());
		System.out.printf("%s 's letter grade is: %s%n",
			account2.getName(), account2.getLetterGrade());
	}
}