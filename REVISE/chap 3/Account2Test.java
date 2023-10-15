// Fig. 3.9: Account2Test.java
// Inputting and outputting floating-point numbers with Account2 objects.
import java.util.Scanner;

public class Account2Test
{
	public static void main(String []args)
	{
		Account2 account1 = new Account2("Jane Green", 50.00);
		Account2 account2 = new Account2("Jane Blue", -7.53);
		
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
	} // end main
} // end class Account2Test