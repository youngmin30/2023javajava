package chap08sjw;
// (D)ata (A)ccess (O)bject
// 데이타베이스 접근 객체를 만들어 주는 인터페이스 
public interface Dao {
	boolean insert(Object obj);
	boolean delete(String key);
	boolean update(Object obj);
	Object select(String key);
	Object[] selectAll();
}
