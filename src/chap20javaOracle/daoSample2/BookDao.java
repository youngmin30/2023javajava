package chap20javaOracle.daoSample2;

// daoSampleday2의 핵심: BookDao, TestOfBookDao

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
// 다중 스레드에서 동시에 DAO 메서드를 호출할 때를 대비하려면 
// synchronized 블럭을 만들어야 하나 성능이 저하될 수 있다.
// 다중 스레드에서 동시에 DAO 메서드를 호출할 때가 아니라면
// 굳이 synchronized 블럭으로 만들 필요는 없다.
public class BookDao implements Dao<Book, Integer> {

	@Override
	public int insert(Connection conn, Book vo) throws SQLException {
		// TODO 새로은 자료를 디비에 등록하는 작업
		String sql = "INSERT INTO BOOK (BOOKID,BOOKNAME,PUBLISHER,PRICE) VALUES(?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, vo.getBookid());
		pstmt.setString(2,vo.getBookname());
		pstmt.setString(3,vo.getPublisher());
		pstmt.setInt(4,vo.getPrice());
		int res = pstmt.executeUpdate();//select 질의는 pstmt.executeQuery()
		
		if (conn != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		return res;
	}

	@Override
	public int insert(Connection conn, Map<String, Object> map) throws SQLException {
//		// TODO 수행과제  min ver 틀린 코드
//		String sql = "INSERT INTO BOOK (BOOKID, BOOKNAME, PUBLISHER, PRICE) " +
//				"VALUES ('?, ?, ?, ?')";
//		PreparedStatement pstmt = conn.prepareStatement(sql);
//		pstmt.setValue(1, key);
//		int res = pstmt.executeQuery();
//
//		if ( conn != null );
//		    pstmt.close();
//		if (conn != null );
//		    conn.close();
//		return res;
	}

	@Override
	public int delete(Connection conn, Integer key) throws SQLException {
		String sql = "DELETE BOOK WHERE BOOKID = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key);
		int res = pstmt.executeUpdate();
		if (conn != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		return res;
	}

	@Override
	public int update(Connection conn, Book vo) throws SQLException {
		// UPDATE 질의엔 반드시 where절이 있어야 위험하지 않다. 
		String sql = "UPDATE BOOK SET BOOKNAME=?, PUBLISHER=?,PRICE=? WHERE BOOKID=?"; 
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,vo.getBookname());
		pstmt.setString(2,vo.getPublisher());
		pstmt.setInt(3,vo.getPrice());
		pstmt.setInt(4,vo.getBookid());
		int res = pstmt.executeUpdate();
		if (conn != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		return res;
	}

	@Override
	public Book selectOne(Connection conn, Integer key) throws SQLException {
		String sql = "SELECT * FROM BOOK WHERE BOOKID = ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key);
		Book vo = new Book();// 빈껍데기
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			vo.setBookid(rs.getInt("BOOKID"));
			vo.setBookname(rs.getString("BOOKNAME"));
			vo.setPublisher(rs.getString("PUBLISHER"));
			vo.setPrice(rs.getInt("PRICE"));
		}
		if (conn != null)
			rs.close();
		if (conn != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		
		
		return vo;
	}

	@Override
	public List<Book> selectAll(Connection conn) throws SQLException {
		String sql = "SELECT * FROM BOOK";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<Book> list = new ArrayList<>();
		while (rs.next()) {
			Book vo = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			list.add(vo);
		}
		if (conn != null)
			rs.close();
		if (conn != null)
			pstmt.close();
		if (conn != null)
			conn.close();
		return list;
	}

	@Override
	public List<Book> selectCondition(Connection conn, String condition) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
