package code.src.classprojects.shapes;

public class Trapezium extends Shapes {
    private double base1,
            base2,
            side1,
            side2,
            height;

    /**
     * initilizes all the fields
     * 
     * @param base1  holds the value for base1 field.
     * @param base2  holds the value for base2 field.
     * @param side1  holds the value for side1 field.
     * @param side2  holds the value for side2 field.
     * @param height holds the value for the height field.
     */
    public Trapezium(double base1, double base2, double side1, double side2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public void setbase1(double base1) {
        this.base1 = base1;
    }

    public void setbase2(double base2) {
        this.base2 = base2;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * @return the base1 field.
     */
    public double getBase1() {
        return base1;
    }

    /**
     * @return the base2 field.
     */
    public double getBase2() {
        return base2;
    }

    /**
     * @return the side1 field.
     */
    public double getSide1() {
        return side1;
    }

    /**
     * @return the side2 field.
     */
    public double getSide2() {
        return side2;
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
        return ((height * (base1 + base1)  ) / 2.0);
    }

    /**
     * overrides the method declared in the abstract class Shape
     */
    public double perimeter() {
        return base1 + base2 + side1 + side2;
    }
}
