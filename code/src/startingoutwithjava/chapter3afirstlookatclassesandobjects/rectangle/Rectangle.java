package code.src.startingoutwithjava.chapter3afirstlookatclassesandobjects.rectangle;


/**
 * Rectangle class phase 1
 * under Construction!
 */

public class Rectangle {
    private double length;
    private double width;

    /**
     * Initializes the fields.
     * 
     * @param length holds the value of length.
     * @param width  holds the value of width.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * The SetLenght method assigns value to the length varible.
     * 
     * @param len holds the value when the object calls the method.
     */
    public void setLength(double len) {
        length = len;
    }

    /**
     * sets the width field.
     * 
     * @param w holds the value for the widht.
     */
    public void setWidth(double w) {
        width = w;
    }

    /**
     * @return the length field.
     */
    public double getLenght() {
        return length;
    }

    /**
     * @return the width field.
     */
    public double getWidth() {
        return width;
    }

    /**
     * @return the calculated area.
     */
    public double getArea() {
        return length * width;
    }
}