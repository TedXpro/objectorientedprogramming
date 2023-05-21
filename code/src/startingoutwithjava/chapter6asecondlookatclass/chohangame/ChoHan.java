package code.src.startingoutwithjava.chapter6asecondlookatclass.chohangame;

import java.util.Scanner;

public class ChoHan {
    public static void main(String[] args) {
        final int MAX_ROUNDS = 5;
        String player1Name;
        String player2Name;

        Scanner read = new Scanner(System.in);

        System.out.print("Enter the name of the first player: ");
        player1Name = read.nextLine();
        System.out.print("Enter the name of the second player: ");
        player2Name = read.nextLine();

        Dealer dealer = new Dealer();

        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

        for (int round = 0; round < MAX_ROUNDS; round++) {
            System.out.println("----------------------------");
            System.out.printf("Now Playing roung %d.\n",
                    round + 1);

            dealer.rollDice();

            player1.makeGuess();
            player2.makeGuess();

            roundResults(dealer, player1, player2);
        }
        displayGrandWinner(player1, player2);
    }

    /**
     * The roundResuts method determines the results of
     * the current round.
     * @param dealer The Dealer object
     * @param player1 Player #1 object
     * @param player2 Player #2 object
     */
    public static void roundResults(Dealer dealer, Player player1, Player player2) {
        System.out.printf("The dealer rolled %d and %d.\n",
                dealer.getDie1Value(), dealer.getDie2Value());
        System.out.printf("Result: %s\n", dealer.getChoOrHan());

        checkGuess(player1, dealer);
        checkGuess(player2, dealer);
    }

    /**
     * The checkGuess mehtod checks a player's guess against
     * the dealer's result. The parameters are: 
     * @param player The Player object to check.
     * @param dealer The Dealer object.
     */
    public static void checkGuess(Player player, Dealer dealer) {
        final int POINTS_TO_ADD = 1;
        String guess = player.getGuess();
        String choHanResult = dealer.getChoOrHan();

        System.out.printf("The player %s guessed %s.\n",
                player.getName(), player.getGuess());

        if (guess.equalsIgnoreCase(choHanResult)) {
            player.addPoints(POINTS_TO_ADD);

            System.out.printf("Awarding %d point(s) to %s.\n",
                    POINTS_TO_ADD, player.getName());
        }
    }

    /**
     * The displayGrandWinner meth displays the game result
     * @param player1 Player #1
     * @param player2 Player #2
     */
    public static void displayGrandWinner(Player player1, Player player2) {
        System.out.println("-------------------------------");
        System.out.println("Game over. Here are the results:");
        System.out.printf("%s: %d points.\n", player1.getName(),
                player1.getPoints());
        System.out.printf("%s: %d points.\n", player2.getName(),
                player2.getPoints());

        if (player1.getPoints() > player2.getPoints())
            System.out.println(player1.getName() +
                    " is the grand winner!");
        else if (player2.getPoints() > player1.getPoints())
            System.out.println(player2.getName() +
                    " is the grand winner!");
        else
            System.out.println("Both players are tied!");
    }

}
