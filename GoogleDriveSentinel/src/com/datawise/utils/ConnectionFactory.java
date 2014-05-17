package com.datawise.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection con = null;
	
	public static Connection openConnection() {
		
		try {
		      Class.forName("com.ibm.db2.jcc.DB2Driver");
		    }
		    catch(ClassNotFoundException e) {
		    e.printStackTrace();
		    }
		    try {
				con = DriverManager.getConnection("jdbc:db2://188.226.203.247:50000/DBWISE", "db2inst1", "Cu2sl6kw9cv5");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return con;
		
	}
	
	public static void closeConnection(){
		if(con != null){
			try {
				if(!con.isClosed()){
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
