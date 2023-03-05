package chap06sjw.src.a.b.c.c;
// 클래스 구성 (멤버) - 3가지 (필드, 생성자, 메소드) 
// 사람을 모델링한 예 
// 모든 클래스는 Object 클래스를 자동으로 (묵시적) 상속받는다. - extends Object
public class oo1ClassCompose {
	// 필드 - 객체의 속성을 저장하는 변수 (전역변수 성질); 전역 - 전지역(클래스영역)
	String name; 
	String juminNo;
	String address; 
	String phoneNumber;
	// 생성자 -  객체를 생성하는 메소드 (객체의 초기화 작업) 
	public oo1ClassCompose() {
		name = "아무개";
		juminNo = "891212-2";
		address ="충남 공주";
		phoneNumber ="010-2323-3535";
	}
	// 메소드 - 객체를 사용하는 방법, 즉 객체활용시에 사용 (동적인 내용)
	// public ~ 누가나, 어디에서 던지 
	// int ~ 이 메소드 호출후 반환값의 타입 ,int 시작수, int 끝수 ~ 형식매개변수
	// 형식 매개변수에 실제값을 할당하는 것은 이 메소드를 호출할 때에 호출자가 결정한다. 
	// 반환할 결과가 필요없는 경우 - 일만 시킬 경우, void를 붙인다. 
	public int 암산(int 시작수, int 끝수) {
		int sum = 0;
		for(int i=시작수;i<=끝수;i++) {
			sum += i;
		}
		return sum;// 반환값이 있는 경우에는 반드시 1개이상의 return 문이 있어야.
	}
	
	// 객체표현 양식 - 정확하게 아래 메소드 선언줄과 일치하게 만들어야 함.
	// 왜 ~ 자바의 최고조상 Object가 가지고 있는 메소드를 
	// 수정해서 사용하는 형식 - 오버라이딩 이어서 정확하게 일치되어야 함.
	public String toString() {
		// 객체의 정보를 리턴을 위한 표현방식 
		return name+","+juminNo+","+address+","+phoneNumber;
	}
	
	
	
}
