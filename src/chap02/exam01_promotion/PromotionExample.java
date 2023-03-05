package chap02.exam01_promotion;
public class PromotionExample {
	public static void main(String[] args) {	
		
		byte byteValue = 10;
		int intValue = byteValue; // 자동 타입 변환 promotion(byte 2바이트에서 int 4바이트)
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue; // 자동 타입 변환(char 2바이트에서 int 4바이트)
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);	// 자동 타입 변환(int 4바이트에서 long 8바이트)
		
		intValue = 200;
		double doubleValue = intValue; // 자동 타입 변환(int 4바이트에서 double 8바이트)
		System.out.println(doubleValue); // 200.0 200이 아니라, 더블형으로 출력
	} 
}
