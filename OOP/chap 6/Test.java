import java.security.SecureRandom;

public class Test
{
private static final
 SecureRandom randomNumbers = new SecureRandom();

private enum Status {CONTINUE,WON,LOST};

private static final int SNAKE_EYES = 2;

private static final int TREY= 3;

private static final int SEVEN = 7;

private static final int YO_LEVEN = 11;

private static final int BOX_CARS = 12;

public static void main(String[]args)
{
int myPoint = 0;

Status gameStatus;

int gamblerWin =0;

int casinoWin =0;

int firstRollWinForGambler =0;

int firstRollWinForCasino =0;

double gamblerMan =0;

double casinoMan =0;

for (int  man= 1; man <=9;man++)
{
	
int manGambler= amount();

int sumOfDice = rollDice();

switch (sumOfDice)

{
	case SEVEN:
	
	case YO_LEVEN:
	
	gameStatus= Status.WON;
	
	firstRollWinForGambler+=1;
	
	gamblerWin+=1;
	
	
	break;
	
	case SNAKE_EYES:
	
	case TREY: 
	
	case BOX_CARS:
	
	gameStatus= Status.LOST;
	
	casinoWin+=1;
	
	firstRollWinForCasino+=1;
	
	gamblerMan-=manGambler;
	
	casinoMan+=manGambler;
	
	break;
	
	default:
	
	gameStatus=Status.CONTINUE;
	
	myPoint= sumOfDice;
	
	System.out.printf("point is %d%n",myPoint);
	
	break;
	
}

while (gameStatus == Status.CONTINUE){
	
	sumOfDice = rollDice();
	
	if (sumOfDice == myPoint)
		
		{gameStatus = Status.WON;
	
		gamblerWin += 1;}
	
	else {
	
		if(sumOfDice == SEVEN)
			
			{gameStatus = Status.LOST;
		
			gamblerMan-=manGambler;
			
	        casinoMan+=manGambler;
			
			casinoWin+=1;
			}
}
}
if (gameStatus == Status.WON){
	
System.out.println("player wins");
}
else{
	System.out.println("player loses");
}
}
System.out.printf("RESULTS%n1)Gambler wins %d times, Casino wins %d times%n2)First roll wins for gambler : %d%n3)First roll wins for casino : %d%n4)Gambler has Rs %.2f%n5)Casino has Rs %.2f",gamblerWin,casinoWin,firstRollWinForGambler,firstRollWinForCasino,gamblerMan,casinoMan); 
    } 

public static int rollDice()
{
int die1 = 1 + randomNumbers.nextInt(6);

int die2 = 1 + randomNumbers.nextInt(6);	

int sum = die1 + die2;

System.out.printf("player rolled %d + %d = %d%n",die1,die2,sum);

return sum;
}
public static int amount()
{
        int amount = randomNumbers.nextInt(50,100);
		
        return amount;


}
}
