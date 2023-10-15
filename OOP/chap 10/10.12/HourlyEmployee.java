public class HourlyEmployee extends Employee 
{
  private double hours;
  private double wage;

  
  public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
  Date birthDay, double hours,double wage) 
  {
    super(firstName, lastName, socialSecurityNumber, birthDay);

    if (hours < 0.0 || hours > 168.00)
      throw new IllegalArgumentException(
          "hours worked must be >=0.0 and <168.00");


    if (wage < 0.0)
      throw new IllegalArgumentException(
          "wage must be >=0.0");

    this.hours = hours;
    this.wage = wage;
  }

  public void setHours(double hours) 
  {
    if (hours < 0.0 || hours > 168.00)
      throw new IllegalArgumentException("hours must be >=0.0 and <168.00");
    this.hours = hours;
  }

  
  public void setWage(double wage) {
    if (wage < 0.0)
      throw new IllegalArgumentException("wage must be >0.0");
    this.wage = wage;
  }

  
  public double getHours() 
  {
    return hours;
  }

  
  public double getWage() 
  {
    return wage;
  }


  @Override
  public double earnings() 
  {
    if (getHours() <= 40)
      return getHours() * getWage();
    else
      return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
  }

  
  @Override
  public String toString() {
    return String.format("%s%s%n%s: %.2f%n%s: %.2f",
        "HourlyEmployee: ",super.toString(),
        "Hour worked", getHours(),
        "hours Wage", getWage());
  }
}