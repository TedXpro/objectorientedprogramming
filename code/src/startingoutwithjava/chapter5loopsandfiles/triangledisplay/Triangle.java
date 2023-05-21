package code.src.startingoutwithjava.chapter5loopsandfiles.triangledisplay;
import javax.swing.text.Style;

/**
 * Definition of a class that displays a triangle.
 */
public class Triangle {
    private int side;

    public Triangle(int side) {
        this.side = side;
    }

    public void rightAngle() {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void leftAngle() {
        for (int row = 0; row < side; row++) {
            for (int space = side; space > row; space--)
                System.out.print(" ");

            for (int col = 0; col >= row; col++)
                System.out.println("*");

            System.out.println("");
        }
    }
}
