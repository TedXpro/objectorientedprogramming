package code.src.classprojects.shapes;

public class Pentagon extends Shapes {
    private double side;

    public Pentagon(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double area() {
        return 1 / 4 * (Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) * Math.pow(side, 2);
    }

    public double perimeter() {
        return 5 * side;
    }

}
