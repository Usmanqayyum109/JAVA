/**                                   UML
		     _______________________________________________________ 
		    |                     WithDrawal                       |
            |______________________________________________________|
            |                                                      |
            |-name:String  		                                   |
            |-balance:double                                       |
            |______________________________________________________|
            |                                                      |
            |<<constructor>>Withdrawal(name:String, balance:double)|
            |+deposit(depositAmount : double)                      |
            |+getBalance() : double                                |
            |+setName(name : String)                               |
            |getName() : String                                    |
            |+Withdrawal(WithdrawalAmount : double)                |
            |______________________________________________________|       */



// Exercise. 3.11: WithDrawal.java
// Add one withdrawl method in fig. 3.8 to perform its task

public class WithDrawal
{
	private String name; // instance variable
	private double balance; // instance variable
	
	// WithDrawal constructor that recives two parameters
	public WithDrawal(String name, double balance)
	{
		this.name = name; // assign name to instance variable name
		
		// validate that the balance is greater then 0.0; if it's not,
		// instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0) // if the balance is validate
			this.balance = balance; // assign it to instance variable balance
	}
	
	// method that deposits (adds) only a valid amount to the balance
	public void depositAmount(double depositAmount)
	{
		if (depositAmount > 0.0) // if the deposit amount is valid
			balance = balance + depositAmount; // add it to the balance
	}
	
	// method returns the account balance
	public double getBalance()
	{
		return balance;
	}
	
	
	// method that withdrawl the money from an Account
	public void withdrawal(double withdrawalAmount)
	{
		// if the withdrawlAmount less than balance
		if (withdrawalAmount > balance) 
		    System.out.print("Withdrawal amount exceeded account balance./n");
		else
		    balance = balance - withdrawalAmount;// remove it to the balance
		 
	}
	
	
	// method that sets the name
	public void setName(String name)
	{
		this.name = name;
	}
	
	// method returns the name
	public String getName()
	{
		return name; // give value of name back to caller
	} // end method getName
} // end class WithDrawal
			
			