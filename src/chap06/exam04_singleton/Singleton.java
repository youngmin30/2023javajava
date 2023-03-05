package chap06.exam04_singleton;

public class Singleton { // 단 하나만 생성되는 객체 싱글톤
// 싱글톤을 만들려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 private를 붙여야 함.
	
	// 필드(정적 필드)
	// 접근제한자 정적객체
	private static Singleton singleton = new Singleton(); // 정적 객체
	
	// 생성자
	// 접근제한자 클래스명
	private Singleton() {}
	
	
	// 정적 메소드
	// static 클래스명 메소드명
	static Singleton getInstance() {
		return singleton;
	}
}

