package chap06.exam01_annotation;

public class Service {
	// 실행 내용1
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1"); 
	}

	// 실행 내용2
	@PrintAnnotation("*") // *은 아스타르라고 읽음.
	public void method2() {
		System.out.println("실행 내용2");
	}	
	
	// 실행 내용3
	@PrintAnnotation(value="#", number=20) // 매개 변수
	public void method3() {
		System.out.println("실행 내용3");
	}	
}
