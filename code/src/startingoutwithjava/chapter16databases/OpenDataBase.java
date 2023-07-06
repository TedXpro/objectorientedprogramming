package code.src.startingoutwithjava.chapter16databases;

import java.sql.*;

public class OpenDataBase {
    public static void main(String[] args) {

        String password = "111222333";
        String userName = "postgres";
        String Fname = "Fname";
        String Lname = "Lname";
        String sid = "SID";
        String did = "DID";
        String age = "Age";

        final String DB_URL = "jdbc:postgresql://localhost:5432/University";
        try {
            Connection con = DriverManager.getConnection(DB_URL, userName, password);
            System.out.println("Connection Established");

            Statement stmt = con.createStatement();
            String sqlStatement = "SELECT * FROM Student where age >= 21 AND age <=25";
            String insertStatement = "INSERT INTO Student VALUES (1221, 'Belete', 'Abebe', '1111',30)";
            int rows = stmt.executeUpdate(insertStatement);
            ResultSet result = stmt.executeQuery(sqlStatement);

            System.out.println(rows);

            System.out.printf("  %5s | %10s | %10s | %10s | %5s \n", sid, Fname, Lname, did, age);
            int count = 1;
            while (result.next()) {
                System.out.printf(count + ".%5s | %10s | %10s | %10s | %5s \n",
                        result.getString(sid),
                        result.getString(Fname),
                        result.getString(Lname),
                        result.getString(did), result.getString(age));
                count++;
            }

            con.close();
            System.out.println("disconnected");

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
            return;
        }

    }
}
