package chap06.exam01_method_declaration;

public class Calculator {
	
	
	//메소드
	void powerOn() { // 메소드 실행 후 리턴 타입이 없는 메소드
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) { // 실행 후 리턴 타입이 int인 메소드
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) { // 실행 후 리턴 타입이 double인 메소드
		double result = (double)x / (double)y; // double이 float보다 정확함
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
}
