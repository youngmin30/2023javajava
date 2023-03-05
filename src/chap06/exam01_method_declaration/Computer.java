package chap06.exam01_method_declaration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * 배열의 값을 잘 모를 때 배열을 만드는 방법 
 * 방법1 int sum1(int[] values) {
 * 방법2 int sum2(int ... values) {
 */
public class Computer { // 객체 클래스
	
	int sum1(int[] values) { // 실행 후 int 타입을 반환하는 메소드, 매개 변수로 배열 선언하고 모든 항목을 더함
		
		int sum = 0;
		
		for(int i=0; i<values.length; i++) { // 배열의 길이보다 i가 작은 동안까지 반복 
			sum += values[i]; // 반복하면서 sum에 배열의 인덱스를 입력
		}
		return sum; // sum을 반환
	}
	
	// ... 매개 변수가 몇 개인지 모를 때 선언한 바법
	// int 값이 여러 개가 들어올 수 있다는 의미로 아래 문장 쓴다.
	int sum2(int ... values) { // ...의 이름
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}

/* 둘은 모습은 다르지만 배열을 만들어서 값을 더하는 같은 기능을 함.
int sum1(int[] values) {
int sum2(int ... values) {
배열의 모든 값 더해서 출력
*/

