import java.util.Scanner;

public class WithdrawalTest
{
	public static void main(String[]args)
	{
		Withdrawal account1 = new Withdrawal("Fazal", 50.00);
		Withdrawal account2 = new Withdrawal("Musa", -7.53);
		
		System.out.printf("%s balance: $%.2f%n",
		account1.getName(),account1.getBalance());
		
		System.out.printf("%s balance: $%.2f%n%n",
		account2.getName(),account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		
		System.out.printf("%nadding %.2f to account1 balance%n%n",
			depositAmount);
			
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n",
		account1.getName(),account1.getBalance());
		
		System.out.printf("%s balance: $%.2f%n%n",
		account2.getName(),account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		 depositAmount = input.nextDouble();
		 
		System.out.printf("%nadding %.2f to account2 balance%n%n",
			depositAmount);
			
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n",
		account1.getName(),account1.getBalance());
		
		System.out.printf("%s balance: $%.2f%n%n",
		account2.getName(),account2.getBalance());
		
		
		System.out.print("Enter withdraw amount for account1: ");
		 double withdrawal = input.nextDouble();
		
		System.out.printf("%nwithdraw %.2f to account1 balance%n%n",
			withdrawal);
			
		account1.setWithdrawal(withdrawal);
		
		System.out.printf("%s balance: $%.2f%n",
		account1.getName(),account1.getWithdrawal());
		
		System.out.print("\nEnter withdraw amount for account2: ");
		  withdrawal = input.nextDouble();
		
		System.out.printf("%nwithdraw %.2f to account2 balance%n%n",
			withdrawal);
			
		account2.setWithdrawal(withdrawal);
		
		System.out.printf("%s balance: $%.2f%n",
		account2.getName(),account2.getWithdrawal());

	}
}
