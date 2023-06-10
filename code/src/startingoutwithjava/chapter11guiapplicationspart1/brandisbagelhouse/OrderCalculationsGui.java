package code.src.startingoutwithjava.chapter11guiapplicationspart1.brandisbagelhouse;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class OrderCalculationsGui extends JFrame {
    private JPanel buttonPanel;
    private JButton calculate;
    private JButton exit;

    private GreetingPanel greetPanel;
    private BagelPanel bagelPanel;
    private ToppingPanel toppingPanel;
    private CoffeePanel coffeePanel;

    private final double TAX = 0.06;

    public OrderCalculationsGui() {

        super("Order Calculations");

        setSize(400, 300);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        greetPanel = new GreetingPanel();
        bagelPanel = new BagelPanel();
        toppingPanel = new ToppingPanel();
        coffeePanel = new CoffeePanel();

        buildPanel();

        add(greetPanel, BorderLayout.NORTH);
        add(bagelPanel, BorderLayout.WEST);
        add(toppingPanel, BorderLayout.CENTER);
        add(coffeePanel, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void buildPanel() {
       
        calculate = new JButton("Calculate");
        exit = new JButton("Exit");

        calculate.addActionListener(new CalculateButtonListener());
        exit.addActionListener(new ExitButtonListener());

        buttonPanel = new JPanel();
        buttonPanel.add(calculate);
        buttonPanel.add(exit);
    }

    private class CalculateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                double subTotal = 0.0,
                        taxTotal = 0.0,
                        total = 0.0;

                subTotal = bagelPanel.getBagleCost() +
                        toppingPanel.getToppingsCost() +
                        coffeePanel.getCoffeePrice();
                taxTotal = subTotal * TAX;

                total = subTotal + taxTotal;

                JOptionPane.showMessageDialog(null, "Sub Total: $" + subTotal +
                        "\nTax Total: $" + taxTotal +
                        "\nTotal: $" + total);
              
        }
    }

    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new OrderCalculationsGui();
    }

}
