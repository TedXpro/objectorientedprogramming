package code.src.startingoutwithjava.chapter6asecondlookatclass.aggregation;

public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    /**
     * This Consturctor initializes the fields.
     * 
     * @param lastName     holds the lastName
     * @param firstName    holds the firstName
     * @param officeNumber holds the officeNumber
     */
    public Instructor(String lastName, String firstName, String officeNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }

    /**
     * The copy Constructor copys the fields to another
     * Instructor type.
     * 
     * @param instructor holds the object being copied from.
     */
    public Instructor(Instructor instructor) {
        lastName = instructor.lastName;
        firstName = instructor.firstName;
        officeNumber = instructor.officeNumber;
    }

    /**
     * This method is used to assign all the fields.
     * 
     * @param lastName
     * @param firstName
     * @param officeNumber
     */
    public void setFields(String lastName, String firstName, String officeNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNumber = officeNumber;
    }

    /**
     * The toString method returns a String containing 
     * the instructor information.
     * @return the instructor information.
     */
    public String toString() {
        String str;

        str = "FirstName: " + firstName +
                "\nLastName: " + lastName +
                "\nOfficeNumber: " + officeNumber;

        return str;
    }

}
