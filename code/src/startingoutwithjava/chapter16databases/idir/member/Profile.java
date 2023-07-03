package code.src.startingoutwithjava.chapter16databases.idir.member;

import java.awt.*;
import java.sql.*;

import javax.swing.*;

import code.src.startingoutwithjava.chapter16databases.idir.Constants;

public class Profile extends JPanel {
    private JLabel fNameLabel;
    private JLabel mNameLabel;
    private JLabel lNameLabel;
    private JLabel ageLabel;
    private JLabel sexLabel;
    private JLabel martialLable;
    private JLabel addressLabel;
    private JLabel bankLabel;
    private JLabel accountLabel;

    private JTextField fNameField;
    private JTextField mNameField;
    private JTextField lNameField;
    private JTextField ageField;
    private JTextField sexField;
    private JTextField martialField;
    private JTextField addressField;
    private JTextField bankField;
    private JTextField accountField;

    public Profile() {
        setLayout(new GridLayout(9, 2));
        JLabel label = new JLabel("Welcome Mr. ");

        fNameLabel = new JLabel("First Name:", SwingConstants.RIGHT);
        mNameLabel = new JLabel("Middle Name:", SwingConstants.RIGHT);
        lNameLabel = new JLabel("Last Name:", SwingConstants.RIGHT);
        ageLabel = new JLabel("Age:", SwingConstants.RIGHT);
        sexLabel = new JLabel("Sex:", SwingConstants.RIGHT);
        martialLable = new JLabel("Martial Status:", SwingConstants.RIGHT);
        addressLabel = new JLabel("Address:", SwingConstants.RIGHT);
        bankLabel = new JLabel("Bank:", SwingConstants.RIGHT);
        accountLabel = new JLabel("Account:", SwingConstants.RIGHT);

        fNameField = new JTextField(10);
        fNameField.setEditable(false);
        mNameField = new JTextField(10);
        mNameField.setEditable(false);
        lNameField = new JTextField(10);
        lNameField.setEditable(false);
        ageField = new JTextField(3);
        ageField.setEditable(false);
        sexField = new JTextField(1);
        sexField.setEditable(false);
        martialField = new JTextField(10);
        martialField.setEditable(false);
        addressField = new JTextField(10);
        addressField.setEditable(false);
        bankField = new JTextField(10);
        bankField.setEditable(false);
        accountField = new JTextField(10);
        accountField.setEditable(false);

        add(fNameLabel);
        add(fNameField);
        add(mNameLabel);
        add(mNameField);
        add(lNameLabel);
        add(lNameField);
        add(ageLabel);
        add(ageField);
        add(sexLabel);
        add(sexField);
        add(martialLable);
        add(martialField);
        add(addressLabel);
        add(addressField);
        add(bankLabel);
        add(bankField);
        add(accountLabel);
        add(accountField);

    }

    public void populateProfileData(String memberId) {
        try {
            Connection conn = DriverManager.getConnection(Constants.DB_URL, Constants.USERNAME, Constants.DB_PASSWORD);
            String query = "Select * from member where mid = '" + memberId + "';";

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                fNameField.setText(result.getString("m_fname"));
                mNameField.setText(result.getString("m_mname"));
                lNameField.setText(result.getString("m_lname"));
                sexField.setText(result.getString("m_sex"));
                ageField.setText(String.valueOf(result.getInt("m_age")));
                martialField.setText(result.getString("marital_status"));
                addressField.setText(result.getString("m_address"));

                bankField.setText(result.getString("bank"));                    
                accountField.setText(result.getString("m_accno"));

            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

}
