package code.src.startingoutwithjava.chapter16databases.idir;

import javax.management.loading.PrivateClassLoader;
import javax.swing.*;

import code.src.classprojects.shapes.Main;
import code.src.startingoutwithjava.chapter16databases.edir.Admin;
import code.src.startingoutwithjava.chapter16databases.idir.admin.AdminLoginPage;
import code.src.startingoutwithjava.chapter16databases.idir.admin.AdminPage;
import code.src.startingoutwithjava.chapter16databases.idir.member.MemberLoginPage;
import code.src.startingoutwithjava.chapter16databases.idir.member.MemberPage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Idir extends JFrame {
    private final int WIDTH = 700;
    private final int LENGTH = 500;
    private JPanel mainPanel; // to holds any panel;
    private CardLayout cardLayout;
    private JPanel frontPanel; // holds the front page panel;
    private MemberPage memberPage;
    private AdminPage adminPage;
    private MemberLoginPage memberLoginPage;
    private AdminLoginPage adminLoginPage;
    JButton memberButton;
    JButton adminButton;

    private final String MEMBER_LOGIN_PAGE = "memberLoginPage";
    private final String ADMIN_LOGIN_PAGE = "adminLoginPage";
    private final String ADMIN_PAGE = "adminPage";
    private final String MEMBER_PAGE = "memberPage";
    private final String FRONT_PAGE = "frontPage";

    /***
     * Main Panel elements
     * front page
     * member login page
     * member page
     * admin login page
     * admin page
     */

    public Idir() {
        super("Sem Awetulet Idir");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, LENGTH);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(73, 80, 87));

        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        frontPanel = new JPanel(new BorderLayout());
        createFrontPage();

        memberPage = new MemberPage();
        adminPage = new AdminPage();

        memberLoginPage = new MemberLoginPage(cardLayout, MEMBER_PAGE, mainPanel, memberPage);
        adminLoginPage = new AdminLoginPage(cardLayout, MEMBER_PAGE, mainPanel);

        mainPanel.add(frontPanel, FRONT_PAGE);
        mainPanel.add(memberLoginPage, MEMBER_LOGIN_PAGE);
        mainPanel.add(memberPage, MEMBER_PAGE);
        mainPanel.add(adminLoginPage,ADMIN_LOGIN_PAGE);
        mainPanel.add(adminPage, ADMIN_PAGE);

        cardLayout.show(mainPanel, FRONT_PAGE);
        add(mainPanel);

        setVisible(true);
    }

    /**
     * creates the front page once.
     */
    public void createFrontPage() {
        JPanel centerPanel = new JPanel(); // holds the elements in the center of the panel;
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel welcomeLabel = new JLabel("Welcome To Idir"); // front label;
        welcomeLabel.setFont(new Font("San Serif", Font.BOLD, 75));
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        welcomeLabel.setForeground(Color.WHITE);

        JLabel loginAsLabel = new JLabel("Login as"); // login as label;
        loginAsLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        loginAsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginAsLabel.setForeground(Color.WHITE);

        memberButton = new JButton("Member"); // the Member button;
        memberButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        memberButton.addActionListener(new ButtonListener());

        adminButton = new JButton("Admin"); // the admin button;
        adminButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        adminButton.addActionListener(new ButtonListener());

        memberButton.setPreferredSize(new Dimension(100, 50));
        adminButton.setPreferredSize(new Dimension(100, 50));

        // adding the buttons and the labels;
        centerPanel.setBackground(new Color(73, 80, 87));
        centerPanel.add(Box.createVerticalGlue());
        centerPanel.add(welcomeLabel);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(loginAsLabel);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(memberButton);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        centerPanel.add(adminButton);
        centerPanel.add(Box.createVerticalGlue());

        frontPanel.add(centerPanel, BorderLayout.CENTER);

    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == memberButton) {
                cardLayout.show(mainPanel, MEMBER_LOGIN_PAGE);
            } else {
                cardLayout.show(mainPanel, ADMIN_LOGIN_PAGE);
            }
        }
    }

    
    
    public static void main(String[] args) {
        // SwingUtilities.invokeLater(new Runnable() {
        // public void run
        // });
        new Idir();
    }
}
