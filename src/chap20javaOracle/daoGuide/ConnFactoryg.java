package chap20javaOracle.daoGuide;

// OracleHello로 jdbc 연결하는 4단계 중 두 단계만 connFactory로 분리한 것
// 나머지는

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 싱글톤 
public class ConnFactoryg {
	
	private static Connection conn;
	
	// 초기화 블럭 
	static {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "madang";
		String password = "madang";
		
		try {
			// 1단계 - 드라이버 점검 및 로딩 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2단계 - Connection객체 ~ 오라클과 통신하는 회선(통로)
			conn = DriverManager.getConnection(url,user,password);
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection getConnection() {
		return conn;
	}
}
