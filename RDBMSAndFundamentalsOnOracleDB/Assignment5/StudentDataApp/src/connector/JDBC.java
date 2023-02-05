package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

    public static String CONNECTION = "jdbc:mysql://localhost:3306/practice";
    public static String USERNAME = "root";
    public static String PASSWORD = "rickpass$124";
    private Connection connection;

    public JDBC setConnection() throws SQLException {
        connection = DriverManager.getConnection(CONNECTION, USERNAME, PASSWORD);
        return this;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

}
