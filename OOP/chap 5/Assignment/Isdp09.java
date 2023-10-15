import java.util.Scanner;

public class Isdp09{
	
public static void main(String []args)
{
Scanner input= new Scanner(System.in);

double totalValues=0.0;

double amount;

double rate=40.0;


System.out.print("ENTER YOUR GOLD ");

int gold=input.nextInt();

System.out.print("ENTER YOUR SILVER ");

int silver=input.nextInt();

System.out.print("ENTER YOUR CASH");

int cash=input.nextInt();

System.out.print("ENTER YOUR MT ");

int mt=input.nextInt();

//int sum=(gold*100000+silver*15000+mt+cash)/40;

 totalValues=(gold*100000+silver*15000+mt+cash);

//System.out.printf("%n%.2f%n",totalValues);

System.out.printf("%s%20s%n", "YEAR ", " TOTAL VALUES AND ZAKAT");


for (int YEAR=1; YEAR<=10; ++YEAR){
	
	amount=totalValues * Math.pow(rate ,YEAR);
	
	System.out.printf("%4d%,40.2f%n",YEAR,amount);
}



}
}