package code.src.startingoutwithjava.chapter3afirstlookatclassesandobjects.rectangle;
import java.util.Scanner;

public class LenDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle();

        box.setLength(10.0);
        box.setWidht(20.0);

        System.out.println("The lenght of the box is: " + box.getLenght()
                + " and the width of the box is: " + box.getWidht());

        System.out.println("The area of the box is " + box.getArea());
    }
}
