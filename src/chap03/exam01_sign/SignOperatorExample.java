package chap03.exam01_sign;
//int와 short - 붙이는 코드

public class SignOperatorExample {
	public static void main(String[] args) { // 실행 클래스
		
		int x = -100;
		int result1 = +x; // result1=-100
		int result2 = -x; // result2=100
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
		//short result3 = -s;  //컴파일 에러
		int result3 = -s; 
		System.out.println("result3=" + result3); // result3=-100

	}
}

