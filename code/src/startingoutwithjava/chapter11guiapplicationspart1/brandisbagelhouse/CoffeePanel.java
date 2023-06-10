package code.src.startingoutwithjava.chapter11guiapplicationspart1.brandisbagelhouse;

import java.awt.GridLayout;
import javax.swing.*;

public class CoffeePanel extends JPanel {
    private JRadioButton noneButton;
    private JRadioButton regularCoffeButton;
    private JRadioButton decafCoffeeButton;
    private JRadioButton cappuccinoButton;
    private ButtonGroup group;

    public final double NONE = 0.0;
    public final double REGULAR_COFFE = 1.25;
    public final double DECAF_COFFEE = 1.25;
    public final double CAPPUCCINO = 2.00;

    public CoffeePanel() {
        setLayout(new GridLayout(4, 1));

        noneButton = new JRadioButton("None", true);
        regularCoffeButton = new JRadioButton("Regular Coffee");
        decafCoffeeButton = new JRadioButton("Decaf Coffee");
        cappuccinoButton = new JRadioButton("Cappuccino");

        group = new ButtonGroup();
        
        group.add(noneButton);
        group.add(regularCoffeButton);
        group.add(decafCoffeeButton);
        group.add(cappuccinoButton);

        setBorder(BorderFactory.createTitledBorder("Coffee"));

        add(noneButton);
        add(regularCoffeButton);
        add(decafCoffeeButton);
        add(cappuccinoButton);
    }

    public double getCoffeePrice() {
        double coffeePrice = 0.0;

        if (noneButton.isSelected())
            coffeePrice = NONE;
        else if (regularCoffeButton.isSelected())
            coffeePrice = REGULAR_COFFE;
        else if (decafCoffeeButton.isSelected())
            coffeePrice = DECAF_COFFEE;
        else
            coffeePrice = CAPPUCCINO;

        return coffeePrice;
    }
}
