package code.src.startingoutwithjava.chapter12guiapplicationpart2.calendarconverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ConvertTo extends JPanel {
    private JRadioButton ethiopian;
    private JRadioButton gregorian;
    private JLabel label;
    private ButtonGroup group;
    private int flag = 1;

    public ConvertTo() {
        label = new JLabel("Select a calendar to convert to:");

        ethiopian = new JRadioButton("Ethiopian", true);
        ethiopian.setBackground(Color.GRAY);
        ethiopian.setForeground(Color.WHITE);
        ethiopian.addActionListener(new EthiopianRadioButtonListener());

        gregorian = new JRadioButton("Gregorian");
        gregorian.setBackground(Color.GRAY);
        gregorian.setForeground(Color.white);
        gregorian.addActionListener(new EthiopianRadioButtonListener());

        group = new ButtonGroup();
        group.add(ethiopian);
        group.add(gregorian);

        setLayout(new GridLayout(3, 1));
        setBorder(BorderFactory.createTitledBorder("Conver To"));
        setBackground(Color.GRAY);
        add(label);
        add(ethiopian);
        add(gregorian);
    }

    public int getFlag()
    {
        return flag;
    }

    private class EthiopianRadioButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == ethiopian)
                flag = 1;
            else
                flag = 2;
        }
    }

    // private class GregorianRadioButtonListener implements ActionListener {
    //     @Override
    //     public void actionPerformed(ActionEvent event) {

    //     }
    // }

}
