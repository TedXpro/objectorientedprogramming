package code.src.startingoutwithjava.chapter12guiapplicationpart2.calendarconverter;

import javax.swing.*;
import java.awt.*;

public class Date extends JPanel {
    // private JComboBox day;
    // private JComboBox month;
    // private JComboBox year;

    // private final int[] DAYS = {
    // 1, 2, 3, 4, 5,
    // 6, 7, 8, 9, 10,
    // 11, 12, 13, 14, 15,
    // 16, 17, 18, 19, 20,
    // 21, 22, 23, 24, 25,
    // 26, 27, 28, 29, 30, 31 };

    // private final String[] MONTHS = {
    // "Jan", "Feb", "Mar", "Apr",
    // "May", "Jun", "Jul", "Aug",
    // "Sep", "Oct", "Nov", "Dec" };

    private JTextField day;
    private JTextField month;
    private JTextField year;

    private JLabel dayLabel;
    private JLabel monthLabel;
    private JLabel yearLabel;

    public Date() {
        setBackground(Color.orange);

        dayLabel = new JLabel("Day: ", SwingConstants.RIGHT);
        monthLabel = new JLabel("Month: ", SwingConstants.RIGHT);
        yearLabel = new JLabel("Year: ", SwingConstants.RIGHT);

        day = new JTextField("dd", 2);
        month = new JTextField("mm", 2);
        year = new JTextField("yyyy", 4);

        setLayout(new GridLayout(3, 2));
        add(dayLabel);
        add(day);
        add(monthLabel);
        add(month);
        add(yearLabel);
        add(year);

        setBorder(BorderFactory.createTitledBorder("Date"));
    }

    public int getDate() {
        return Integer.parseInt(day.getText());
    }

    public int getMonth() {
        return Integer.parseInt(month.getText());
    }

    public int getYear() {
        return Integer.parseInt(year.getText());
    }

    public void changeColor(boolean status) {
        if (status == true)
            setBackground(Color.orange);
        else
            setBackground(Color.lightGray);
    }

    public void clearDateTextField() {
        day.setText("dd");
        month.setText("mm");
        year.setText("yyyy");
    }

}
