package org.example.w1.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectDB {

    public void Connection()throws Exception {
        //Driver Loading -DynamicLoading
        Class.forName("org.mariadb.jdbc.Driver");

        Connection connection =
                DriverManager.getConnection("jdbc:mariadb://localhost:13306/parkdb"
                        ,"parkdbuser"
                        ,"parkdbuser");
        System.out.println(connection);

        Statement statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM todo_table");
        connection.close();
    }
}
