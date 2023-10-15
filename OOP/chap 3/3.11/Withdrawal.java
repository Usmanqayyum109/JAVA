public class Withdrawal
{
	private String name;
	private double balance;
	
	public Withdrawal(String name, double balance)
	{
		this.name = name;
		
		if (balance > 0.0)
			this.balance = balance;
	}
	
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setWithdrawal(double withdrawal)
	{
		if (withdrawal > balance)
			System.out.println("Withdrawal amount exceeded account balance\n");
		else
			balance = balance - withdrawal;
	}
	
	public double getWithdrawal()
	{
		return balance;
	}
}