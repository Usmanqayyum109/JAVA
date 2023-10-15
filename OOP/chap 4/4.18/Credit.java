import java.util.Scanner;

public class Credit
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int accountNum;
		int balance;
		int totalItem;
		int totalCredits;
		int creditLimit;
		int newBalance;
		
		System.out.print("Enter your account number: ");
		accountNum = input.nextInt();
		
		System.out.print("Enter balance at the beginning of the month: ");
		balance = input.nextInt();
		
		System.out.print("Enter total of all items chargrd by the customer's account this month: ");
		totalItem = input.nextInt();
		
		System.out.print("Enter total of all credits applied to the customer's account this month: ");
		totalCredits = input.nextInt();
		
		System.out.print("Enter allowed credit limit: ");
		creditLimit = input.nextInt();
		
		newBalance = balance + totalItem - totalCredits;
		
		if (newBalance <= creditLimit)
			System.out.printf("Your new balance is: %d%s", newBalance);
		else
			System.out.println("Credit limit exceeded");
	}
}