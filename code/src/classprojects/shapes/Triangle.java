package code.src.classprojects.shapes;

public class Triangle extends Shapes {
    private double base,
            length,
            height;

    /**
     * initialize the fields.
     * 
     * @param base   holds the value for the base field.
     * @param height holds the value for the height field.
     */
    public Triangle(double base, double length, double height) {
        this.height = height;
        this.length = length;
        this.base = base;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public void setLenght(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the base field.
     */
    public double getBase() {
        return base;
    }

    /**
     * @return the length field.
     */
    public double getLength() {
        return length;
    }

    /**
     * @return the height field.
     */
    public double getHeight() {
        return height;
    }

    /**
     * overrides the method declared in the abstract class Shape
     */
    public double area() {
        return (base * height) / 2;
    }

    /**
     * overrides the method declared in the abstract class Shape
     */
    public double perimeter() {
        return length + base + height;
    }
}
