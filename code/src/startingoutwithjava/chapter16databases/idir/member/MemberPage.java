package code.src.startingoutwithjava.chapter16databases.idir.member;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemberPage extends JPanel {
    private JPanel pagePanel;
    private String memberId;

    // panels for the page changes.
    private Profile profilePanel;
    private GroupList groupListPanel;
    private Dependents dependentsPanel;

    private CardLayout memberCardLayout;

    // panel and buttons for the west front.
    private JPanel buttonPanel;
    private JButton profileButton;
    private JButton groupListButton;
    private JButton dependentsButton;

    private final String PROFILE_IDENTIFIER = "profilePanel";
    private final String GROUP_LIST_IDETIFIER = "groupListPanel";
    private final String DEPENDENTS_IDENTIFIER = "dependentsPanel";

    public MemberPage() {
        setLayout(new BorderLayout());

        // setting up the button panel;
        buttonPanel = new JPanel(new GridLayout(5, 1));

        profileButton = new JButton("PROFILE");
        profileButton.addActionListener(new ButtonListener());
        groupListButton = new JButton("GROUP_LIST");
        groupListButton.addActionListener(new ButtonListener());
        dependentsButton = new JButton("DEPENDENTS");
        dependentsButton.addActionListener(new ButtonListener());

        buttonPanel.add(profileButton);
        buttonPanel.add(groupListButton);
        buttonPanel.add(dependentsButton);

        // setting the cardlayout pannels.
        memberCardLayout = new CardLayout();
        pagePanel = new JPanel(memberCardLayout);

        profilePanel = new Profile();
        dependentsPanel = new Dependents();
        groupListPanel = new GroupList();

        pagePanel.add(profilePanel, PROFILE_IDENTIFIER);
        pagePanel.add(groupListPanel, GROUP_LIST_IDETIFIER);
        pagePanel.add(dependentsPanel, DEPENDENTS_IDENTIFIER);

        memberCardLayout.show(pagePanel, PROFILE_IDENTIFIER);

        add(buttonPanel, BorderLayout.WEST);
        add(pagePanel, BorderLayout.CENTER);
    }

    public void setMemberId(String id) {
        memberId = id;
        profilePanel.populateProfileData(id);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == profileButton) {
                {
                    memberCardLayout.show(pagePanel, PROFILE_IDENTIFIER);
                }
            } else if (e.getSource() == groupListButton) {
                memberCardLayout.show(pagePanel, GROUP_LIST_IDETIFIER);
            } else if (e.getSource() == dependentsButton) {
                {
                    dependentsPanel.populateDependentsData(memberId);
                    memberCardLayout.show(pagePanel, DEPENDENTS_IDENTIFIER);
                }
            }
        }
    }
}
