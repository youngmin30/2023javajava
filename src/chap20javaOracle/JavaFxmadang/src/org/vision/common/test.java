package chap20javaOracle.JavaFxmadang.src.org.vision.common;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

// DBCP ==> Oracle Connection Pool 오라클 Connection pool을 만듦.

public class test {
	
	private static OracleDataSource dataSource = null;
	
	// 초기화 블럭
	static {
		try {
			dataSource = new OracleDataSource();
			dataSource.setSQL("jdbc:oracle:thin:@localhost:1521:xe");
			dataSource setUser("madang");
			dataSource setPassword("madang");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	public static synchronized Connection getConnection() throws SQLException {
		return dataSource getConnection();
		
	}
	
	
	
	
	
	

}
