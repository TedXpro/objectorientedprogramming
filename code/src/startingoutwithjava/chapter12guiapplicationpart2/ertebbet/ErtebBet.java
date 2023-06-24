package code.src.startingoutwithjava.chapter12guiapplicationpart2.ertebbet;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class ErtebBet extends JFrame {
    private Food foods;
    private Toppings toppings;
    private Drinks drinks;
    private JPanel header;
    private JButton calculate;
    private JButton clear;
    private JLabel subTotalLabel;
    private JLabel totalLabel;
    private JLabel taxLabel;
    private JTextField totalDisplay;
    private JTextField subTotalDisplay;
    private JTextField taxDisplay;
    private JPanel buttons;

    private final double TAX = 0.06;

    public ErtebBet() {
        super("Price Calculate");

        setSize(850, 500);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        header = new JPanel();
        JLabel hed = new JLabel("Welcome to J's House!");
        header.add(hed);
        foods = new Food();
        toppings = new Toppings();
        drinks = new Drinks();

        build();

        add(header, BorderLayout.NORTH);
        add(foods, BorderLayout.WEST);
        add(toppings, BorderLayout.CENTER);
        add(drinks, BorderLayout.EAST);
        add(buttons, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void build() {
        calculate = new JButton("Calculate");
        calculate.addActionListener(new CalcButtonListener());

        clear = new JButton("Clear");
        clear.addActionListener(new ClearButton());

        subTotalLabel = new JLabel("Sub Total:", SwingConstants.RIGHT);
        taxLabel = new JLabel("Taxed:", SwingConstants.RIGHT);
        totalLabel = new JLabel("Total:", SwingConstants.RIGHT);

        totalDisplay = new JTextField(10);
        totalDisplay.setEditable(false);
        totalDisplay.setText("0.0");
        subTotalDisplay = new JTextField(10);
        subTotalDisplay.setEditable(false);
        subTotalDisplay.setText("0.0");
        taxDisplay = new JTextField(10);
        taxDisplay.setEditable(false);
        taxDisplay.setText("0.0");

        buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 2));
        buttons.add(subTotalLabel);
        buttons.add(subTotalDisplay);
        buttons.add(taxLabel);
        buttons.add(taxDisplay);
        buttons.add(totalLabel);
        buttons.add(totalDisplay);
        buttons.add(calculate);
        buttons.add(clear);
    }

    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double subPrice = 0.0;
            double totalPrice = 0.0;
            double taxPrice = 0.0;

            subPrice += foods.getTotalFoodPrice() +
                    drinks.getTotalDrinkPrice() +
                    toppings.getTotalToppingsPrice();

            taxPrice = subPrice * TAX;

            totalPrice = subPrice + taxPrice;

            subTotalDisplay.setText(String.valueOf(subPrice));
            taxDisplay.setText(String.valueOf(taxPrice));
            totalDisplay.setText(String.valueOf(totalPrice));
        }
    }

    private class ClearButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            toppings.deselectAll();
            foods.deselectAll();
            drinks.deselectAll();
            subTotalDisplay.setText("0.0");
            taxDisplay.setText("0.0");
            totalDisplay.setText("0.0");
        }
    }

    public static void main(String[] args) {
        new ErtebBet();
    }
}
