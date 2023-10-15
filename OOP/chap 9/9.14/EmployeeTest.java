public class EmployeeTest extends Employee
{

		
		private double grossSales;
	    private double commissionRate;
	    private double baseSalary;
		
		
		public EmployeeTest (String firstName, String lastName,
		String socialSecurityNumber, double
	  grossSales, double commissionRate,double  baseSalary)
	  { 
	      super(firstName,lastName,socialSecurityNumber);
	  
		      if (grossSales < 0.0)
				  throw new IllegalArgumentException("Gross sale must be >= 0.0 ");
			  
			  if ( commissionRate <= 0.0 || commissionRate >= 1.0)
                  throw new IllegalArgumentException("Commision rate must be  > 0.0 and 1.0 ");
			  if (baseSalary <0.0)
				  throw new IllegalArgumentException("Base salary must be >=0.0");
			  
			  this.grossSales = grossSales;
              this.commissionRate = commissionRate;  
              this.baseSalary = baseSalary;
	  }
	
	
		  public void  setGrossSales(double grossSales)
		  {
			  if (grossSales < 0.0)
				  throw new IllegalArgumentException("Gross sale must be >=0.0");
			this .grossSales = grossSales; 
		  }
		  public double getGrossSales()
		  {
			  return grossSales;
		  }
		  
		  public void setCommissionRate(double commissionRate)
		  {
			  if (commissionRate <=0.0 || commissionRate >=1.0)
				  throw new IllegalArgumentException("Commission Rate must be >0.0 and <1.0 ");
			  this.commissionRate = commissionRate;
		  }
		  public double getCommissionRate()
		  {
			  return commissionRate;
		  }
		  public void setBaseSalary(double baseSalary)
		  {
			  if (baseSalary < 0.0)
				  throw new IllegalArgumentException("Base salary must be >= 0.0");
			  this.baseSalary = baseSalary;
		  }
		  public  double getBaseSalary()
		  {
			  return baseSalary;
		  }
		  public double earnings()
		  {
			  return baseSalary+(commissionRate * grossSales);
		  }
		  
		  
		   @Override
		  public String toString()
		  {
			  return String.format("%s:   %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
			  "base-salary commission employee",super.toString(), 
			  "grossSales", grossSales,"commission rate",commissionRate,
			   "base salary", baseSalary);
			  
		  }
	}