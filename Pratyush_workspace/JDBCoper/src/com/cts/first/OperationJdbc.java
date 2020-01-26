package com.cts.first;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;



public class OperationJdbc {
	
	public static void main(String[] args) {
		System.out.println("Main....");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","welcome");
			Statement stmt=con.createStatement();
			ArrayList<Student> list = new ArrayList<Student>();
			ResultSet set = stmt.executeQuery("select * from Student");
			while(set.next()) {
				Student st = new Student(set.getInt(1),set.getString(2),set.getDate(3),set.getBoolean(4));
				list.add(st);
			}
			Iterator<Student> it = list.iterator();
			while(it.hasNext()) {
				Student s = it.next();
				System.out.println(s);
			}

			/*stmt.executeQuery("select * from divrit");
		stmt.executeQuery("insert into divrit(sp1,sp2,sp3) values(34,'perfect',876)")
		ResultSet set = stmt.executeQuery("select * from divrit");
		while(set.next()) {
			System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getInt(3));
		}*/
			con.close();
		}
		catch (Exception e){

			System.out.println(e);

		}

	}

}
class Student
{
	int id;
	String name;
	java.util.Date dob;
	boolean flag;

	public Student(int id, String name, java.util.Date dob, boolean flag) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.flag = flag;
	}
	@Override
	public String toString()
	{
		return"id="+id+",name="+name+",dob="+dob+",flag="+flag+"";
	}

}
