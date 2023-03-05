package chap20javaOracle.daoSample;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

// 민 확인 필요 //
public class BookTableTest2 {
	public static void main(String[] args) throws SQLException {
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		List<Book> list = dao.selectAll(conn);
		for(Book x : list) {
			System.out.println(x);
		}
	}
}
