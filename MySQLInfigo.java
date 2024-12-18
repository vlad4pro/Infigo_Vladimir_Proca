import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLInfigo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/new_schema_infigo";
        String user = "root";
        String password = "free";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database", e);
        }


    }


}
