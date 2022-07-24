package com.finance.appsb;

import java.sql.CallableStatement;
import java.sql.Connection;
import org.mariadb.jdbc.MariaDbDataSource;

import com.atomikos.icatch.jta.UserTransactionManager;

import java.sql.Statement;

import java.util.Properties;

public class TestMyCode {
	public static void runProc() throws Exception {
		  UserTransactionManager tm = new UserTransactionManager();

		Connection con;
		Statement stmt;
	    CallableStatement statement;
		
  try {
	
	  tm.setTransactionTimeout(40);
	  tm.begin();
	con = getMariaDBConnection();	
    statement = con.prepareCall("{call delayinsert()}");
    System.out.println("calling Stored procedure  !");
    statement.execute();
    System.out.println("Stored procedure called successfully!");
    statement.close();
    tm.commit();
	}
	catch (Exception e) {
	e.printStackTrace();
	}

	}	
	
	 public static Connection getMariaDBConnection() throws Exception{
	        String username = "root";
	        String password = "finance123";
	
	        Properties properties = new Properties();
	        properties.put("user", username);
	        properties.put("password", password);
	        properties.put("useBatchMultiSend", "false");
	        properties.put("usePipelineAuth", "false");

	        String url = "jdbc:mariadb://localhost:3306/finance";

	        MariaDbDataSource mysqlDataSource = new MariaDbDataSource();
	        mysqlDataSource.setUrl(url);
	        mysqlDataSource.setUser(username);
	        mysqlDataSource.setPassword(password);

	        return mysqlDataSource.getConnection();
	    }	

}
