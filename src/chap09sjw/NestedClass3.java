package chap09sjw;
// 익명객체

public class NestedClass3 {
	
	// 익명객체를 생성했다.
	Parent p = new Parent("윤선도",98) {
		// 새로운 필드가 추가  - 내부에서만 사용가능
		int children = 19;
		void someMethod() {
			System.out.println("someMethod()를 호출~~");
			System.out.println("자녀수:"+children);
			newMethod();
		}
		// 새로운메소드 추가 - 내부에서만 호출가능
		void newMethod() {
			System.out.println("추가한 메소드의 호출입니다~~~");
		}
	};

	public static void main(String[] args) {
		NestedClass3 x = new NestedClass3();
		System.out.println(x.p);
		x.p.someMethod();
		// 익명객체 만들 때에 추가된 필드나 메소드는 그 객체 바깥에서는
		// 사용이 불가하다.
		//System.out.println(p.children);
		//p.newMethod();
		
	}

}
