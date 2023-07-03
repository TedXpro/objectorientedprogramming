package code.src.startingoutwithjava.chapter16databases.idir.member;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

import code.src.startingoutwithjava.chapter16databases.idir.Constants;

public class Dependents extends JPanel {
    // JPanel northPanel;
    JTable table;
    JScrollPane scrollPane;

    // JTe
    public Dependents() {
        setLayout(new BorderLayout());
    }

    public void populateDependentsData(String memberId) {
        String query = "SELECT d_fname, d_age, d_relationship FROM DEPENDENT where mid = '" + memberId + "';";
        try {
            Connection conn = DriverManager.getConnection(Constants.DB_URL, Constants.USERNAME, Constants.DB_PASSWORD);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet result = stmt.executeQuery(query);
            String[] colName = { "No.", "First Name", "Age", "RelationShip" };

            result.last();
            int numRows = result.getRow();
            result.first();

            int count = 1;
            String[][] rowData = new String[numRows][4];

            while (result.next()) {
                rowData[count - 1][0] = String.valueOf(count);
                rowData[count - 1][1] = result.getString("d_fname");
                rowData[count - 1][2] = result.getString("d_age");
                rowData[count - 1][3] = result.getString("d_relationship");
                count++;
            }

            table = new JTable(rowData, colName);
            scrollPane = new JScrollPane(table);

            JLabel label = new JLabel("Your Dependents");
            add(label, BorderLayout.NORTH);
            add(scrollPane, BorderLayout.CENTER);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
