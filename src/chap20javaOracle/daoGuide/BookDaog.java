package chap20javaOracle.daoGuide;

// 이 클래스에서 사용한 클래스
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookDaog implements Daog<Bookg,Integer> {

	@Override
	synchronized public int insert(Connection conn, Bookg vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Connection conn, Map<String, Object> map) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Connection conn, Integer key) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Connection conn, Bookg vo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Bookg selectOne(Connection conn, Integer key) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookg> selectAll(Connection conn) throws SQLException {
		String sql = "SELECT * FROM BOOK";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		List<Bookg> list = new ArrayList<>();
		while(rs.next()) {
			Bookg vo = new Bookg(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			list.add(vo);
		}
		if (conn!=null) rs.close();
		if (conn!=null) pstmt.close();
		if (conn!=null) conn.close();
		return list;
	}

	@Override
	public List<Bookg> selectCondition(Connection conn, String condition) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
