package com.carsale.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	static String url = "jdbc:mysql://localhost:3306/dbcarsale";
	static String un = "root";
	static String pw = "";
	
	static Connection con = null;
	
	public static Connection getConnection() throws Exception{
		if(con == null){
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, un, pw);
		}
		return con;
	}
	
	
}
