 import java.util.Scanner; //program uses class Scanner
public class ZakatCalculate
 {
public static void main(String[] args)
{
Scanner total= new Scanner(System.in);
System.out.print("ENTER GOLD");

int gold = total.nextInt();

System.out.print("SELVER GOLD");

int selver = total.nextInt();

System.out.print("ENTER MT");

int mt = total.nextInt();

System.out.print("ENTER CASH");

int cash = total.nextInt();

double sum = (gold*150000 + selver*7000 + mt +cash)*0.025;

System.out.printf("zakat is %f%n",sum);
}
}