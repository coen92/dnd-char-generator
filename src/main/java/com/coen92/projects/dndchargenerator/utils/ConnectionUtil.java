package com.coen92.projects.dndchargenerator.utils;

import java.sql.*;

public class ConnectionUtil {

    private static Connection connection = null;
    private static PreparedStatement statement = null;
    private static ResultSet resultSet = null;

    private static String dbUrl = "jdbc:mysql://localhost:3306/dnd_main_table?useSSL=false";
    private static String user = "coen92";
    private static String password = "coenpass";

    public static Connection connectDatabase() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl, user, password);

            return connection;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Exception found: " + e.getMessage());

            return null;
        }
    }
}
