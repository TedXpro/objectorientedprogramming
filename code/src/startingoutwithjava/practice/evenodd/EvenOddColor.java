package code.src.startingoutwithjava.practice.evenodd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EvenOddColor extends JFrame implements ActionListener{
    private JButton changeColor;
    private JButton ChangeToWhite;
    private JLabel label1;
    private JLabel label3;
    private JTextArea txtArea;
    private JTextField txtField;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    public EvenOddColor() {
        super("Finding Even and Odd");
        setSize(500, 500);

        setDefaultCloseOperation(EXIT_ON_CLOSE);


        label1 = new JLabel("Number Here");
        label3 = new JLabel("Change Color");
        
        txtArea = new JTextArea(10, 10);
        txtField = new JTextField(10);
        txtField.setText("6");
        
        changeColor = new JButton("Change Color");
        changeColor.addActionListener(this);

        ChangeToWhite = new JButton("Change To White");
        ChangeToWhite.addActionListener(this);

        panel1 = new JPanel();
        panel1.add(label1);
        panel1.add(txtField);

        panel2 = new JPanel();
        panel2.add(changeColor);
        panel2.add(ChangeToWhite);

        panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());

        panel3.add(label3, BorderLayout.NORTH);
        panel3.add(txtArea, BorderLayout.CENTER);

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
        add(panel3, BorderLayout.CENTER);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == changeColor) {
            String s = txtField.getText();
            int number = Integer.parseInt(s);

            if (number % 2 == 0)
                txtArea.setBackground(Color.RED);
            else
                txtArea.setBackground(Color.GREEN);
        } else
            txtArea.setBackground(Color.WHITE);
    }
    
    public static void main(String[] args) {
        new EvenOddColor();
    }
}
