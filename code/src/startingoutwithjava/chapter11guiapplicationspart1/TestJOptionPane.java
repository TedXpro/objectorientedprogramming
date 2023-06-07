package code.src.startingoutwithjava.chapter11guiapplicationspart1;

import javax.swing.*;

public class TestJOptionPane {
    public static void main(String[] args) {
        int ch;
        do {
            double score1, score2, score3;
            String score;
            score = JOptionPane.showInputDialog(null,
                    "Enter the score of student 1",
                    "Score");
            score1 = Integer.parseInt(score);

            score = JOptionPane.showInputDialog(null,
                    "Enter the score of student 2",
                    "Score");
            score2 = Integer.parseInt(score);

            score = JOptionPane.showInputDialog(null,
                    "Enter the score of student 1",
                    "Score");
            score3 = Integer.parseInt(score);

            double average = (score1 + score2 + score3) / 3;
            JOptionPane.showMessageDialog(null, average, "Average Score", 0);

            ch = JOptionPane.showConfirmDialog(null,
                    "would you like to calculate for anothe Student",
                    "Average Score",
                    JOptionPane.YES_NO_OPTION);

        } while (ch != JOptionPane.NO_OPTION);

        JOptionPane.showMessageDialog(null, "Thank you for using", "Average Score", 0);

        System.exit(0);
    }
}
