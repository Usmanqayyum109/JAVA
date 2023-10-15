import java.util.Scanner;

public class ClassAverage1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int total = 0;

        int gradeCounter = 0
		;

        System.out.print("ENTER GRADE OR -1 TO QUIT:");
        int grade = input.nextInt();

        while (grade != -1)
        {
	        total = total + grade;
	        gradeCounter = gradeCounter + 1;
	        System.out.print("ENTER GRADE OR -1 TO QUIT:");
	        grade = input.nextInt();
        }

        if (gradeCounter != 0)
        {
	        double average = (double) total / gradeCounter;
	        System.out.printf("%ntotal of the %d grades entered is %d%n",
				gradeCounter,total);
	        System.out.printf("%nclass average is %.2f%n",average);
        }
	    else 
		    System.out.println("No Grades Were Entered");
	}
}	


