package code.src.classprojects.shapes;

public class Rhombus extends Rectangle {
    private double diagonal1,
            diagonal2;

    public Rhombus(double side, double diagonal1, double diagonal2) {
        super(side, side);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public double area() {
        return (diagonal1 * diagonal2) / 2.0;
    }
}
