package code.src.startingoutwithjava.chapter3afirstlookatclassesandobjects.bankaccount;
/**
 * Bank Account class
 * This class simulates a bank account.
 */
public class BankAccount {
    private double balance;
    private double interestRate;
    private double interest;

    /**
     * The constructor initializes the private variables with values
     * passed to as the parameters.
     * @param startBalance  holds the value for initial balance.
     * @param intRate holds the value for interestRate.
     */
    public BankAccount(double startBalance, double intRate)
    {
        balance = startBalance;
        interestRate = intRate;
        interest = 0.0;
    }

    /**
     * The deposit method adds money to the balance.
     * @param amount holds the amount of money to be deposited.
     */
    public void deposit(double amount)
    {
        balance += amount;
    }

    /**
     * the withdraw method decreases money from the balance.
     * @param amount holds the amount of money to be withdrawn.
     */
    public void widthdraw(double amount)
    {
        balance -= amount;
    }
    
    /**
     * The addInterest calculates the interest and adds to the balance.
     */
    public void addInterest()
    {
        interest = balance * interestRate;
        balance += interest;
    }

    /**
     * The getBalance returns the balance of the user.
     * @return the balance.
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * The get Interest method returns the interest.
     * @return the interest.
     */
    public double getInterest()
    {
        return interest;
    }
}
