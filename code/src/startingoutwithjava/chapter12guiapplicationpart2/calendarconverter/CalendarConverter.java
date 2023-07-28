package code.src.startingoutwithjava.chapter12guiapplicationpart2.calendarconverter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalendarConverter extends JFrame {
    private ConvertTo convertTo;
    private ConvertAlgorithm convertAlgorithm;
    private Date date;
    private Result result;
    private JPanel panel;

    private JButton convert;
    private JButton clear;
    private JPanel buttonPanel;

    public CalendarConverter() {
        super("Calendar Converter");
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(1, 2));

        convertTo = new ConvertTo();
        date = new Date();
        result = new Result();

        setLayout(new GridLayout(3, 1));

        panel.add(date);
        panel.add(result);

        buildButton();

        add(convertTo);
        add(panel);
        add(buttonPanel);

        setVisible(true);
    }

    public void buildButton() {
        buttonPanel = new JPanel();

        buttonPanel.setBackground(Color.LIGHT_GRAY);

        convert = new JButton("Convert");
        convert.addActionListener(new ConvertButtonListener());

        clear = new JButton("Clear");
        clear.addActionListener(new ClearButtonListener());

        buttonPanel.add(convert);
        buttonPanel.add(clear);
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
    }

    private class ConvertButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            int day = date.getDate();
            int month = date.getMonth();
            int year = date.getYear();

            convertAlgorithm = new ConvertAlgorithm(day, month, year, convertTo.getFlag());

            day = convertAlgorithm.getDay();
            month = convertAlgorithm.getMonth();
            year = convertAlgorithm.getYear();

            result.setText(String.valueOf(day), String.valueOf(month), String.valueOf(year));
            result.changeColor(true);
            date.changeColor(false);
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            date.clearDateTextField();
            result.changeColor(false);
            date.changeColor(true);
        }
    }

    public static void main(String[] args) {
        new CalendarConverter();
    }
}