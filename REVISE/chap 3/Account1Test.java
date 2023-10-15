// Fig. 3.6: Account1Test.java
// Using the Account constructor to initialize the name instance
// Variable at the name each Account object is created.

public class Account1Test
{
	public static void main(String[]args)
	{
		// create two Account objects
		Account1 account1 = new Account1("Jane Green");
		Account1 account2 = new Account1("Jane Blue");
		
		// display initial value of name for each Account
		System.out.printf("account1 name is: %s%n", account1.getName());
		System.out.printf("account2 name is: %s%n", account2.getName());
	}
} // end class Account1Test