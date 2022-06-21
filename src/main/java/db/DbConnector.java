package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    private final String url = "jdbc:mysql://localhost:3306/revision";
    private final String user = "root";
    private final String password = "Mutoni@2020";

    private Connection connection = null;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection != null) return this.connection;

        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}


