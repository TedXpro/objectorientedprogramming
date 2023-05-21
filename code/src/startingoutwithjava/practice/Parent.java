package code.src.startingoutwithjava.practice;

public class Parent {
    protected String name = "Abebe",
            gender = "M";
    protected int age = 70;
    protected static int id = 0;

    public Parent(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        id++;
        System.out.println("In Parent Class Constructor");

    }

    public Parent(String name) {
        this.name = name;
        id++;
        System.out.println("In Parent Constructor with one parameter");
    }

    public Parent() {
        System.out.println("In Parent Default Constructor");
        id++;
    }

    public void display() {
        System.out.println("In Parent Display");
        System.out.println(name + " " + gender + " " + age);
    }
}
