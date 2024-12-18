import java.sql.*;

public class MySQLInfigo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/new_schema_infigo";
        String user = "root";
        String password = "free";

        Statement statement;
        ResultSet resultSet;

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            statement = connection.createStatement();
            resultSet = statement.executeQuery("Select * from id");

            System.out.println("Connection successful!");

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database", e);
        }


    }


}
