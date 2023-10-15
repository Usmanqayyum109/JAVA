// Exercise. 3.11: WithDrawalTest.java
// Inputting and outputting floating-point numbers with WithDrawalTest 
// objects.
import java.util.Scanner;

public class WithDrawalTest
{
	public static void main(String []args)
	{
		WithDrawal account1 = new WithDrawal("Jane Green", 50.00);
		WithDrawal account2 = new WithDrawal("Jane Blue", -7.53);
		
		// display initial balance of each object
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
			account2.getName(), account2.getBalance());
			
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account1 balance%n%n",
			depositAmount);
		account1.depositAmount(depositAmount); // add to account1's balance
		
		// display balances
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
			account2.getName(), account2.getBalance());
			
			
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n",
			depositAmount);
		account2.depositAmount(depositAmount); // add to account2's balance
		
		// display balances
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
			account2.getName(), account2.getBalance());
			
		// withdrawal amount for account1
		System.out.print("Enter withdrawal amount for account1:");
		double withDrawal = input.nextDouble();
		System.out.printf("%n%.2f withdrawal amount to account1 balance%n%n",
			withDrawal);
		account1.withdrawal(withDrawal);
		// display balances
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
			account2.getName(), account2.getBalance());
			
		// withdrawal amount for account2
		System.out.print("Enter withdrawal amount for account2:");
		 withDrawal = input.nextDouble();
		System.out.printf("%n%.2f withdrawal amount to account2 balance%n%n",
			withDrawal);
		account2.withdrawal(withDrawal);
		// display balances
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n",
			account2.getName(), account2.getBalance());
		
		
	} // end main
} // end class WithDrawalTest