package org.zerock.dao;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTests {

    @Test
    public void testConnection()throws Exception {
        //Driver Loading -DynamicLoading
        Class.forName("org.mariadb.jdbc.Driver");

        Connection connection =
                DriverManager.getConnection("jdbc:mariadb://localhost:13306/webdb"
                ,"webdbuser"
                        ,"webdbuser");
        System.out.println(connection);

        connection.close();
    }
}
