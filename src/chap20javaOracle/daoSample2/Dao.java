package chap20javaOracle.daoSample2;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

// DAO (Database Access Object) 
// 수 많은 다오들의 메소드를 통일이 시키기 위해 인터페이스를 먼저 선언한다.
// 타입을 유보시킨것 ==> Generic Type
public interface Dao<T,K> {
	// CRUD 
	public int insert(Connection conn,T vo) throws SQLException;
	public int insert(Connection conn,Map<String,Object> map) throws SQLException;
	public int delete(Connection conn,K key) throws SQLException;
	public int update(Connection conn,T vo) throws SQLException;
	public T selectOne(Connection conn,K key) throws SQLException;
	public List<T> selectAll(Connection conn) throws SQLException;
	public List<T> selectCondition(Connection conn,String condition) throws SQLException;

}
