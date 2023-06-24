package code.src.startingoutwithjava.chapter16databases;

import java.sql.*;

public class OpenDataBase {
    public static void main(String[] args) {

        String password = "T#!nkP@dT15P";
        String userName = "postgres";

        final String DB_URL = "jdbc:postgresql://localhost:5432/University";
        try {
            Connection con = DriverManager.getConnection(DB_URL,userName,password);
            System.out.println("Connection Established");

            Statement stmt = con.createStatement();
            String sqlStatement = "SELECT Fname FROM Student";
            ResultSet result = stmt.executeQuery(sqlStatement);
            System.out.println(result);

            con.close();
            System.out.println("disconnected");

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
            return;
        }


    }
}
