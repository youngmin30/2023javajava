package chap06.exam03_method_call;

public class Calculator {
	//필드
	//생성자
	//메소드
	int plus(int x, int y) { // 리턴 타입 있는 메소드
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {// 리턴 타입 있는 메소드
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {// 리턴 타입 없는 메소드
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) { // 리턴 타입 없는 메소드
		System.out.println(message);
	}	
}

