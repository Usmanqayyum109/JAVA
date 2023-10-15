// Exercises 2.25: OddOrEven.java
// create program that inputs one integer then display 
// whether the number is odd or even
import java.util.Scanner; // program uses class Scanner

public class OddOrEven
{
	// main method begins execution of java application
	public static void main(String[]args)
	{
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		int number1;// first number to add
		
		System.out.print("Enter first integer number: ");// prompt
		number1 = input.nextInt();// read first number from user
		
		int mod = number1 % 2; // number1 mod 2 and store to mod variable
		
		if (mod == 0)
			System.out.printf("%d%n is even.", number1);
		else
			System.out.printf("%d is odd.", number1);
	}// end main method
}// end class OddOrEven