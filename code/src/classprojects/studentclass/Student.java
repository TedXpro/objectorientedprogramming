package code.src.classprojects.studentclass;
import java.util.Scanner;

public class Student {
    private String studentName;
    private String studentId;
    private int studentAge;

    public Student() {
        studentName = "";
        studentId = "";
        studentAge = 0;
    }

    public void acceptInfo() {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");
        studentName = read.nextLine();
        System.out.print("Enter the StudentID: ");
        studentId = read.nextLine();
        System.out.print("Enter the StudentAge: ");
        studentAge = read.nextInt();
    }

    public void display() {
        System.out.println("\nThe Student Information:");
        System.out.println("Student Name: "
                + studentName);
        System.out.println("Student Id: "
                + studentId);
        System.out.println("Student Age: "
                + studentAge);
    }
    
}
