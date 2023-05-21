package code.src.startingoutwithjava.practice;

public class Child extends Parent {
    protected String childName;

    public Child(String childName, String name, String gender, int age) {
        super(name);
        System.out.println("Returned from Parent Class Constructor with on parameter");
        this.childName = childName;
        System.out.println("\nIn Child Class Constructor");
    }

    public void display() {
        System.out.println("In Child Display");
        System.out.println(childName + " " + name + " " + gender + " " + age);
    }

}
