package code.src.startingoutwithjava.chapter11guiapplicationspart1;

import javax.swing.*;
import java.awt.event.*;

public class KiloConverter extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JButton calCButton;
    private JButton button1, button2;
    private int WINDOW_WIDTH = 310;
    private int WINDOW_HEIGHT = 100;

    public KiloConverter() {
        super("KiloConverter");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        buildPannel();

        add(panel);

        setVisible(true);
    }
    
    public void buildPannel() {
        label = new JLabel("Enter a distance in Kilometers");

        textField = new JTextField(10);

        calCButton = new JButton("Calculate");
        button1 = new JButton("button1");
        button2 = new JButton("button2");

        calCButton.addActionListener(new calCButtonListener());

        panel = new JPanel();

        panel.add(label);
        panel.add(textField);
        panel.add(calCButton);
        panel.add(button1);
        panel.add(button2);
    }

    private class calCButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            final double CONVERSION = 0.6214;
            String input;
            double miles;

            String actionCommand = e.getActionCommand();
            JOptionPane.showMessageDialog(null, "you clicked " +  actionCommand);
            input = textField.getText();

            miles = Double.parseDouble(input) * CONVERSION;
            
            JOptionPane.showMessageDialog(null,
                    input + "Kilometers is " + miles + "miles");
            if (actionCommand.equals("button1"))
            JOptionPane.showMessageDialog(null,"You picked " + );
        }
        
    }

    public static void main(String[] args) {
        new KiloConverter();
    }
}
