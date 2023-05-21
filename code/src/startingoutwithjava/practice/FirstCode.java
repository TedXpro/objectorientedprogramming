package code.src.startingoutwithjava.practice;

// import java.util.ArrayList;
import code.src.startingoutwithjava.practice.statictest.StaticTest;

/**
 * The FirstCode class is used to practice simple
 * java commands while reading the book starting
 * out with java.
 */
public class FirstCode {
    public static void main(String[] args) {

        
        StaticTest test = new StaticTest(100, 200, 300);
        StaticTest.b = 500;
        
        // StaticTest.c = 600;
        
        System.out.println(StaticTest.getSum());
        System.out.println(test.getA());
        System.out.println(test.getB());
        System.out.println(test.getC());
        System.out.println(StaticTest.getSum());

        // // Parent p = new Parent("Belay", "M", 60);
        // // p.display();
        // // System.out.println(p.id);

        // Child c = new Child("Yohannes", "Belay", "M", 40);
        // c.display();
        // System.out.println(c.id);

        // GrandChild gc = new GrandChild("Kidus", "Yohannes", "Belay", "M", 10);
        // gc.display();
        // System.out.println(gc.id);

        // Child2 c2 = new Child2();
        // c2.display();
        // System.out.println(c2.id);
    }
}