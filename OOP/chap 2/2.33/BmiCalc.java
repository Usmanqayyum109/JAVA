import java.util.Scanner;

public class BmiCalc
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int weight;
      int height;
      int bmi;

      System.out.print("\nEnter the integer value of your weight in pounds: ");
      weight = input.nextInt();

      System.out.print("Enter the integer value of your height in inches: ");
      height = input.nextInt();

      bmi = (weight * 703) / (height * height);

      System.out.printf("\nYour BMI is %d\n", bmi);

      System.out.println("\nCheck your BMI against the chart below\n");

      System.out.println("BMI VALUES");
      System.out.println("Underweight: less than 18.5");
      System.out.println("Normal:      between 18.5 and 24.9");
      System.out.println("Overweight:  between 25 and 29.9");
      System.out.println("Obese:       30 or greater\n");
   }
}