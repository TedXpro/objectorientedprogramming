package code.src.startingoutwithjava.chapter11guiapplicationspart1.brandisbagelhouse;

import javax.swing.*;

public class GreetingPanel extends JPanel {
    public GreetingPanel() {
        JLabel label = new JLabel("Welcome to Brani's Bagel House");

        add(label);
    }
}
