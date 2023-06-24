package code.src.startingoutwithjava.chapter12guiapplicationpart2.ertebbet;

import java.awt.GridLayout;

import javax.swing.*;

public class Toppings extends JPanel {
    private JCheckBox avocado;
    private JCheckBox egg;
    private JCheckBox ketchup;
    private JCheckBox mayo;
    private JLabel avo,
            eggP,
            kp,
            mp,
            price,
            toppings;

    private final double avoPrice = 15.0,
            eggPrice = 15.0,
            ketPrice = 10.0,
            mayoPrice = 10.0;
    private double totalToppingPrice;

    public Toppings() {
        avocado = new JCheckBox("Avocado");
        egg = new JCheckBox("Egg");
        ketchup = new JCheckBox("Ketchup");
        mayo = new JCheckBox("Mayonaise");

        toppings = new JLabel("Toppings");
        price = new JLabel("Price");
        avo = new JLabel("15.00");
        eggP = new JLabel("15.00");
        kp = new JLabel("10.00");
        mp = new JLabel("10.00");

        setLayout(new GridLayout(5, 2));

        add(toppings);
        add(price);
        add(avocado);
        add(avo);
        add(egg);
        add(eggP);
        add(ketchup);
        add(kp);
        add(mayo);
        add(mp);

        setBorder(BorderFactory.createTitledBorder("Toppings"));
    }

    public double getTotalToppingsPrice() {
        totalToppingPrice = 0.0;
        if (avocado.isSelected())
            totalToppingPrice += avoPrice;
        if (egg.isSelected())
            totalToppingPrice += eggPrice;
        if (ketchup.isSelected())
            totalToppingPrice += ketPrice;
        if (mayo.isSelected())
            totalToppingPrice += mayoPrice;

        return totalToppingPrice;
    }

    public void deselectAll() {
        if (avocado.isSelected())
            avocado.doClick();
        if (egg.isSelected())
            egg.doClick();
        if (ketchup.isSelected())
            ketchup.doClick();
        if (mayo.isSelected())
            mayo.doClick();
    }

}
