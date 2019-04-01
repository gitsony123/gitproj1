package com.nt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("gud mrng");
System.out.println("gud aftn ");
System.out.println("hello github welcome");
try {
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
	//create jdbc statement
	Statement st=con.createStatement();
	//execute query and process the result object
	ResultSet rs=st.executeQuery("select * from emp");
	while(rs.next()!=false)
	{
		System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
		
		//sony ajay sow mahi
	}
}
catch(SQLException se) {
se.printStackTrace();
}
	}

}
