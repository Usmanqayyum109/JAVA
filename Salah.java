import java.util.Scanner;

public class Salah
{
public static void main(String[]args)
{
	int f=0;
	
	int z=0;
	
	int a=0;
	
	int m=0;
	
	int i=0;
	
	int salat=0;
	
	int totall=0;
	
	int jareh=0;
Scanner input=new Scanner(System.in);

System.out.printf("Enter number between 0 and 5: ");

//int total1=input.nextInt();

while (input.hasNext()){
	
	//int totall=input.nextInt();
	
	//System.out.printf("Enter number between 0 and 5: ");
	
	int total=input.nextInt();
	salat+=total;
	
	//System.out.printf("%n%d",salat);
	
	switch (salat/1){
		
		case 1:
		++f;
		break;
		case 2:
		++z;
		break;
		case 3:
	    ++a;
		break;
		case 4:
		++m;
		break;
		case 5:
		++i;
		break;
		
		//System.out.printf("%n%d",salat);
	
	}
	
	System.out.printf("%n%d",salat);
}


}
}