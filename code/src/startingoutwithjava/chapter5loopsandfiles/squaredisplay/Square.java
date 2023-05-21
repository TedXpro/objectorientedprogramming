package code.src.startingoutwithjava.chapter5loopsandfiles.squaredisplay;
/**
 * defining a class that displays square.
 */
public class Square {
    private int sides;

    public Square(int sides) {
        this.sides = sides;
    }

    public void display() {
        for (int row = 0; row < sides; row++) {
            for (int col = 0; col < sides; col++) {
                System.out.print("X");
            }
            System.out.println("");
        }
    }
    
}