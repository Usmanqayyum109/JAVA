public class HourlyEmployee extends Employee1
{
	

		private double hour;
		private double wage;
		
		public HourlyEmployee(String firstName,String lastName, String socialSecurityNumber,
	    double hour,double wage)
		{
			super(firstName,lastName,socialSecurityNumber);
			
			if(hour < 0 || hour > 168)
			{
				throw new IllegalArgumentException("hour between 0 to 168 only.");
			}
			
			if(wage < 0)
			{
				throw new IllegalArgumentException("wage is not less then 0");
			}
			this.hour = hour;
			this.wage = wage;
		}
		 
		 public void setHour(double hour)
		 {
			if(hour < 0 || hour > 168)
			{
				throw new IllegalArgumentException("hour between 0 to 168 only.");
			} 
			 
			 this.hour = hour;
		 }
		 public double getHour()
		 {
			 return hour;
		 }
		 public void setWage(double wage)
		 {
			if(wage < 0)
			{
				throw new IllegalArgumentException("wage is not less then 0");
			}
              this.wage = wage;			
			 
		 }
		 public double getWage()
		 {
			 return wage;
		 }
		 public double earning()
		 {
			 return hour * wage;
		 }
		  
		  @Override
		  public String toString()
		  {
			  return String.format("%s %n%s: %.2f %n%s:%.2f %n%s:%.2f",super.toString(),
			  "total your working hours",hour,"total wages",wage,"your earnings",earning());
		  }
	}