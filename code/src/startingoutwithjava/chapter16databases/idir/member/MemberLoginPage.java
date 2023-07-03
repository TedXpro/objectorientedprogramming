package code.src.startingoutwithjava.chapter16databases.idir.member;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

import code.src.startingoutwithjava.chapter16databases.idir.Constants;

public class MemberLoginPage extends JPanel {

    private CardLayout parentCardLayout;
    private String identifier; // holds the member page .
    private JPanel mainPanel;
    private MemberPage memberPage;

    private JLabel idLabel;
    private JLabel passLabel;
    private JTextField idField;
    private JPasswordField passField;
    private JButton login;
    private JLabel errorLabel;

    private String id;
    private String password;

    public MemberLoginPage(CardLayout parentCardLayout, String identifier, JPanel mainPanel, MemberPage memberPage) {
        this.parentCardLayout = parentCardLayout;
        this.identifier = identifier;
        this.mainPanel = mainPanel;
        this.memberPage = memberPage;

        idLabel = new JLabel("Member ID:");
        idLabel.setFont(new Font("Helvetica", Font.PLAIN, 16));
        idLabel.setForeground(Color.WHITE);

        passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Helvetica", Font.PLAIN, 16));
        passLabel.setForeground(Color.WHITE);

        idField = new JTextField(10);
        passField = new JPasswordField(10);

        login = new JButton("LOGIN");
        login.addActionListener(new LoginButtonListener());

        // setLayout(new GridLayout());
        setBackground(new Color(73, 80, 87));

        errorLabel = new JLabel("");

        // GridBagConstraints gbc = new GridBagConstraints();

        // gbc.gridx = 0;
        // gbc.gridy = 0;
        // gbc.anchor = GridBagConstraints.NORTHWEST; // Set anchor to top left corner
        // gbc.insets = new Insets(10, 10, 10, 10);

        // gbc.gridx = 0;
        // gbc.gridy = 1;
        add(idLabel);

        // gbc.gridx = 1;
        add(idField);

        // gbc.gridx = 0;
        // gbc.gridy = 2;
        add(passLabel);

        // gbc.gridx = 1;
        add(passField);
        //
        add(errorLabel);

        // gbc.gridx = 0;
        // gbc.gridy = 3;
        // gbc.gridwidth = 2;
        // gbc.anchor = GridBagConstraints.CENTER;
        add(login);

    }

    private class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            id = idField.getText();
            password = String.valueOf(passField.getPassword());

            try {
                Connection conn = DriverManager.getConnection(Constants.DB_URL, Constants.USERNAME,
                        Constants.DB_PASSWORD);

                String query = "SELECT mid, m_password FROM Member WHERE mid = '" +
                        id +
                        "' AND m_password = '"
                        + password + "';";
                Statement stmt = conn.createStatement();
                ResultSet result = stmt.executeQuery(query);

                if (result.next()) {
                    memberPage.setMemberId(id);
                    parentCardLayout.show(mainPanel, identifier);
                } else {
                    errorLabel.setText("Invalid UserName or Password");
                    errorLabel.setForeground(Color.red);
                }
                conn.close();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

}
