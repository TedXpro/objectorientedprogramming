package code.src.classprojects.shapes;

public class Ellipse extends Shapes {
    private double base,
            axis;
    private final static double PI = 3.14;

    public Ellipse(double base, double axis) {
        this.axis = axis;
        this.base = base;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public void setAxis(double axis) {
        this.axis = axis;
    }

    public double getBase() {
        return base;
    }

    public double getAxis() {
        return axis;
    }

    public double area() {
        return PI * base * axis;
    }

    public double perimeter() {
        double t = Math.pow(axis - base, 2);
        double v = Math.pow(axis + base, 2);
        double p = PI * (axis + base) * (3 * (t/ v * (Math.sqrt(-3*t/v + 4) + 10)) + 1);
        return p;
    }
}
