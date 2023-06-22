package code.src.startingoutwithjava.practice.shape;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double w, double len){
        width = w;
        length = len;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}
