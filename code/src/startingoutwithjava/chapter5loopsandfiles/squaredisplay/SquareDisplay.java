package code.src.startingoutwithjava.chapter5loopsandfiles.squaredisplay;
import java.util.Scanner;
/**
 * This program uses the Square class.
 */
public class SquareDisplay {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int side;
        System.out.print("Enter the side of the Square: ");
        side = read.nextInt();

        Square square = new Square(side);

        System.out.println("");
        square.display();

        read.close();
    }
    
}
