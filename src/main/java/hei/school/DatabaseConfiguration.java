package hei.school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {
    private static Connection connection;

    private DatabaseConfiguration(){
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/library_management_api",
                    System.getenv("DB_USER"),
                    System.getenv("DB_PASSWORD")
            );
        } catch (SQLException e) {
            System.out.println("Error while connecting to the database : " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (connection == null){
            new DatabaseConfiguration();
        }
        return connection;
    }

    public static void main(String[] args) {
        DatabaseConfiguration.getConnection();
    }
}
