package code.src.startingoutwithjava.chapter16databases.idir.member;

import java.awt.BorderLayout;

import javax.swing.*;

public class GroupList extends JPanel {
    public GroupList() {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Group Members of Yohannes");

        String[] colNames = { "No.", "First Name", "Last Name" };
        String[][] rowData = { { "1", "Yohannes", "Belay" }, { "2", "Abebe", "Belete" } };

        JTable myTable = new JTable(rowData, colNames);
        JScrollPane scrollPane = new JScrollPane(myTable);

        add(label, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

}
