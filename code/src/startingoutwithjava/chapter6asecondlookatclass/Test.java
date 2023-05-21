package code.src.startingoutwithjava.chapter6asecondlookatclass;

import java.util.Scanner;

public class Test {
    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Test getResult() {
        String name;
        int age;

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = read.nextLine();
        System.out.println("Enter the age: ");
        age = read.nextInt();
        read.close();
        return new Test(name, age);
    }

    public void display() {
        Test t = getResult();
        System.out.println("Name: " + t.name);
        System.out.println("Age: " + t.age);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Test t = new Test("yo", 20);

        t.display();
    }
}