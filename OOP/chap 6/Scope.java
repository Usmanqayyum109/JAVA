public class Scope
{
	
	private static  int x = 10;
	
public static void main(String[]args)
{
	
	
int x = 9;

System.out.printf("local x is main is %d%n",x);


useLocalVariable();
useField();
useLocalVariable();
useField();

System.out.printf("%nlocal x in main is %d%n",x);
}
public static void useLocalVariable()
{
	int x = 65;
	System.out.printf("%nlocal x on entering method useLocalVariable is %d%n",x);
	++x;
	System.out.printf("local x before exiting method useLocalVariable is %d%n",x);
}

public static void useField()
{
	
System.out.printf("%nfield x on entering method useFeild is %d%n",x);	

x*=40;

System.out.printf("%nfield x before exiting method useFeild is %d%n",x);
}

/*public static void usePower()
{
	x+=10;
System.out.printf("%nfield x on entering method useFeild is %d%n",x);	
}*/
}

