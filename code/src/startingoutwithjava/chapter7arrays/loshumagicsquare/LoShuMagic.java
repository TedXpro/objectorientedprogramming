package code.src.startingoutwithjava.chapter7arrays.loshumagicsquare;

import java.util.Scanner;

/**
 * This class accepts a 2D array and checks if an 
 * array is a Lo Shu Magic Square.
 */
public class LoShuMagic {
    private final int SIZE = 3;
    private int[][] numbers = new int[SIZE][SIZE];

    /**
     * Accepts the elements of the 2D array.
     */
    public void setNumbers() {
        Scanner read = new Scanner(System.in);
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                System.out.print("Enter the value of " + row + col + ": ");
                numbers[row][col] = read.nextInt();
            }
        }
        read.close();
    }

    /**
     * Checks if the 2D array is a Lo Shu Magic Square.
     * @return true if the array is a Lo Shu Magic Square.
     */
    private boolean checkLoShuMagic() {
        final int t = numbers[0][0] + numbers[0][1] + numbers[0][2];

        // checking each row.
        int total;
        for (int row = 0; row < SIZE; row++) {
            total = 0;
            for (int col = 0; col < SIZE; col++)
                total += numbers[row][col];
            System.out.println(total);
            if (total != t)
                return false;
        }

        // testing each row.
        for (int col = 0; col < SIZE; col++) {
            total = 0;
            for (int row = 0; row < SIZE; row++)
                total += numbers[row][col];
            System.out.println(total);

            if (total != t)
                return false;
        }

        // checking the diagonal
        total = 0;
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (row == col)
                    total += numbers[row][col];
            }
        }
        System.out.println(total);
        if (total != t)
            return false;

        // checking the diagonal
        total = 0;
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (row + col == 2)
                    total += numbers[row][col];
            }
        }
        System.out.println(total);

        if (total != t)
            return false;

        return true;
    }

    /**
     * gets the Numbers array.
     * @return the 2D array.
     */
    public int[][] getNumbers() {
        return numbers;
    }

    /**
     * Displays the result.
     */
    public void display() {
        if (checkLoShuMagic() == true)
            System.out.println("The array is a Lu Shi Magic Square!!:)");
        else
            System.out.println("The array is not a Lu shi Magic Square!!:(");
    }
}