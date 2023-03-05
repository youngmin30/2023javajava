package chap06.exam16;
// 같은 패키지에 있는 PrinterExample.java에 있는 값을
// 타입에 맞게 가져와서 이쪽에서 만들어서 출력하는 예제

public class Printer {
	void println(int value) { // 매개변수자리에 어딘가로부터 값을 받아서, 아래로 가져가는 것
		System.out.println(value);
	}
	
	void println(boolean value) { // 위와 동일
		System.out.println(value);
	}
	
	void println(double value) {
		System.out.println(value);
	}
	
	void println(String value) {
		System.out.println(value);
	}
}
