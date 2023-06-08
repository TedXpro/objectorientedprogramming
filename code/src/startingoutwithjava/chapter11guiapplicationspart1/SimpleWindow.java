package code.src.startingoutwithjava.chapter11guiapplicationspart1;

import javax.swing.JFrame;

public class SimpleWindow extends JFrame {
    public SimpleWindow() {
        super("SimpleWindow");
        final int WINDOW_WIDTH = 350;
        final int WINDOW_LENGTH = 250;
        setSize(WINDOW_WIDTH, WINDOW_LENGTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        System.out.println("In the Constructor");
    }

    public static void main(String[] args) {

        new SimpleWindow();
        System.out.println("In the MainMethod");
    }
}
