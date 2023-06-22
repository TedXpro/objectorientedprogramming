package code.src.startingoutwithjava.practice.shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ch;
        char c;
        Scanner read = new Scanner(System.in);
        do {
            int choice;
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            choice = read.nextInt();

            if (choice == 1) {
                double radius;
                System.out.print("Enter the radius: ");
                radius = read.nextDouble();

                Circle circle = new Circle(radius);

                System.out.println("Perimeter: " + circle.perimeter());
                System.out.println("Area: " + circle.area());
            } else {
                double lenght, width;
                System.out.print("Enter Length: ");
                lenght = read.nextDouble();
                System.out.println("Enter Width: ");
                width = read.nextDouble();

                Rectangle rectangle = new Rectangle(width, lenght);

                System.out.println("Perimeter: " + rectangle.perimeter());
                System.out.println("Area: " + rectangle.area());
            }

            read.nextLine();
            System.out.print("Do you want to continue: Y/n: ");
            ch = read.nextLine();
            c = ch.charAt(0);
        } while (c == 'Y' || c == 'y');
        read.close();
        System.out.println("Thank you!");
    }
}
