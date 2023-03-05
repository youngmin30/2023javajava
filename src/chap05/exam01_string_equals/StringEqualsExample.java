package chap05.exam01_string_equals;

public class StringEqualsExample {
	
	public static void main(String[] args) {	
		
		// 그냥 변수에 값을 넣은 것
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) { // 양 변수가 신민철인지 == 연산자로 확인 ==> 번지 비교
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) { // strVar1이 strVar2와 같은지 equals()로 확인 결과가 위와 동일함. ==> 문자열 비교
			System.out.println("strVar1과 strVar2는 문자열이  같음");
		}
		
		// 객체를 만든 것
		String strVar3 = new String("신민철"); // 신민철
		String strVar4 = new String("신민철"); // 신민철
		
		if(strVar3 == strVar4) { // 양 변수를 확인함. ==> 번지 비교
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이  같음"); // ==> 번지 비교
		}		
	} 
}


/*
 * 	    아래 둘이 다른지
		// 그냥 변수에 값을 넣은 것
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		// 객체를 만든 것
		String strVar3 = new String("신민철"); // 신민철
		String strVar4 = new String("신민철"); // 신민철
*
*/