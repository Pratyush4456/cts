package com.cts;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Main....");
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yashin","root","welcome");
	     Statement stmt=con.createStatement();
	     stmt.executeQuery("select * from divrit");
	     ResultSet set = stmt.executeQuery("select * from divrit");
	     while(set.next()) {
	    	 System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getInt(3));
	     }
	     con.close();
		}

}
	