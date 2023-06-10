package code.src.startingoutwithjava.chapter11guiapplicationspart1.brandisbagelhouse;

import java.awt.GridLayout;

import javax.swing.*;

public class TextFieldDisplayPanel extends JPanel {
    JTextField subField,
            field,
            taxField;
    JLabel subLabel,
            label,
            taxLabel;

    public TextFieldDisplayPanel() {
        subField = new JTextField(10);
        subField.setEditable(false);
        subField.setText("0.0");

        field = new JTextField(10);
        field.setEditable(false);
        field.setText("0.0");

        taxField = new JTextField(10);
        taxField.setEditable(false);
        taxField.setText("0.0");

        subLabel = new JLabel("Sub Total:");
        taxLabel = new JLabel("Tax Total:");
        label = new JLabel("Total:");

        setLayout(new GridLayout(3, 2));
        add(subLabel);
        add(subField);
        add(taxLabel);
        add(taxField);
        add(label);
        add(field);
    }
    
    public void updatefield(double sub , double tot , double tax ) {
        subField.setText("" + sub);
        taxField.setText("" + tax);
        field.setText("" + tot);
    }
}
