package chap20javaOracle.daoSample;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


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
