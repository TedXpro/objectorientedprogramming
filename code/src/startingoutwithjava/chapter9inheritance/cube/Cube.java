package code.src.startingoutwithjava.chapter9inheritance.cube;

import code.src.startingoutwithjava.chapter3afirstlookatclassesandobjects.rectangle.Rectangle;

/**
 * This class holds data about cube.
 * extends the Rectangle class. 
 */
public class Cube extends Rectangle{
    private double height;

    /**
     * This consturctor initializes the fields.
     * @param height holds the height of cube.
     * @param length holds the length of the cube.
     * @param width holds the width of the cube.
     */
    public Cube(double height, double length, double width) {
        super(length, width);
        this.height = height;
    }

    /**
     * @return the height field.
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return the calculated surface area of the cube.
     */
    public double getSurfaceArea() {
        return getArea() * 6;
    }
    
    /**
     * @return the calculated volume of the cube.
     */
    public double getVolume() {
        return height * getArea();
    }
}
