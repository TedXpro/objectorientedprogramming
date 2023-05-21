package code.src.startingoutwithjava.chapter4decisionstructure.salescommission;

/**
 * Defining the SalesCommission class.
 */

public class SalesCommission {
    private double sales;
    private double rate;
    private double commission;
    private double advance;
    private double pay;

    /**
     * The constructor initializes sales and advance
     * 
     * @param s holds the value for sales;
     * @param a holds the value for advance;
     */
    public SalesCommission(double s, double a) {
        sales = s;
        advance = a;

        calculatePay();
    }

    /**
     * The setRate function assigns value for rate;
     */
    private void setRate() {
        if (sales < 10000)
            rate = 0.05;
        else if (sales < 15000)
            rate = 0.1;
        else if (sales < 18000)
            rate = 0.12;
        else if (sales < 22000)
            rate = 0.14;
        else
            rate = 0.16;
    }

    /**
     * The calculatePay methdo calculates the slaesperson's 
     * commission and amount of actual pay.
     */
    private void calculatePay() {
        setRate();
        commission = sales * rate;
        pay = commission - advance;

    }

    /**
     * Ths getPay method returns the pay field.
     * @return pay field.
     */
    public double getPay() {
        return pay;
    }

    /**
     * The getCommission method returns the commission field;
     * @return the commission field;
     */
    public double getCommission() {
        return commission;
    }

    /**
     * The getRate method returns the rate.
     * @return the rate field.
     */
    public double getRate() {
        return rate;
    }

    /**
     * The getAdvance returns the advance field.
     * @return the advance field.
     */
    public double getAdvance() {
        return advance;
    }

    /**
     * The getSales method returns the sales field.
     * @return the sales field.
     */
    public double getSales() {
        return sales;
    }

}