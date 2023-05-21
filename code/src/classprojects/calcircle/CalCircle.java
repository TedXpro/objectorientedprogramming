package code.src.classprojects.calcircle;

import java.util.Scanner;
import code.src.classprojects.circle.Circle;

public class CalCircle {
    public static void main(String[] args) {
        int n;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of circles: ");
        n = read.nextInt();

        Circle circle[] = new Circle[n];

        for (int i = 0; i < n; i++) {
            double radius;
            System.out.println("Enter the radius of the circle: ");
            radius = read.nextDouble();

            circle[i] = new Circle(radius);
            circle[i].display();
        }
        read.close();
    }
}
