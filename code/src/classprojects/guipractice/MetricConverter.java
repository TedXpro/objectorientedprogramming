package code.src.classprojects.guipractice;

import java.awt.event.*;
import javax.swing.*;

public class MetricConverter extends JFrame {
    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3;
    private JLabel label;
    private JTextField textField;
    private JPanel panel;
    private ButtonGroup group;

    public MetricConverter() {
        super("Metric Converter");
        setSize(400, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);
    }

    public void buildPanel() {

        label = new JLabel("Enter the number in Kilometers");
        textField = new JTextField(10);

        button1 = new JRadioButton("Convert to Miles");
        button2 = new JRadioButton("Convert to Feet");
        button3 = new JRadioButton("Convert to Inches");

        group = new ButtonGroup();

        group.add(button1);
        group.add(button2);
        group.add(button3);

        button1.addActionListener(new RadiobuttonListener());
        button2.addActionListener(new RadiobuttonListener());
        button3.addActionListener(new RadiobuttonListener());

        panel = new JPanel();

        panel.add(label);
        panel.add(textField);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
    }

    private class RadiobuttonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String input = textField.getText();
            double result = 0.0;
            String str = "";

            if (e.getSource() == button1) {
                str = " Miles ";
                result = Double.parseDouble(input) * 0.6214;
            } else if (e.getSource() == button2) {
                str = " Feet ";
                result = Double.parseDouble(input) * 3281.0;
            } else if (e.getSource() == button3) {
                str = " Inches ";
                result = Double.parseDouble(input) * 39370.0;
            }

            JOptionPane.showMessageDialog(null, input + " Kilometer is " + result + " " + str, "Conversion", 0);
        }
    }

    public static void main(String[] args) {
        new MetricConverter();
    }
}
