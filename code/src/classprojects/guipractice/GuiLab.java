package code.src.classprojects.guipractice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuiLab extends JFrame {
    private JButton add;
    private JButton sub;
    private JButton cancel;
    private JButton clear;
    private JTextField field1;
    private JTextField field2;
    private JLabel label1;
    private JLabel label2;
    private JPanel panel;
    private int width = 1000, length = 500;

    public GuiLab() {
        super("Practice");
        setSize(width, length);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        buildPanel();

        add(panel);
        setVisible(true);

    }

    public void buildPanel() {
        label1 = new JLabel("firstNumber");
        label2 = new JLabel("Second Number");
        field1 = new JTextField(10);
        field2 = new JTextField(10);
        add = new JButton("ADD");
        sub = new JButton("SUB");
        cancel = new JButton("CANCEL");
        clear = new JButton("CLEAR");

        add.addActionListener(new ButtonListener());
        add.setBackground(Color.GREEN);
        add.setForeground(Color.BLACK);

        sub.addActionListener(new ButtonListener());
        sub.setBackground(Color.ORANGE);
        sub.setForeground(Color.black);

        cancel.addActionListener(new ButtonListener());
        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.black);

        panel = new JPanel();
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(add);
        panel.add(sub);
        panel.add(cancel);
        panel.add(clear);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String buttonType = e.getActionCommand();

            if (buttonType.equals("CANCEL")) {
                JOptionPane.showMessageDialog(null, "Thank You for using", "Thank you", 0);
                System.exit(0);
            } else {
                String n1, n2;
                n1 = field1.getText();
                n2 = field2.getText();

                double num1, num2, ans;
                num1 = Double.parseDouble(n1);
                num2 = Double.parseDouble(n2);

                if (buttonType.equals("ADD")) {
                    ans = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Answer = " + ans, "Summation", 0);

                } else if (buttonType.equals("SUB")) {
                    ans = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Answer = " + ans, "Difference", 0);
                }
            }
        }
    }

    public static void main(String[] args) {
        new GuiLab();

    }
}
