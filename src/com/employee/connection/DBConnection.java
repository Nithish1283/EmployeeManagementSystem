package com.employee.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static Connection con;

	private static final String URL = "jdbc:mysql://localhost:3306/employee_management";
	private static final String USER = "root";
	private static final String PASSWORD = "root123"; // Change to your MySQL password

	public static Connection getConnection() {

		try {

			if (con == null || con.isClosed()) {

				Class.forName("com.mysql.cj.jdbc.Driver");

				con = DriverManager.getConnection(URL, USER, PASSWORD);

				System.out.println("Database Connected Successfully...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}