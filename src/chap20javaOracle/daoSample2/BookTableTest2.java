package chap20javaOracle.daoSample2;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BookTableTest2 {

	public static void main(String[] args) throws SQLException {

		Connection conn1 = ConnFactory.getConnection();
		Connection conn2 = ConnFactory.getConnection();
		Connection conn3 = ConnFactory.getConnection();
		Connection conn4 = ConnFactory.getConnection();

		System.out.println(conn1.equals(conn2));
		System.out.println(conn3.equals(conn4));
		System.out.println(conn1.equals(conn4));


		List<Book> list = dao.selectAll(conn1);
		for(Book x : list) {
			System.out.println(x);
		}
	}
}
