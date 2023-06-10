package code.src.startingoutwithjava.chapter11guiapplicationspart1.brandisbagelhouse;

import java.awt.GridLayout;

import javax.swing.*;

public class BagelPanel extends JPanel {
    public final double WHITE_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50;

    private JRadioButton whiteBagel;
    private JRadioButton wheatBagel;
    private ButtonGroup group;

    public BagelPanel() {
        setLayout(new GridLayout(2, 1));

        whiteBagel = new JRadioButton("White", true);
        wheatBagel = new JRadioButton("Whole White");

        group = new ButtonGroup();
        group.add(whiteBagel);
        group.add(wheatBagel);

        setBorder(BorderFactory.createTitledBorder("Bagel"));

        add(whiteBagel);
        add(wheatBagel);
    }

    public double getBagleCost() {
        double bagelcost = 0.0;
        if (whiteBagel.isSelected())
            bagelcost = WHITE_BAGEL;
        else
            bagelcost = WHEAT_BAGEL;
        return bagelcost;
    }
}
