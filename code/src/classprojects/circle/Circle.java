package code.src.classprojects.circle;

public class Circle {
    private final static double PI = 3.14;
    private double radius;
    private double area;
    private double cir;

    public Circle(double radius){
        this.radius = radius;
    }

    private void area(){
        area = (PI * radius * radius);
    }

    private void circumference(){
        cir = (2 * PI * radius);
    }

    public void display() {
        area();
        circumference();
        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + cir);
    }
}
