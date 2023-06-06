package code.src.classprojects.shapes;

public class Hexagon extends Shapes {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public Hexagon(double side) {
        this.side = side;
    }

    public double perimeter() {
        return 6 * side;
    }

    public double area() {
        return (((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2));
    }

}
