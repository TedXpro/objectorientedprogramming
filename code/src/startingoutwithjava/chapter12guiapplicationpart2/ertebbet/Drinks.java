package code.src.startingoutwithjava.chapter12guiapplicationpart2.ertebbet;

import java.awt.GridLayout;

import javax.swing.*;

public class Drinks extends JPanel {
    private JCheckBox cola;
    private JCheckBox sprite;
    private JCheckBox mirinda;

    private JLabel price,
            drinks,
            colaPrice,
            spritePrice,
            mirindaPrice,
            smoothLabel,
            waterLabel,
            hotDrinksLabel;

    private JList<String> water;
    private JList<String> hotdrinks;
    private JComboBox<String> smothie;
    private JScrollPane scrollHotDrinksPane;
    private JScrollPane scrollWaterPane;

    private double totalDrinkPrice;

    private final double cp = 25.0,
            sp = 25.0,
            mp = 25.0;
    private final String[] WATER_LITERS = { "1/2 ltr $15.0", "1 ltr $20.0", "2 ltr $25.0" };
    private final double[] WATER_PRICES = { 15.0, 20.0, 25.0 };
    private final String[] HOT_DRINK_NAMES = { "Tea  $5.0", "Coffee $5.0", "Tea wiz Lemmon 10.0", "Decaf 10.0" };
    private final double[] HOT_DRINK_PRICES = { 5.0, 5.0, 10.0, 10.0 };
    private final String[] SMOTHIE_NAMES = { "Avocado  $55.0", "Mango  $55.0", "Mixed  $60.0" };
    private final double[] SMOTHIE_PRICES = { 55.0, 55.0, 60.0 };

    public Drinks() {
        cola = new JCheckBox("Coke");
        sprite = new JCheckBox("Sprite");
        mirinda = new JCheckBox("Mirinda");

        drinks = new JLabel("Drinks");
        price = new JLabel("Price");
        colaPrice = new JLabel("$25.0");
        spritePrice = new JLabel("$25.0");
        mirindaPrice = new JLabel("$25.0");
        smoothLabel = new JLabel("Smothiees");
        waterLabel = new JLabel("Water");
        hotDrinksLabel = new JLabel("Hot Drinks");

        smothie = new JComboBox<>(SMOTHIE_NAMES);

        setLayout(new GridLayout(7, 2));

        buildList();

        add(drinks);
        add(price);
        add(cola);
        add(colaPrice);
        add(sprite);
        add(spritePrice);
        add(mirinda);
        add(mirindaPrice);
        add(smoothLabel);
        add(smothie);
        add(hotDrinksLabel);
        add(waterLabel);
        add(scrollWaterPane);
        add(hotDrinksLabel);
        add(scrollHotDrinksPane);

        setBorder(BorderFactory.createTitledBorder("Drinks"));
    }

    private void buildList() {
        hotdrinks = new JList<>(HOT_DRINK_NAMES);
        hotdrinks.setVisibleRowCount(1);
        hotdrinks.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        scrollHotDrinksPane = new JScrollPane(hotdrinks);

        water = new JList<>(WATER_LITERS);
        water.setVisibleRowCount(1);
        water.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        scrollWaterPane = new JScrollPane(water);
    }

    public double getTotalDrinkPrice() {
        totalDrinkPrice = 0.0;
        int[] selectedItems = hotdrinks.getSelectedIndices();

        for (int i = 0; i < selectedItems.length; i++)
            totalDrinkPrice += HOT_DRINK_PRICES[i];

        selectedItems = water.getSelectedIndices();

        for (int i = 0; i < selectedItems.length; i++)
            totalDrinkPrice += WATER_PRICES[i];

        int smothie_price = smothie.getSelectedIndex();
        totalDrinkPrice += SMOTHIE_PRICES[smothie_price];

        if (cola.isSelected())
            totalDrinkPrice += cp;
        if (mirinda.isSelected())
            totalDrinkPrice += mp;
        if (sprite.isSelected())
            totalDrinkPrice += sp;

        return totalDrinkPrice;
    }
}
