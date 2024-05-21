import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class JdbcCreateDatabaseExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        // Database connection parameters (connecting to the server, not a specific database)
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "password";

        // SQL to create a new database
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS mydatabase";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {
            
            // Execute SQL to create the database
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database created successfully.");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
