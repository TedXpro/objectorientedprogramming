package code.src.classprojects.student;
/**
 * This is a definition of the Student Class.
 */
public class Student {
    private String studentName;
    private String studentId;
    private int studentAge;

    /**
     * The constructor initializes the fields.
     */
    public Student() {
        studentName = "";
        studentId = "";
        studentAge = 0;
    }

    /**
     * The constructor initializes the fields 
     * @param name holds the name of the studnet;
     * @param id holds the id of the student.
     * @param age holds the age of the sudent;
     */
    public Student(String name, String id, int age)
    {
        studentName = name;
        studentId = id;
        studentAge = age;
    }

    /**
     * The setName method assigns value to the studentName field.
     * @param name holds the name of the student.
     */
    public void setName(String name) {
        studentName = name;
    }

    /**
     * The setAge method assigns value to the studentAge field.
     * @param age holds the age of the studnet.
     */
    public void setAge(int age) {
        studentAge = age;
    }

    /**
     * The setId method assigns value to the studentId field.
     * @param id holds the id of the student.
     */
    public void setId(String id) {
        studentId = id;
    }

    /**
     * The getName method returns the studentName field;
     * @return the studentName field;
     */
    public String getName() {
        return studentName;
    }

    /**
     * The getAge field returns the studentAge field;
     * @return the studentAge field;
     */
    public int getAge() {
        return studentAge;
    }

    /**
     * The getId field returns the studentId field;
     * @return the studentId field;
     */
    public String getId() {
        return studentId;
    }
    
}
