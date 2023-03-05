package chap06.exam04_overloading;

public class CalculatorExample {
	
	public static void main(String[] args) { // 실행 클래스
		
		Calculator myCalcu = new Calculator(); // 객체 생성
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10); // 객체 클래스에서 선언한 메소드 사용

		//직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20); // 객체 클래스에서 선언한 메소드 사용
		
		//결과 출력
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	}
}

