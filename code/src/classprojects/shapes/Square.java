package code.src.classprojects.shapes;

public class Square extends Rectangle {
    /**
     * @param sides holds the value for the sides field.
     */
    public Square(double sides) {
        super(sides, sides);
    }

    // /**
    //  * @return the sides field.
    //  */
    // public double getSides() {
    //     return sides;
    // }

    // /**
    //  * overrides the method declared in the abstract class Shape
    //  */
    // public double area() {
    //     return Math.pow(sides, 2);
    // }

//     /**
//      * overrides the method declared in the abstract class Shape
//      */
//     public double perimeter() {
//         return 4 * sides;
//     }
}
