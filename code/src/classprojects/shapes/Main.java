package code.src.classprojects.shapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int choice;
        String ch;
        char chr;
        do {
            System.out.println("Enter your choice from the given alternatives");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Trapizum");
            System.out.println("4. Square");
            System.out.println("5. Trianlge");
            System.out.println("6. Ellipse");
            System.out.println("7. Hexagon");
            System.out.println("8. Pentagon");
            System.out.println("9. Rhombus");
            System.out.print("Enter your choice: ");
            choice = read.nextInt();

            Main m = new Main();
            if (choice == 1) {
                int c = m.chooseCalculation();

                double radius;
                System.out.print("Enter the radius of the circle: ");
                radius = read.nextDouble();

                Circle circle = new Circle(radius);

                System.out.println("The radius you entered is " + circle.getRadius());
                if (c == 1)
                    System.out.println("The circumference of the circle is " +
                            circle.perimeter() + " units.");

                else if (c == 2)
                    System.out.println("The area of the circle is " +
                            circle.area() + " squared units.");
                else {
                    System.out.println("The circumference of the circle is " +
                            circle.perimeter() + " units.");
                    System.out.println("The area of the circle is " +
                            circle.area() + " squared units.");
                }
            } else if (choice == 2) {
                int c = m.chooseCalculation();

                double length, width;
                System.out.print("Enter the length of the rectangle: ");
                length = read.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                width = read.nextDouble();

                Rectangle rectangle = new Rectangle(length, width);

                System.out.println("The length of the rectangle you entered is " + rectangle.getLength());
                System.out.println("The width of the rectangle you entered is " + rectangle.getWidth());
                if (c == 1)
                    System.out.println("The perimeter of the rectangle is " + rectangle.area() + " squared units");
                else if (c == 2)
                    System.out.println("The perimeter of the rectangle is " + rectangle.perimeter() + " units");
                else {
                    System.out.println("The perimeter of the rectangle is " + rectangle.area() + " squared units");
                    System.out.println("The perimeter of the rectangle is " + rectangle.perimeter() + " units");
                }
            } else if (choice == 3) {
                int c = m.chooseCalculation();

                double b1, b2, h, s1, s2;
                System.out.print("Enter the value for base1: ");
                b1 = read.nextDouble();
                System.out.print("Enter the value for base2: ");
                b2 = read.nextDouble();
                System.out.print("Enter the value for side1: ");
                s1 = read.nextDouble();
                System.out.print("Enter the value for side2: ");
                s2 = read.nextDouble();
                System.out.print("Enter the value for height: ");
                h = read.nextDouble();

                Trapezium t = new Trapezium(b1, b2, s1, s2, h);
                System.out.println("the value for base 1 is " + t.getBase1());
                System.out.println("The value for base 2 is " + t.getBase2());
                System.out.println("The value for side 1 is " + t.getSide1());
                System.out.println("The value for side 2 is " + t.getSide2());
                System.out.println("The value for height is " + t.getHeight());
                if (c == 1)
                    System.out.println("The Perimeter of the Trapezium is " + t.perimeter());
                else if (c == 2)
                    System.out.println("The Area of the Trapezium is " + t.area());
                else {
                    System.out.println("The Perimeter of the Trapezium is " + t.perimeter());
                    System.out.println("The Area of the Trapezium is " + t.area());
                }
            } else if (choice == 4) {
                int c = m.chooseCalculation();

                double sides;
                System.out.print("Enter the side of the square: ");
                sides = read.nextDouble();

                Square s = new Square(sides);

                System.out.println("The Sides of the square is " + s.getLength());
                if (c == 1)
                    System.out.println("The Perimeter of the Square is " + s.perimeter());
                else if (c == 2)
                    System.out.println("The Area of the Square is " + s.area());
                else {
                    System.out.println("The Perimeter of the Square is " + s.perimeter());
                    System.out.println("The Area of the Square is " + s.area());
                }
            } else if (choice == 5) {
                int c = m.chooseCalculation();

                double base, height, length;
                System.out.print("Enter the value for the base of the Triangle: ");
                base = read.nextDouble();
                System.out.print("Enter the value for the lenght of the Triangle: ");
                length = read.nextDouble();
                System.out.print("Enter the value for the height of the Triangle: ");
                height = read.nextDouble();

                Triangle triangle = new Triangle(base, length, height);

                System.out.print("The value for the base of the triangle is " + triangle.getBase());
                System.out.print("The value for the lenght of the triangle is " + triangle.getLength());
                System.out.print("The value for the height of the triangle is " + triangle.getHeight());
                if (c == 1)
                    System.out.println("The Perimeter of the Triangle is " + triangle.perimeter());
                else if (c == 2)
                    System.out.println("The Area of the triangle is " + triangle.area());
                else {
                    System.out.println("The Perimeter of the Triangle is " + triangle.perimeter());
                    System.out.println("The Area of the triangle is " + triangle.area());
                }

            } else if (choice == 6) {
                int c = m.chooseCalculation();
                double base, axis;
                System.out.print("Enter the value for base of the Ellipse: ");
                base = read.nextDouble();
                System.out.print("Enter the value for the axis of the Ellipse: ");
                axis = read.nextDouble();

                Ellipse ellipse = new Ellipse(axis, base);
                System.out.println("The base of the Ellipse if " + ellipse.getBase());
                System.out.println("The Axis of the Ellipse if " + ellipse.getAxis());
                if (c == 1)
                    System.out.println("The Perimeter of the Ellipse is " + ellipse.perimeter());
                else if (c == 2)
                    System.out.println("The Area of the Ellipse is " + ellipse.area());
                else {
                    System.out.println("The Perimeter of the Ellipse is " + ellipse.perimeter());
                    System.out.println("The Area of the Ellipse is " + ellipse.area());
                }

            } else if (choice == 7) {
                int c = m.chooseCalculation();
                double side;
                System.out.println("Enter the value for Side of the Hexagon: ");
                side = read.nextDouble();

                Hexagon hexagon = new Hexagon(side);
                System.out.println("The Side of the Hexagon if " + hexagon.getSide());
                if (c == 1)
                    System.out.println("The Perimeter of the Hexagon is " + hexagon.perimeter());
                else if (c == 2)
                    System.out.println("The Area of the Hexagon is " + hexagon.area());
                else {
                    System.out.println("The Perimeter of the Hexagon is " + hexagon.perimeter());
                    System.out.println("The Area of the Hexagon is " + hexagon.area());
                }

            } else if (choice == 8) {
                int c = m.chooseCalculation();
                double side;
                System.out.println("Enter the value for side of the Pentagon: ");
                side = read.nextDouble();

                Pentagon pentagon = new Pentagon(side);
                System.out.println("The side of the Pentagon if " + pentagon.getSide());
                if (c == 1)
                    System.out.println("The Perimeter of the Pentagon is " + pentagon.perimeter());
                else if (c == 2)
                    System.out.println("The Area of the Pentagon is " + pentagon.area());
                else {
                    System.out.println("The Perimeter of the Pentagon is " + pentagon.perimeter());
                    System.out.println("The Area of the Pentagon is " + pentagon.area());
                }
            }

            else if (choice == 9) {
                int c = m.chooseCalculation();
                double side, diagonal1, diagonal2;
                System.out.print("Enter the value for side of the rhombus: ");
                side = read.nextDouble();
                System.out.print("Enter the value for the diagonal1 of the Rhombus: ");
                diagonal1 = read.nextDouble();
                System.out.print("Enter the value for diagonal2 of the rhombus: ");
                diagonal2 = read.nextDouble();

                Rhombus rhombus = new Rhombus(side, diagonal1, diagonal2);
                System.out.println("The side of the Rhombus if " + rhombus.getLength());
                System.out.println("The diagonal 1 of the Rhombus if " + rhombus.getDiagonal1());
                System.out.println("The diagonal 2 of the Rhombus if " + rhombus.getDiagonal2());
                if (c == 1)
                    System.out.println("The Perimeter of the Rhombus is " + rhombus.perimeter());
                else if (c == 2)
                    System.out.println("The Area of the Rhombus is " + rhombus.area());
                else {
                    System.out.println("The Perimeter of the Rhombus is " + rhombus.perimeter());
                    System.out.println("The Area of the Rhombus is " + rhombus.area());
                }
            }
            read.nextLine();

            System.out.print("would you like to try another shape (Y/n): ");
            ch = read.nextLine();
            chr = ch.charAt(0);
        } while (chr == 'Y' || chr == 'y');

        System.out.println("Thank you for using!");
        read.close();
    }

    Scanner readm = new Scanner(System.in);

    /**
     * @return the choice between area and/or perimeter.
     */
    public int chooseCalculation() {
        int choice;
       

        System.out.println("What woud you like to calculate");
        System.out.println("1. Perimeter / Circumference");
        System.out.println("2. Area");
        System.out.println("3. Both");
        System.out.print("Enter your choice: ");
        choice = readm.nextInt();

        return choice;
    }
}
