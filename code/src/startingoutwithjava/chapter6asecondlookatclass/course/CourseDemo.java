package code.src.startingoutwithjava.chapter6asecondlookatclass.course;

import code.src.startingoutwithjava.chapter6asecondlookatclass.aggregation.*;

public class CourseDemo {
    public static void main(String[] args) {         
        Instructor myInstructor = new Instructor("Melese", "Issayas", "000");

        TextBook myBook = new TextBook("Starting Out With C++", "Gaddis", "Addison-weslye");

        Course myCourse = new Course("Intro to Java", myInstructor, myBook);

        System.out.println(myCourse);
    }
}
