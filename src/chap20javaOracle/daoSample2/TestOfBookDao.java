package chap20javaOracle.daoSample2;

// daoSampleday2의 핵심: BookDao, TestOfBookDao
// Dao를 BookDao에서 구현하고, BookDao에 있는 메소드들을 하나씩 테스트하는 TestOfBookDao

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
	// 자료 선택
	public void testSelectAll() throws SQLException {

		Connection conn = ConnFactory.getConnection(); // ConnFactory에서 conn 객체는 오라클과 클라이언트 컴퓨터를 연결하는 통로이다.

		BookDao dao = new BookDao(); // dao를 사용함.

		List<Book> list = dao.selectAll(conn); // Book에 있는 자료들을 List에 넣고, 모두 선택함
		for(Book x : list) { // list에 있는 Book 하나씩을 선택하여 출력함.
			System.out.println(x);
		}
	}


	// 자료 삽입
	public void testInsert() throws SQLException {
		Connection conn = ConnFactory.getConnection(); // ConnFactory에서 Connection 데려오기
		
		BookDao dao = new BookDao(); // 객체 생성
		Book vo = new Book(13,"자바정복","비젼출판",25000); // 객체 생성하고, 해당되는 값 넣음.
		int res = dao.insert(conn, vo); // res에 다오에서 삽입받은 것을 넣음.
		if(res>0) {
			System.out.println(vo+" 가 잘 입력되었습니다.");
		}
	}

	
	// 삭제하는 것
	public void testDelete() throws SQLException{
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		int res = dao.delete(conn, 13);
		if(res>0) {
			System.out.println("키 bookid"+13+"번을 지웠습니다.");
		}
	}


	// Update 수정하는 것
	public void testUpdate() throws SQLException{
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao(); // dao 객체 생성
		Book vo = new Book(9,"올림픽 이야기","삼성당",7500); // vo 객체 생성

		int res = dao.update(conn, vo); // dao를 update하면 conn과 vo가 나옴.

		if(res>0) { // res가 0 이상이면 자료를 수정함(자료가 하나라도 있으면)
			System.out.println("자료를 수정했습니다.");
		}else { // res가 0과 같거나 작으면 아래 자료를 수정하지 않음.
			System.out.println("자료를 수정하지 못하였습니다.");
		}
		
	}


	public void testSelectOne() throws SQLException {
		Connection conn = ConnFactory.getConnection();
		BookDao dao = new BookDao();
		Book vo = dao.selectOne(conn, 10); // 10번 하나만 선택하는 것
		System.out.println(vo);
	}

}
