public class Time02Test
{
	public static void main(String[]args)
	{
		Time02 t1 = new Time02();
		Time02 t2 = new Time02(2);
		Time02 t3 = new Time02(21,34);
		Time02 t4 = new Time02(12,25,42);
		Time02 t5 = new Time02(t4);
		
		System.out.println("constructed with:");
		displayTime("t1: all default arguments",t1);
		displayTime("t2: hour specified; default minute and second",t2);
		displayTime("t3: hour and minute specified; default  second",t3);
		displayTime("t4: hour,minute and second specified ",t4);
		displayTime("t5: Time02 object t4 specified",t5);
		
		try
		{
			Time02 t6 =new Time02(27,74,99);
		}
		
		catch(IllegalArgumentException e)
		{
			System.out.printf("%nException while initiallizing t6: %s%n",e. getMessage());
		}
	}
	
		private static void displayTime(String header, Time02 t)
	{
		System.out.printf("%s%n    %s%n    %s%n",     
		    header,t.toUniversalString(),t.toString());
	}
}
