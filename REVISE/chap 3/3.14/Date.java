/**                                  UML
		     _______________________________________________________ 
		    |                         Date                         |
            |______________________________________________________|
            |                                                      |
            |-month:int  		                                   |
            |-day:int                                              |
			|-year: int                                            |
            |______________________________________________________|
            |                                                      |
            |<<constructor>>Date(month: int, day: int, year: int)  |
            |+setMonth(month : int)                                |
            |+getMonth() : int                                     |
            |+setDay(day : int)                                    |
            |getDay() : int                                        |
            |+setYear(year : int)                                  |
			|+getYear() : int                                      |
			|+displayDate() : int                                  |
            |______________________________________________________|       */
			

// Exercise. 3.14: Date.java
// Date class that displays date.
			
public class Date
{
	int month; // instance variable
	int day; // instance variable
	int year; // instance variable
	
	// create constructor that recives three parameter
	public Date(int month, int day, int year)
	{
		
		// validate that the month is less then 13; if it's not,
		// instance month  keeps its default initial value of 0
		if (month < 13) // if the month is validate
			this.month = month; // assign it to instance variable month
		
		// validate that the day is less then 32; if it's not,
		// instance day  keeps its default initial value of 0
		if (day < 32) // if the day is validate
			this.day = day; // assign it to instance variable day
		
		// validate that the year is less then 2024; if it's not,
		// instance year  keeps its default initial value of 0
		if (year < 2024) // if the year is validate
			this.year = year; // assign it to instance variable year
	}
	
	// method that sets the month
	public void setMonth(int month)
	{
		// validate that the month is less then 13; if it's not,
		// instance month  keeps its default initial value of 0
		if (month < 13) // if the month is validate
			this.month = month; // assign it to instance variable month
	}
	
	
	// method that return a value back to caller
	public int getMonth()
	{
		return month;
	}
	
	
	// method that sets the day
	public void setDay(int day)
	{
		// validate that the day is less then 32; if it's not,
		// instance day  keeps its default initial value of 0
		if (day < 32) // if the day is validate
			this.day = day; // assign it to instance variable day
	}
	
	
	// method that return a value back to caller
	public int getDay()
	{
		return day;
	}
	
	
	// method that sets the year
	public void setYear(int year)
	{
		// validate that the year is less then 2024; if it's not,
		// instance year  keeps its default initial value of 0
		if (year < 2024) // if the year is validate
			this.year = year; // assign it to instance variable year
	}
	
	
	// method that return a value back to caller
	public int getYear()
	{
		return year;
	}
	
	//method that displays the Date 
	public String displayDate()
	{

		return month + "/" +  day + "/"  + year;
		
	} //end method displayDate
} // end class Date