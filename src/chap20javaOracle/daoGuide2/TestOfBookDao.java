package chap20javaOracle.daoGuide2;

// daoSampleday2의 핵심: BookDao, TestOfBookDao

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestOfBookDao {
	

	public static void main(String[] args) throws SQLException {

		TestOfBookDao testdao = new TestOfBookDao();
	    //testdao.testInsert();
		//testdao.testSelectAll();
		//testdao.testDelete();
		//testdao.testUpdate();
		testdao.testSelectOne();
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


	public void testInsert() throws SQLException {
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		Book vo = new Book(13,"자바정복","비젼출판",25000);
		int res = dao.insert(conn, vo);
		if(res>0) {
			System.out.println(vo+" 가 잘 입력되었습니다.");
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
