package chap06.exam01_method_declaration;

public class CalculatorExample {
	
	public static void main(String[] args) { // 실행 클래스
		
		// 객체 생성
		Calculator myCalc = new Calculator(); // 객체 생성
		myCalc.powerOn(); // 그 객체에서 powerOn() 메소드 사용하자
		
		int result1 = myCalc.plus(5, 6); // 변수에 앞에서 만든 객체에 plus() 기능을 넣자
		System.out.println("result1: " + result1); // 그 결과를 출력
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); // 바이트형인 두 수를 나누는 기능을 실행하고 result2에 저장하자
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
	}
}


/*
* 
*/