package chap20javaOracle.daoGuide;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BookTableTest2g {
	public static void main(String[] args) throws SQLException {

		Connection conn = ConnFactoryg.getConnection();
		BookDaog dao = new BookDaog();
		List<Bookg> list = dao.selectAll(conn);
		for(Bookg x : list) {
			System.out.println(x);
		}
	}
}
