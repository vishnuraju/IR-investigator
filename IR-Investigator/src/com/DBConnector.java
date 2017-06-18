package com;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {

	Connection con;
	private String url;
	private String user;
	private String pass;
	public Connection DBConnect(String url, String user, String pass) throws ClassNotFoundException
	{
		this.url = url;
		this.user = user;
		this.pass = pass;
		try {
			Connection con= DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			System.out.println("Connection Coulnot be established");
			e.printStackTrace();
		}
		return con;
		
	}
}
