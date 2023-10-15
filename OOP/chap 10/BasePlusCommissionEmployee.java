public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double basesalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName,
	String socialSecurityNumber, double grossSales,
	double commissinoRate, double basesalary)
	{
		super(firstName, lastName, socialSecurityNumber,
		grossSales, commissinoRate);
		
		if (basesalary < 0.0)
			throw new IllegalArgumentException(
		        "Base salary must be >= 0.0");
				
		this.basesalary = basesalary;		
		}
		
	public void setBaseSalary(double basesalary)
	{
		if (basesalary < 0.0)
			throw new IllegalArgumentException(
		        "Base salary must be >= 0.0");
				
		this.basesalary = basesalary;		
	}
	
	public double getBaseSalary()
	{
		return basesalary;
	}
	
	@Override
	public double earnings()
	{
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s; %s: $%,.2f",
		"base_salaried", super.toString(),
		"base salary", getBaseSalary());
	}
}