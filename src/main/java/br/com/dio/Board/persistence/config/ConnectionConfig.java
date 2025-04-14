package br.com.dio.Board.persistence.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionConfig {


    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/kanban";
        String user = "postgres";
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);
        return connection;
    }
}
