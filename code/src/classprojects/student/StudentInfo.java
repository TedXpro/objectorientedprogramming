package code.src.classprojects.student;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        String name,
                id;
        int age;
        Student student1;

        Scanner read = new Scanner(System.in);

        System.out.println("Enter the following info about the Student:");
        System.out.print("Student Name: ");
        name = read.nextLine();
        System.out.print("Student Id: ");
        id = read.nextLine();
        System.out.print("Student Age: ");
        age = read.nextInt();

        student1 = new Student(name, id, age);

        System.out.println("These are the follwing"
                + " info about the student.");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Id: " + student1.getId());

    }
}
