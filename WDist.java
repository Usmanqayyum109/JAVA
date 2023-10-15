import java.util.Random;

public class WDist {

    public static void main(String[] args) {
		if ( args.length != 4 )
		{
			System.out.println("Please provide  number_of_Players initital_balance cut_Off_Value zakat_on_off");
			System.exit(1);
		}
        int numPlayers = Integer.parseInt(args[0]);
		int initialBalance = Integer.parseInt(args[1]);
		int cutOffValue = Integer.parseInt(args[2]);
		int zakat = Integer.parseInt(args[3]);
		int rounds = 0;
        // Initialize the balances of each player
		int[] balances = new int[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            balances[i] = initialBalance;
        }

        // Initialize the random number generator
        Random rand = new Random();

        // Keep playing the game until there is only one player left
        while (numPlayers > 1) {
            // Pair up the players
            for (int i = 0; i < numPlayers; i++) {
                // Skip eliminated players
                if (balances[i] < cutOffValue) {
                    continue;
                }

                // Find a valid opponent
                int opponent;
                do {
                    opponent = rand.nextInt(numPlayers);
                } while (opponent == i || balances[opponent] < cutOffValue);

                // Determine the bet amount
                int betAmount = Math.min(balances[i], balances[opponent]) / 5;

                // Flip the coin and determine the winner
                boolean coinFlip = rand.nextBoolean();
                if (coinFlip) {
                    balances[i] += betAmount;
                    balances[opponent] -= betAmount;
                } else {
                    balances[i] -= betAmount;
                    balances[opponent] += betAmount;
                }

                // Print the results of the bet
                System.out.println("Player " + i + " (" + balances[i] + ") vs Player " + opponent + " (" + balances[opponent] + ")");
            }
			System.out.printf("This was round# %d\n", ++rounds);
            // Eliminate players with less than cutOffValue
            int numRemainingPlayers = 0;
            for (int i = 0; i < numPlayers; i++) {
                if (balances[i] >= cutOffValue) {
                    balances[numRemainingPlayers] = balances[i];
                    numRemainingPlayers++;
                } 
				else
                    System.out.println("Player " + i + " eliminated with balance " + balances[i]);
            }
            numPlayers = numRemainingPlayers;
        }
		System.out.printf("Game finished after %d rounds\n", rounds);
	}
}
