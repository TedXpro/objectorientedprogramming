package code.src.classprojects.shapes;

public class Rectangle extends Shapes {
    private double length;
    private double width;

    /**
     * Assign the fields
     * @param length holds the value for the length field
     * @param width holds the value for the width field.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * @return the length field
     */
    public double getLength() {
        return length;
    }

    /**
     * @return the width field
     */
    public double getWidth() {
        return width;
    }

    /**
     * overrides the method declared in the abstract class Shape
     */
    public double area() {
        return length * width;
    }

    /**
     * overrides the method declared in the abstract class Shape
     */
    public double perimeter() {
        return 2 * (length + width);
    }

}
