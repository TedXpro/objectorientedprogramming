package code.src.startingoutwithjava.practice;
import code.src.startingoutwithjava.practice.statictest.StaticTest;

public class T {
    public static void main(String[] args) {
        
        display();
    }
    public static void display() {
        StaticTest.b = 50;
        System.out.println(StaticTest.getSum());
    }
}
