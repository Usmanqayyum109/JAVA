// Exercise. 3.15: RemovingDuplicatedCodeTest.java

import java.util.Scanner;

public class RemovingDuplicatedCodeTest
{
	public static void main(String []args)
	{
		RemovingDuplicatedCode account1 = new RemovingDuplicatedCode("Jane Green", 50.00);
		RemovingDuplicatedCode account2 = new RemovingDuplicatedCode("Jane Blue", -7.53);
		
		
		displayAccount(account1);
		displayAccount(account2);
		
	} // end main
	
	public static void displayAccount(RemovingDuplicatedCode accountToDisplay)
	{
	System.out.printf("%n%s balance: $%.2f%n",
			accountToDisplay.getName(), accountToDisplay.getBalance());
			
	
			
	}
} // end class RemovingDuplicatedCode


