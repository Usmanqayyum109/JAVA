import java.util.Scanner;// import Scanner class

public class SmallestValue// start class
{
public static void main(String[]args)// start main
{
int a;// a int type  variable declare

int b;// b int type  variable declare

int c;// c int type  variable declare

Scanner input=new Scanner(System.in);// input from user by key board

System.out.printf("Enter value 1: ");// print message1

 a=input.nextInt();// save input to variable a
 
 System.out.printf("Enter value 2: ");// print message2

 b=input.nextInt();// save input to variable b
 
 System.out.printf("Enter value 3: ");// print message3

 c=input.nextInt();// save input to variable c
 // start if condition
 if (a>b){
	 
	 System.out.printf("Enter value 2 is smallest  %d%n ",b);
 }
 else if (a>c){
	 System.out.printf("Enter value 3 is smallest  %d%n",c);
 }
 else
	 System.out.printf("Enter value 1 is  smallest  %d%n",a);// if condition end
	 
}// end main

}// end class