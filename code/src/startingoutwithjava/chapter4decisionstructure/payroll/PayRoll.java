package code.src.startingoutwithjava.chapter4decisionstructure.payroll;
/**
 * PayRoll class definition.
 * Calculates the payRoll of employees.
 */
public class PayRoll {
    private double hoursWorked;
    private double payRate;

    /**
     * The constructor initialises the fields.
     */
    public PayRoll()
    {
        hoursWorked = 0.0;
        payRate = 0.0;
    }
    
    /**
     * The setHoursWorked method sets the value for hoursWorked.
     * 
     * @param hours holds the value to set for hours worked.
     */
    public void setHoursWorked(double hours)
    {
        hoursWorked = hours;
    }

    /**
     * The setPayRate method sets the value for the payRate.
     * @param pay holds the value for the payRate.
     */
    public void setPayRate(double pay)
    {
        payRate = pay;
    }

    /**
     * The getHoursWOrked function returns the hoursWorked value.
     * @return the hours Worked value.
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * The getPayRAte function returns the payRAte value.
     * @return the payRate value.
     */
    public double getPayRate() {
        return payRate;
    }

    /** 
     * The getGrossPay returns the calculated amount.
     * 
     * @return the product of the hoursWorked and the PayRate.
    */
    public double getGrossPay() {
        double grossPay,
        overtimePay;

        if (hoursWorked > 40)
        {
            grossPay = 40 * payRate;
            overtimePay = (hoursWorked - 40) * (payRate * 1.5);
            grossPay += overtimePay;
        }
        else {
            grossPay = payRate * hoursWorked;
        }
        return grossPay;
    }
}
