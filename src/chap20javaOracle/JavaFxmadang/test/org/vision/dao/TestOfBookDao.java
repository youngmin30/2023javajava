package chap20javaOracle.JavaFxmadang.test.org.vision.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.vision.common.ConnFactory;
import org.vision.vo.Book;

public class TestOfBookDao {
	

	public static void main(String[] args) throws SQLException {
		TestOfBookDao testdao = new TestOfBookDao();
	    //testdao.testInsert();
		testdao.testSelectAll();
		//testdao.testDelete();
		//testdao.testUpdate();
		//testdao.testSelectOne();
		//testdao.testInsert2();
		//testdao.testSelectCondition();
	}
	// test case 
	// public, void, 매개변수 없어야 하고, 한 가지만 테스트 
	public void testSelectAll() throws SQLException {
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		List<Book> list = dao.selectAll(conn);
		for(Book x : list) {
			System.out.println(x);
		}
	}
	public void testSelectCondition() throws SQLException {
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		String condition = "WHERE BOOKID > 5";
		List<Book> list = dao.selectCondition(conn,condition);
		for(Book x : list) {
			System.out.println(x);
		}
	}
	
	
	public void testInsert() throws SQLException {
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		Book vo = new Book(13,"자바정복","비젼출판",25000);
		int res = dao.insert(conn, vo);
		if(res>0) {
			System.out.println(vo+" 가 잘 입력되었습니다.");
		}
	}
	public void testInsert2() throws SQLException {
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		Map<String,Object> map = new HashMap<>();
		map.put("BOOKID", 13);
		map.put("BOOKNAME","자바정복");
		map.put("PUBLISHER", "비젼출판");
		map.put("PRICE", 25000);
		
		int res = dao.insert(conn, map);
		if(res>0) {
			System.out.println(map+" 이 잘 입력되었습니다.");
		}
	}
	public void testDelete() throws SQLException{
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		int res = dao.delete(conn, 13);
		if(res>0) {
			System.out.println("키 bookid"+13+"번을 지웠습니다.");
		}
	}
	public void testUpdate() throws SQLException{
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		Book vo = new Book(9,"올림픽 이야기","삼성당",7500);
		int res = dao.update(conn, vo);
		if(res>0) {
			System.out.println("자료를 수정했습니다.");
		}else {
			System.out.println("자료를 수정하지 못하였습니다.");
		}
	}
	public void testSelectOne() throws SQLException {
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		Book vo = dao.selectOne(conn, 10);
		System.out.println(vo);
	}

}