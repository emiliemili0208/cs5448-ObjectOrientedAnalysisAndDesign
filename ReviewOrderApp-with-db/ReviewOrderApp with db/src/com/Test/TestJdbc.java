package com.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/projectdb?useSSL=false";
		String user = "root";
		String pass = "0000";
		try{
			System.out.println("Connecting to databse:" + jdbcUrl);

			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

			System.out.println("Connection successful");
		}
		catch (Exception exc){
			exc.printStackTrace();
		}

	}

}
