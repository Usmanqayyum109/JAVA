public class Intrest
{
	public static void main(String[]args)
	{
		double amount;
		double principal = 1000.0;
		double rate = 0.00;
		
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
		for (int r = 5; r <= 10; r++)
		{
			rate = r;
			System.out.printf("Rate of interest %.2f%%\n", rate);
		
	        for (int year = 1; year <= 10; ++year)
		    {
			    amount = principal * Math.pow(1.0 + rate,year);
			
			    System.out.printf("%4d%,20.2f%n", year, amount);
		    }
		}
	}
}