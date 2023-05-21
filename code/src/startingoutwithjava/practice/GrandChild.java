package code.src.startingoutwithjava.practice;

public class GrandChild extends Child {
    protected String grandChildName;

    public GrandChild(String grandChildName, String childName, String name, String gender, int age) {
        super(childName, name, gender, age);
        this.grandChildName = grandChildName;
        System.out.println("\nIn Grand Child Constructor");

    }

    public void display() {
        System.out.println("In Grand Child Display");
        System.out.println(grandChildName + " " + childName + " "
                + name + " " + gender + " " + age);

    }

}
