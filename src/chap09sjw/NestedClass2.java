package chap09sjw;

public class NestedClass2 {
	int age = 20;// 멤버필드(전역변수성질)
	static String name = "홍길동";// 멤버필드(전역변수성질)

	public static void main(String[] args) {
		System.out.println(new NestedClass2().age);
		System.out.println(name);
		//-----------로칼클래스가 있는 메소드를 호출 
		new NestedClass2().someMethod2(30000);
		
		
		
	}
	public void someMethod() {
		System.out.println(age);
		System.out.println(name);
	}
	// 이 메소드의 내부에 있는 로컬클래스 내부로 
	// 매개변수값을 전달하려면 전달이 가능하나
	// 이 매개변수의 값을 수정할 수는 없다.
	
	public void someMethod2(int price) { // final 성질로 바뀜 
		System.out.println("일단:"+price);
		//price *= (1+.15); // 수정 
		int new_price = (int)(price *1.15);
		System.out.println("이단:"+price);
		// 로컬클래스 - 메소드 안에서 선언된 클래스 
		class LocalFood{
			void some() {
				System.out.println("이 로컬푸드 가격:"+price);
			}
		}
		LocalFood x = new LocalFood();
		x.some();
		
	}

}
