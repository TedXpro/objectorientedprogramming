package code.src.startingoutwithjava.chapter11guiapplicationspart1;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderWindow extends JFrame {
    private final int WIDTH = 400;
    private final int LENGTH = 300;

    public BorderWindow() {
        super("Border Layout");

        setSize(WIDTH, LENGTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 2));

        JButton button1 = new JButton("North Button");
        JButton button2 = new JButton("South Button");
        JButton button3 = new JButton("East Button");
        JButton button4 = new JButton("West Button");
        JButton button5 = new JButton("Center Button");
        JButton button6 = new JButton("Cell 6");

        JLabel label1 = new JLabel("This is cell 1");
        JLabel label2 = new JLabel("This is cell 2");
        JLabel label3 = new JLabel("This is cell 3");
        JLabel label4 = new JLabel("This is cell 4");
        JLabel label5 = new JLabel("This is cell 5");
        JLabel label6 = new JLabel("This is cell 6");

        JPanel panel1 = new JPanel();
        panel1.add(label1);
        panel1.add(button1);

        JPanel panel2 = new JPanel();
        panel2.add(button2);
        panel2.add(label2);

        JPanel panel3 = new JPanel();
        panel3.add(label3);
        panel3.add(button3);

        JPanel panel4 = new JPanel();
        panel4.add(button4);
        panel4.add(label4);

        JPanel panel5 = new JPanel();
        panel5.add(button5);
        panel5.add(label5);

        JPanel panel6 = new JPanel();
        panel6.add(button6);
        panel6.add(label6);
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderWindow();
    }

}
