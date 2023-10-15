public class HealthProfile
{
	private String firstName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private int day;
	private int month;
	private int year;
	private double height;  // in inches
	private double weight; // in pounds
	private int heartRate;
	
	
	public HealthProfile(String firstName, String lastName, String gender,
		int day, int month, int year, double height, double weight)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			
			if (month < 13)
			this.month = month;
		
		if (day < 32)
			this.day = day;
		
		if (year < 2023)
			this.year = year;
		
		if (height > 0.0)
			this.height = height;
		
		if (weight > 0.0)
			this.weight = weight;
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
	
	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getDateOfBirth()
	{
		return  month +"/"+ day +"/"+ year;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setHeight(double height)
	{
		if (height > 0.0)
			this.height = height;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setWeight(double weight)
	{
		if (weight > 0.0)
			this.weight = weight;
	}
	
	public double getWeight()
	{
		return weight;
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
	
	public double getBmi()
	{
		return (weight * 703) / (height * height);
	}
}