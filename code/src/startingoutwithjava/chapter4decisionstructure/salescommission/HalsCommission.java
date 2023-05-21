package code.src.startingoutwithjava.chapter4decisionstructure.salescommission;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program calculates a salespersons gross
 * pay using the SalesCommission class.
 */
public class HalsCommission {
    public static void main(String[] args) {
        double sales,
                advancePay;

        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        DecimalFormat percent = new DecimalFormat("#0%");

        Scanner read = new Scanner(System.in);

        System.out.print("This program will display a "
                + "pay report for a salesperson.");
        System.out.println("Enter the following information:");
        System.out.print("Amount of Sales: $");
        sales = read.nextDouble();
        System.out.print("Amount of Advanced pay: $");
        advancePay = read.nextDouble();

        SalesCommission payInfo = new SalesCommission(sales, advancePay);

        System.out.println("Pay Report");
        System.out.println("------------------------");
        System.out.println("Sales: $"
                + dollar.format(payInfo.getSales()));
        System.out.println("Commission rate: "
                + percent.format(payInfo.getRate()));
        System.out.println("Commission: $"
                + dollar.format(payInfo.getCommission()));
        System.out.println("Advanced pay: $"
                + dollar.format(payInfo.getAdvance()));
        System.out.println("Remaining pay: $"
                + dollar.format(payInfo.getPay()));
        read.close();
    }

}
