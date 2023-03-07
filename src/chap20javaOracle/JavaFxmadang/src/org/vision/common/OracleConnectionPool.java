package chap20javaOracle.JavaFxmadang.src.org.vision.common;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

// 오라클 dbms를 사용할 수 있도록 Connection Pool을 만듦
public class OracleConnectionPool {
	private static OracleDataSource dataSource = null;
	static {
		try {
			dataSource = new OracleDataSource();
			dataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			dataSource.setUser("madang");
			dataSource.setPassword("madang");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	public static synchronized Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
}
