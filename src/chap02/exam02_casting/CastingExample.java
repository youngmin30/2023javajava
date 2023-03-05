package chap02.exam02_casting;
public class CastingExample {
	public static void main(String[] args) {	
		
		int intValue = 44032;
		char charValue = (char) intValue; // int 4바이트, char 2바이트로 강제 타입 변환
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue); // int로 강제 타입 변환, 500만 출력
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue); // int로 강제 타입 변환, 3만 출력	
	} 
}
