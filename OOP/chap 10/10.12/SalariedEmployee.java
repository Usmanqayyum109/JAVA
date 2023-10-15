public class SalariedEmployee extends Employee 
{
  private double weeklySalary;

  public SalariedEmployee(String firstName, String lastName,String socialSecurityNumber,
  Date birthDay, double weeklySalary) 
  {
    super(firstName, lastName, socialSecurityNumber,birthDay);

    if (weeklySalary < 0.0)
      throw new IllegalArgumentException("weeklySalary must be >=0.0");
    this.weeklySalary = weeklySalary;
  }

  public void setWeeklySalary(double weeklySalary) 
  {
    if (weeklySalary < 0.0)
      throw new IllegalArgumentException("weeklySalary must be >=0.0");
    this.weeklySalary = weeklySalary;
  }

  public double getWeeklySalary() 
  {
    return weeklySalary;
  }

 
  @Override
  public double earnings() 
  {
    return getWeeklySalary();
  }

 
  @Override
  public String toString() 
  {
    return String.format("SalariedEmployee: %s%n%s: $%,.2f",
        super.toString(),
        "weeklySalary", getWeeklySalary());
  }
}