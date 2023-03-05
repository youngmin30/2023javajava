package chap06.exam02_field_initialize;

public class KoreanExample {
	
	public static void main(String[] args) { // 실행 클래스
		
		
		// 객체 클래스 입장에서 외부 클래스인 실행 클래스에서 값을 받아서
		// 객체 생성할 때 보내주므로, 객체 클래스의 필드는 미리 초기화 되어 있어야 함.
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name); // k1 객체를 생성할 때, name의 값을 줌
		System.out.println("k1.ssn : " + k1.ssn); // k1 객체를 생성할 때, ssn 값을 줌.
		
		Korean k2 = new Korean("김자바", "930525-0654321"); /// k2 객체 생성할 때 위와 동일
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}

