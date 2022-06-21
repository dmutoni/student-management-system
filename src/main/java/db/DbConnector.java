package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    private final String url = "jdbc:mysql://localhost:3306/students_sms";
    private final String user = "denyse";
    private final String password = "Mutoni@2020";

    private Connection connection = null;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        if (this.connection != null) return this.connection;

        Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}


