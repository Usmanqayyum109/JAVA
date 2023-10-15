public class Date
{
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year)
	{
		if (month < 13)
			this.month = month;
		
		if (day < 32)
			this.day = day;
		
		if (year < 2023)
			this.year = year;
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
	
	public String DisplayDate()
	{
		return day + "/" + month + "/" + year;
	}
}