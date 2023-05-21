package code.src.startingoutwithjava.chapter5loopsandfiles.triangledisplay;

import java.util.Scanner;

/**
 * This program uses the Triangle class to
 * display shapes of a traingle.
 */
public class TriangleDisplay {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int choice;
        System.out.println("Choose your prefered shape");
        System.out.println("1. Right Angle Triangle");
        System.out.println("2. Left Angle Triangle");
        System.out.print("Enter your preference: ");
        choice = read.nextInt();

        int side;
        System.out.print("Enter the side of the traingle:");
        side = read.nextInt();

        Triangle triangle = new Triangle(side);
        if (choice == 1)
            triangle.rightAngle();
        else
            triangle.leftAngle();
        read.close();
    }

}
