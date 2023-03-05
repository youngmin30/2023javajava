package chap06.exam01_final;

public class Person {
	
	// 필드
	// final필드? 초기값이 최종값이 되어 바꿀 수 없는 것
	final String nation = "Korea"; // final 필드에 초기값 주는 방법1: 필드 선언시 직접 값 준다.
	final String ssn; 
	String name;
	
	// 생성자
	public Person(String ssn, String name) { // 방법2: 생성자에서 초기값 지정(여기에서는 매개변수로 전달)
		this.ssn = ssn; 
		this.name = name;
	}
}

