package code.src.startingoutwithjava.chapter6asecondlookatclass.chohangame;

import java.util.Random;

public class Player {
    private String name;
    private String guess;
    private int points;

    /**
     * used to assign the name of the player.
     * 
     * @param playerName holds the name of the player
     */
    public Player(String playerName) {
        name = playerName;
        guess = "";
        points = 0;
    }

    /**
     * Causes the player to make a guess either Cho or Han.
     */
    public void makeGuess() {
        Random rand = new Random();

        int guessNumber = rand.nextInt(2);

        if (guessNumber == 0)
            guess = "Cho (even)";
        else
            guess = "Han (odd)";
    }

    public void addPoints(int newPoints) {
        points += newPoints;
    }

    public String getName() {
        return name;
    }

    public String getGuess() {
        return guess;
    }

    public int getPoints() {
        return points;
    }
}
