package code.src.startingoutwithjava.chapter12guiapplicationpart2.ertebbet;

import javax.swing.*;
import java.awt.*;

public class Food extends JPanel {
    private JLabel items;
    private JLabel price;
    private JLabel ebPrice;
    private JLabel eiPrice;
    private JLabel shiroPrice;
    private JLabel beyanetPrice;
    private JCheckBox ertebBedabo;
    private JCheckBox ertebBeinjera;
    private JCheckBox beyanet;
    private JCheckBox shiro;

    private final double eb = 80.0,
            ei = 90,
            shi = 60.0,
            bey = 70.0;

    private double totalFoodPrice;

    public Food() {

        setLayout(new GridLayout(5, 2));
        // food = new JPanel();

        items = new JLabel("Foods");
        price = new JLabel("Price");
        ebPrice = new JLabel("$80.00");
        eiPrice = new JLabel("$90.00");
        shiroPrice = new JLabel("$60.00");
        beyanetPrice = new JLabel("70.00");

        ertebBedabo = new JCheckBox("Erteb Bedabo");
        ertebBeinjera = new JCheckBox("Erteb BeInjera");
        beyanet = new JCheckBox("Beyanet");
        shiro = new JCheckBox("Shiro");

        add(items);
        add(price);
        add(ertebBedabo);
        add(ebPrice);
        add(ertebBeinjera);
        add(eiPrice);
        add(shiro);
        add(shiroPrice);
        add(beyanet);
        add(beyanetPrice);

        setBorder(BorderFactory.createTitledBorder("Foods"));
    }

    public double getTotalFoodPrice() {
        totalFoodPrice = 0.0;
        if (ertebBedabo.isSelected())
            totalFoodPrice += eb;
        if (ertebBeinjera.isSelected())
            totalFoodPrice += ei;
        if (shiro.isSelected())
            totalFoodPrice += shi;
        if (beyanet.isSelected())
            totalFoodPrice += bey;

        return totalFoodPrice;
    }

    public void deselectAll() {
        if (ertebBedabo.isSelected())
            ertebBedabo.doClick();
        if (ertebBeinjera.isSelected())
            ertebBeinjera.doClick();
        if (shiro.isSelected())
            shiro.doClick();
        if (beyanet.isSelected())
            beyanet.doClick();
    }
}
