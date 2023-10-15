import java.util.Scanner;

public class StudentTest
{
public static void main(String [] args)
{
	Student isdp = new Student("maqbool",20.5,67);
	
	System.out.printf("%s%n%.2f%n%d%n",
	isdp.getName(),isdp.getAge(),isdp.getMarks()
	);
	Scanner input= new Scanner(System.in);
	
	 System.out.print("Enter Your Name"); 
	 String name=input.nextLine();
	 isdp.setName(name);
	 
	  System.out.print("Enter Your Age");
	 double age=input.nextDouble();
	 isdp.setAge(age);
	 
	  System.out.print("Enter Your Marks");
	 int marks=input.nextInt();
	 isdp.setMarks(marks);
	 
	 
	 
	 System.out.printf("YOUR NAME IS %s%n.", isdp.getName());
	 
	 System.out.printf("YOUR CURRENT AGE IS  %.2f%n.", isdp.getAge());
	 
	 System.out.printf("YOUR TOTAL MARKS IS %d%n.", isdp.getMarks());
}
}