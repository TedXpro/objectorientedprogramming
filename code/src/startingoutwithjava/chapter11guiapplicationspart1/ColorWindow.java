package code.src.startingoutwithjava.chapter11guiapplicationspart1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorWindow extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label;
    private JPanel panel;

    public ColorWindow() {
        super("Change Panel Color");

        setSize(250, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        buildPanel();

        add(panel);
        setVisible(true);
    }
    
    public void buildPanel() {
        button1 = new JButton("RED");
        button2 = new JButton("BLACK");
        button3 = new JButton("BLUE");

        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener());
        button3.addActionListener(new ButtonListener());

        label = new JLabel("click the color you want from the given alternatives");

        panel = new JPanel();
        
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                panel.setBackground(Color.RED);
                button1.setForeground(Color.BLACK);
            } else if (e.getSource() == button2) {
                panel.setBackground(Color.BLACK);
                button2.setForeground(Color.RED);
            } else if (e.getSource() == button3) {
                panel.setBackground(Color.BLUE);
                button3.setForeground(Color.BLACK);
            }
        }
    }
    
    public static void main(String[] args) {
        new ColorWindow();
    }
}
