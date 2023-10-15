public class CommissionEmployee extends Employee
{
	private double grossSales;
	private double commissinoRate;
	
	public CommissionEmployee(String firstName, String lastName,
	String socialSecurityNumber, double grossSales, double commissinoRate)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (commissinoRate <= 0.0 || commissinoRate >= 1.0)
			throw new IllegalArgumentException(
		         "Commission rate must be > 0.0 and < 1.0");
				 
		if (grossSales < 0.0)
            throw new IllegalArgumentException(
		          "Gross sales must be >= 0.0");

		this.grossSales = grossSales;
		this.commissinoRate = commissinoRate;
		
	}
	
	public void setGrossSales(double grossSales)
	{
		if (grossSales < 0.0)
            throw new IllegalArgumentException(
		          "Gross sales must be >= 0.0");
				  
		this.grossSales = grossSales;		  
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public void setCommissionRate(double commissinoRate)
	{
		if (commissinoRate <= 0.0 || commissinoRate >= 1.0)
			throw new IllegalArgumentException(
		         "Commission rate must be > 0.0 and < 1.0");
				 
		this.commissinoRate = commissinoRate;		 
	}
	
	public double getCommissionRate()
	{
		return commissinoRate;
	}
	
	@Override
	public double earnings()
	{
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %s%n%s: $%,.2f %s: %.2f",
		"Commission employee",super.toString(),
		"gross sales", getGrossSales(),
		"commissino rate",getCommissionRate());
	}
}