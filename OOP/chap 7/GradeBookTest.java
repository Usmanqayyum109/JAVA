public class GradeBookTest
{
	public static void main(String[]args)
	{
		int[] gradesArraay = {87,68,94,100,83,78,85,91,76,87};
		
		GradeBook myGradeBook = new GradeBook(
		"CS101 Introduction to java programming",gradesArraay);
		
		System.out.printf("Welcome to the grade book java for%n%s%n%n",
		  myGradeBook.getCourseName());
		myGradeBook.processGrades();  
		  
	}
}