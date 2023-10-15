public class HeartRates
{
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private int month;
	private int day;
	private int year;
	private int heartRate;
	

	public HeartRates(int month, int day, int year)
	{
		if (month < 13)
			this.month = month;
		
		if (day < 32)
			this.day = day;
		
		if (year < 2023)
			this.year = year;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setMonth(int month)
	{
		if (month < 13)
			this.month = month;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setDay(int day)
	{
        if (day < 32)
			this.day = day;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setYear(int year)
	{
		if (year < 2023)
			this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setDateOfBirth(int dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getDateOfBirth()
	{
		return  month +"/"+ day +"/"+ year;
	}
	
	public void setAge(int year)
	{
		this.year = year;
	}
	
	public int getAge()
	{
		return 2022 - year;
	}

	public void setHeartRate(int heartRate)
	{
		this.heartRate = heartRate;
	}
	
	public int getHeartRate()
	{
		return heartRate =  heartRate - getAge(); 
	}
	

	
	public double getTargetHeartRate()
	{
		return heartRate *50 /100;
	}
	
	public double getTargetHeartRate1()
	{
		return heartRate * 85 / 100;
	}
}