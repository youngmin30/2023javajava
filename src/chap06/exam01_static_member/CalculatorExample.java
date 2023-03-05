package chap06.exam01_static_member;

public class CalculatorExample { // 실행 클래스
	
	public static void main(String[] args) { // 실행 메소드
		
		// 객체 클래스에서 선언한 메소드 사용
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		// 결과 확인
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
