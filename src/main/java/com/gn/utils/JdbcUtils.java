package com.gn.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {

		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL ="jdbc:mysql://localhost:3306/gn?characterEncoding=utf-8";
		static final String USER="root";
		static final String PASS="root";
		
		Connection conn = null;
	    Statement stmt = null;
    
    	
	    //获取数据库连接
	    public Connection getConnection() throws SQLException, ClassNotFoundException {
	    	Class.forName(JDBC_DRIVER);
	    	conn = DriverManager.getConnection(DB_URL,USER,PASS);
	    	return conn;
	    }   
}
