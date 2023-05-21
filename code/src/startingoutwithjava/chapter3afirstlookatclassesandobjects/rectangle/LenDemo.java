package code.src.startingoutwithjava.chapter3afirstlookatclassesandobjects.rectangle;

public class LenDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(12.0,3.0);

        box.setLength(10.0);
        box.setWidth(20.0);

        System.out.println("The lenght of the box is: " + box.getLenght()
                + " and the width of the box is: " + box.getWidth());

        System.out.println("The area of the box is " + box.getArea());
    }
}
