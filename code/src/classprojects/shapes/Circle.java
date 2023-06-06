package code.src.classprojects.shapes;

public class Circle extends Shapes{
    private double radius;
    private static final double PI;
    
    /**
     * Declares the Final variable PI when the object is loaded.
     */
    static {
        PI = 3.14;
    }

    /**
     * Declares the radius field.
     * @param radius holds the value for the radius field.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return the radius field.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * overrides the method declared in the abstract class Shape
     */
    public double area() {
        return PI * radius * radius;
    }

    /**
     * overrides the method declared in the abstract class Shape
     */
    public double perimeter() {
        return 2 * PI * radius;
    }
}
