import java.util.Scanner;

public class Student1Test
{
    public static void main(String args[]){

    Student s1= new Student("muzaffar",70.54);

System.out.printf("%n%s%n%.2f%n",
   s1.getName(),s1.getAverage()
);

Scanner both= new Scanner(System.in);

System.out.print("ENTER YOUR NAME");
String name=both.nextLine();
s1.setName(name);

System.out.print("ENTER YOUR AVERAGE");
double ave=both.nextDouble();
s1.setAverage(ave);



System.out.printf("YOUR NAME IS %s%n " ,s1.getName());

System.out.printf("YOUR LETTER GRADE IS:%s%n",s1.getLetterGrade());



}


}