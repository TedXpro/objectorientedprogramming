package code.src.startingoutwithjava.chapter11guiapplicationspart1.brandisbagelhouse;

import java.awt.GridLayout;
import javax.swing.*;

public class ToppingPanel extends JPanel {
    private JCheckBox creamCheeseBox;
    private JCheckBox butterBox;
    private JCheckBox peachJellyBox;
    private JCheckBox blueBerryBox;

    public double CREAM_CHEESE = 0.5;
    public double BUTTER = 0.25;
    public double PEACHE_JELLY = 0.75;
    public double BLUE_BERRY = 0.75;

    public ToppingPanel() {
        setLayout(new GridLayout(4, 1));

        creamCheeseBox = new JCheckBox("Creame Cheese", true);
        butterBox = new JCheckBox("Butter");
        peachJellyBox = new JCheckBox("Peach Jelly");
        blueBerryBox = new JCheckBox("Blue Berry");

        setBorder(BorderFactory.createTitledBorder("Toppings"));

        add(creamCheeseBox);
        add(butterBox);
        add(peachJellyBox);
        add(blueBerryBox);
    }

    public double getToppingsCost() {
        double toppingsCost = 0.0;
        if (creamCheeseBox.isSelected())
            toppingsCost += CREAM_CHEESE;
        if (butterBox.isSelected())
            toppingsCost += BUTTER;
        if (peachJellyBox.isSelected())
            toppingsCost += PEACHE_JELLY;
        if (blueBerryBox.isSelected())
            toppingsCost += BLUE_BERRY;

        return toppingsCost;
    }
}
