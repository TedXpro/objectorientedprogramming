package code.src.startingoutwithjava.chapter16databases.idir.admin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdminLoginPage extends JPanel {
    private CardLayout parentCardLayout;
    private String identifier; // holds the member page .
    private JPanel mainPanel;

    private JLabel idLabel;
    private JLabel passLabel;
    private JLabel roleLabel;
    private JButton login;
    private JTextField idField;
    private JPasswordField passField;
    private JTextField roleField;

    public AdminLoginPage(CardLayout cardLayout, String identifier, JPanel mainPanel) {
        this.parentCardLayout = cardLayout;
        this.identifier = identifier;
        this.mainPanel = mainPanel;

        idLabel = new JLabel("Admin ID:");
        idLabel.setFont(new Font("Helvetica", Font.PLAIN, 16));
        idLabel.setForeground(Color.WHITE);

        passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Helvetica", Font.PLAIN, 16));
        passLabel.setForeground(Color.WHITE);

        JTextField idField = new JTextField(10);
        JPasswordField passField = new JPasswordField(10);

        login = new JButton("LOGIN");
        login.addActionListener(new LoginButtonListener());

        setLayout(new GridLayout());
        setBackground(new Color(73, 80, 87));

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST; // Set anchor to top left corner
        gbc.insets = new Insets(10, 10, 10, 10);


        gbc.gridx = 0;
        gbc.gridy = 1;
        add(idLabel, gbc);

        gbc.gridx = 1;
        add(idField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(passLabel, gbc);

        gbc.gridx = 1;
        add(passField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(login, gbc);
    }

    private class LoginButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            parentCardLayout.show(mainPanel,identifier);
        }
    }
}
