package com.bus.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {

	public static Connection provideConnection() {
	    Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            // TODO: handle exception
        }
        String url = "jdbc:mysql://localhost:3306/Busreservation";
        try {
            conn =DriverManager.getConnection(url, "root", "rahul@7453");
        } catch (Exception e) {
            // TODO: handle exception
        }
               
        return conn;
	}
}
