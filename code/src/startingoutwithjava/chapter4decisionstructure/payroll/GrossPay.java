package code.src.startingoutwithjava.chapter4decisionstructure.payroll;
import java.util.Scanner;

/**
 * This program uses the payroll class to
 * calculate grossPay
 */
public class GrossPay {

    public static void main(String[] args) {
        PayRoll pay = new PayRoll();
        Scanner keyboard = new Scanner(System.in);

        double hours,
                rate;

        System.out.print("Enter the hours worked: ");
        hours = keyboard.nextDouble();
        pay.setHoursWorked(hours);

        System.out.print("Enter the payRate: ");
        rate = keyboard.nextDouble();
        pay.setPayRate(rate);

        System.out.println("The Employees gross pay is " + pay.getGrossPay());
        keyboard.close();
    }

}
