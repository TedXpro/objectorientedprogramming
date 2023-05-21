package code.src.startingoutwithjava.practice.statictest;

public class StaticTest {
    private static int a;
    public static int b;
    static int c;

    static {
        System.out.println("In static block");
        a = 10;
        System.out.println("A = " + a);
        b = 20;
        System.out.println("B = " + b);
        c = 30;
        System.out.println("C = " + c);
    }

    public StaticTest(int i, int j, int k) {
        System.out.println("In Constructor");
        a = i;
        b = j;
        c = k;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public static int getSum() {
        return a + b + c;
    }
}
