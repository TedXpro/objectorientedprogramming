package code.src.startingoutwithjava.chapter12guiapplicationpart2.calendarconverter;

import javax.swing.*;
import java.awt.*;

public class Result extends JPanel {
    private JLabel dayLabel;
    private JLabel monthLabel;
    private JLabel yearLabel;

    private JTextField day;
    private JTextField month;
    private JTextField year;

    public Result() {
        setLayout(new GridLayout(3, 2));
        setBackground(Color.LIGHT_GRAY);

        setBorder(BorderFactory.createTitledBorder("Result"));

        dayLabel = new JLabel("Day: ", SwingConstants.RIGHT);
        monthLabel = new JLabel("Month: ", SwingConstants.RIGHT);
        yearLabel = new JLabel("Year: ", SwingConstants.RIGHT);

        day = new JTextField(2);
        day.setEditable(false);
        month = new JTextField(2);
        month.setEditable(false);
        year = new JTextField(4);
        year.setEditable(false);

        add(dayLabel);
        add(day);
        add(monthLabel);
        add(month);
        add(yearLabel);
        add(year);

    }

    public void clearField() {
        day.setText("");
        month.setText("");
        year.setText("");
    }

    public void changeColor(boolean status) {
        if (status == true)
            setBackground(Color.ORANGE);
        else
            setBackground(Color.LIGHT_GRAY);
    }

    public void setText(String d, String m, String y) {
        day.setText(d);
        month.setText(m);
        year.setText(y);
    }
}
