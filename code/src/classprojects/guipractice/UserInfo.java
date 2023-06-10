package code.src.classprojects.guipractice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UserInfo extends JFrame {
    private JLabel fname,
            lname,
            username,
            password,
            email, gender,
            phoneNumber;

    private JTextField fnamTextField,
            lnamTextField,
            usernamTextField,
            passworTextField,
            emailTextField,
            phonenumTextField;
    private JRadioButton male, female;

    private JPanel panel;
    private JButton register,
            canel;

    public UserInfo() {
        super("Sign Up");

        setSize(1000, 1000);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        build();

        add(panel);

        setVisible(true);
    }

    public void build() {
        fname = new JLabel("First Name");
        lname = new JLabel("Last Name");
        username = new JLabel("UserName");
        password = new JLabel("Password");
        email = new JLabel("Email");
        gender = new JLabel("Gender");
        phoneNumber = new JLabel("Phone Number");

        fnamTextField = new JTextField(10);
        lnamTextField = new JTextField(10);
        usernamTextField = new JTextField(10);
        passworTextField = new JTextField(10);
        emailTextField = new JTextField(10);
        phonenumTextField = new JTextField(10);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        register = new JButton("Register");
        canel = new JButton("Cancel");

        register.addActionListener(new ButtonListener());
        canel.addActionListener(new ButtonListener());

        panel = new JPanel();

        panel.add(fname);
        panel.add(fnamTextField);
        panel.add(lname);
        panel.add(lnamTextField);
        panel.add(username);
        panel.add(usernamTextField);
        panel.add(password);
        panel.add(passworTextField);
        panel.add(email);
        panel.add(emailTextField);
        panel.add(gender);
        panel.add(male);
        panel.add(female);
        panel.add(phoneNumber);
        panel.add(phonenumTextField);

        panel.add(register);
        panel.add(canel);
    }

    public static void main(String[] args) {
        new UserInfo();
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == register) {
                JOptionPane.showMessageDialog(null, "You have succesfully filled the required information",
                        "Successfull", 0);
                System.exit(0);
            } else if (e.getSource() == canel) {
                JOptionPane.showMessageDialog(null, "You have cancled the registration", "CANCEL", 0);
            }
        }
    }
}
/*
 * fname, lname, username, password, emailgender, phone number
 * agreetocondiion,
 * register cancel buttons
 */