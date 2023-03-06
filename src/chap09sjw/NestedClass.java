package chap09sjw;
// 중첩클래스 연습

public class NestedClass {
	
	class B{} 
	
	static class C{} 
	// 클래의 멤버필들로 중첩(이너)클래스를 사용할 수 있다.
	B bobj = new B();
	C cobj = new C();
	// static B bobj2 = new B();
	static C cobj2 = new C();
	
	// 어떤 메소드 내에서도 위의 중첩클래스를 사용할 수 있다. 
	void someMethod() {
		B bobj = new B();
		C cobj = new C();
		//static B bobj2 = new B();
		//static C cobj2 = new C();
	}
	static void  someMethod2() {
		//B bobj = new B();
		C cobj = new C();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
