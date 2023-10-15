public class Time002Test
{
	public static void main(String[]args)
	{
		Time002 t1 = new Time002();
		Time002 t2 = new Time002(2);
		Time002 t3 = new Time002(21,34);
		Time002 t4 = new Time002(23,59,59);
		Time002 t5 = new Time002(t4);
		
		System.out.println("constructed with:");
		displayTime("t1: all default arguments",t1);
		displayTime("t2: hour specified; default minute and second",t2);
		displayTime("t3: hour and minute specified; default  second",t3);
		displayTime("t4: hour,minute and second specified ",t4);
		displayTime("t5: Time02 object t4 specified",t5);
		
		t4.incrementHour();
		t4.incrementMinute();
		t4.incrementSecond();
		displayTime("when calling the all increment  methods:",t4);
		
		
		
		try
		{
			Time002 t6 =new Time002(27,74,99);
		}
		
		catch(IllegalArgumentException e)
		{
			System.out.printf("%nException while initiallizing t6: %s%n",e. getMessage());
		}
	}
	
		private static void displayTime(String header, Time002 t)
	{
		System.out.printf("%s%n    %s%n    %s%n",     
		    header,t.toUniversalString(),t.toString());
	}
}
