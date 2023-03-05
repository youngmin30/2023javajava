package chap06.exam16;

public class PrinterExample {
	public static void main(String[] args) {
		
		Printer printer = new Printer(); // 객체 생성
		
		printer.println(10); // 10
		printer.println(true); // true
		printer.println(5.7); // 5.7
		printer.println("홍길동"); // 홍길동
	}
}

// int, boolean, string
// 메소드 이름은 같은데 매개변수의 수, 타입, 순서를 다르게 만드는 것? 메소드 오버로딩
