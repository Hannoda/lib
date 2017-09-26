package utils;

import java.sql.*;


//TODO переименовать, мб разнести функционал
public class Utils {

    private static Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName("org.postgresql.Driver");
            dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }

    public static ResultSet selectFromDB(String selectTableSQL) {
        try {
            Connection dbConnection = getDBConnection();
            Statement statement = dbConnection.createStatement();
            ResultSet rs = statement.executeQuery(selectTableSQL);
            return rs;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null; //TODO (RETURN NULL)
    }

    public static void insert(String insertSQL) {
        try {
            Connection dbConnection = getDBConnection();
            Statement statement = dbConnection.createStatement();
            statement.executeUpdate(insertSQL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
