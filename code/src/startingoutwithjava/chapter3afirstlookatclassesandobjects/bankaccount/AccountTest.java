package code.src.startingoutwithjava.chapter3afirstlookatclassesandobjects.bankaccount;
import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        BankAccount account;

        double balance,
                pay,
                interestRate,
                cashNeeded;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the initial balance: ");
        balance = keyboard.nextDouble();
        System.out.print("Enter the interest Rate: ");
        interestRate = keyboard.nextDouble();

        account = new BankAccount(balance, interestRate);

        System.out.print("Enter the amount to deposit: ");
        pay = keyboard.nextDouble();

        account.deposit(pay);
        System.out.println("Your current balance is: " + account.getBalance());

        System.out.print("Enter the amount to withdraw: ");
        cashNeeded = keyboard.nextDouble();

        account.widthdraw(cashNeeded);
        System.out.println("Your current balance is: " + account.getBalance());

        account.addInterest();

        System.out.println("The current interest rate is " + account.getInterest());
        System.out.println("Your current balance is: " + account.getBalance());
        keyboard.close();
    }

}
