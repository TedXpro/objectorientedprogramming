package code.src.startingoutwithjava.chapter9inheritance.cube;

import java.util.Scanner;

public class CubeDemo {
    public static void main(String[] args) {
        double length,
                width,
                height;
        
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the length of the cube: ");
        length = read.nextDouble();

        System.out.print("Enter the width of the cube: ");
        width = read.nextDouble();
        
        System.out.print("Enter the height of the cube: ");
        height = read.nextDouble();

        read.close();

        Cube cube = new Cube(height, length, width);

        System.out.println("Here are the properties of the cube:");
        System.out.println("Length: " + cube.getLenght());
        System.out.println("Width: " + cube.getWidth());
        System.out.println("Heigth: " + cube.getHeight());
        System.out.println("area: " + cube.getArea());
        System.out.println("SurfaceArea: " + cube.getSurfaceArea());
        System.out.println("Volume: " + cube.getVolume());
    }
}
