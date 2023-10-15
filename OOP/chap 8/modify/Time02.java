public class Time02
{
	private int TS;
	
	public Time02()
	{
		this(0,0,0);
	}
	public Time02(int hour)
	{
		this(hour,0,0);
	}
	public Time02(int hour,int minute)
	{
		this(hour,minute,0);
	}
	public Time02(int hour,int minute,int second)
	{
		if (hour <0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		
		if (minute <0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		
		if (second <0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		
		TS = hour*60*60+minute*60+second;

	}
	
	public Time02(Time02 time)
	{
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
	
	public void setTime(int hour,int minute,int second)
	{
				if (hour <0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		
		if (minute <0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		
		if (second <0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		

		TS = hour*60*60+minute*60+second;
	}
	
	public void setHour(int hour)
	{
		if (hour <0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		
		TS += hour*60*60;
	}
	
		public void setMinute(int minute)
	{
						if (minute <0 && minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		
		    TS += minute*60;
	}
	
           public void setSecond(int second)
	{
						if (second >=0 && second < 60)
			throw new IllegalArgumentException("second must be 0-59");
		
		TS += second;
	}
	
	public int getHour()
	{
		return TS/3600;
	}
	
		public int getMinute()
	{
		return TS %3600/60;
	}
	
		public int getSecond()
	{
		return TS %3600%60;
	}
	
	public String toUniversalString()
	{
		return String.format(
		"%02d:%02d:%02d",getHour(),getMinute(),getSecond());
	}
	
	public String toString()
{
	   return String.format("%d:%02d:%02d %s", 
   ((getHour() == 0 ||getHour()==12)? 12 :getHour()% 12),
   getMinute(),getSecond(), (getHour() < 12 ? "AM": "PM"));

}
}