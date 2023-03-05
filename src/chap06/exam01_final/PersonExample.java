package chap06.exam01_final;

public class PersonExample {
	
	public static void main(String[] args) { // 실행 클래스
		
		// 객체 생성
		Person p1 = new Person("123456-1234567", "계백"); // 객체 생성
		
		System.out.println(p1.nation); // final 필드로 객체 클래스에서 이미 지정한 값이 전달됨.
		System.out.println(p1.ssn); // ssn은 이 클래스에서 객체 생성시에 지정한 값 전달함
		System.out.println(p1.name); // 위와 동일
		
		// p1.nation = "usa"; // The final field Person.nation cannot be assigned
		// p1.ssn = "654321-7654321"; // The final field Person.ssn cannot be assigned
		p1.name = "을지문덕";;
		System.out.println(p1.name); // 추가코드. 매개 변수로 전달한 필드는 값이 변경됨. final필드는 변경불가.
		
	}
}

