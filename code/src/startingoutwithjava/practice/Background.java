package code.src.startingoutwithjava.practice;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Background extends JFrame {
    public Background() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JTextArea txt = new JTextArea(20,20);

        JButton button = new JButton("oj");

        panel.add(button);
        panel.add(txt);
       
        // panel.setBackground(Color.BLACK);
        panel2.setBackground(Color.RED);
        panel3.setBackground(Color.CYAN);

        
        add(panel, BorderLayout.EAST);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.NORTH);
        // add(button, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Background();
    }
}

