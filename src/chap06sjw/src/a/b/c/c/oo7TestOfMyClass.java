package chap06sjw.src.a.b.c.c;

public class TestOfMyClass {

	public static void main(String[] args) {
		
		//MyClass m = new MyClass();
		System.out.println(MyClass.doubleLine(50));
		System.out.println("영상8℃ = "+MyClass.c2F(8)+"℉");
		System.out.println("8℉ = "+MyClass.f2C(8)+"℃");
		System.out.println("\n"+MyClass.getMailTail());
		System.out.println(MyClass.doubleLine(50));
		
		
		
	}
}
