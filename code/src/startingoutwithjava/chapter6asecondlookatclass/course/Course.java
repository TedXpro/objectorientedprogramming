package code.src.startingoutwithjava.chapter6asecondlookatclass.course;

import code.src.startingoutwithjava.chapter6asecondlookatclass.aggregation.*;

public class Course {
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    /**
     * Initializes the fields.
     * 
     * @param courseName holds the course Name.
     * @param instructor holds the object of Insturctor.
     * @param textBook   holds the object of TextBook.
     */
    public Course(String courseName, Instructor instructor, TextBook textBook) {
        this.courseName = courseName;
        this.instructor = new Instructor(instructor);
        this.textBook = new TextBook(textBook);
    }

    /**
     * @return the courseName field.
     */
    public String getName() {
        return courseName;
    }

    /**
     * @return the Instructor field.
     */
    public Instructor getInstructor() {
        return new Instructor(instructor);
    }

    /**
     * @return the TextBook field.
     */
    public TextBook getTextBook() {
        return new TextBook(textBook);
    }

    public String toString() {
        String str;
        str = "Course: " + courseName +
                "\nInstructor Information\n" +
                instructor +
                "\nTextBook Information\n" +
                textBook;

        return str;
    }
}
