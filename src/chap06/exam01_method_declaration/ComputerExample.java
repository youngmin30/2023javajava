package chap06.exam01_method_declaration;

public class ComputerExample {
	
	public static void main(String[] args) { // 실행 클래스
		
		// 객체 생성
		Computer myCom = new Computer(); // myCom이라는 객체 생성
		
		// int형 배열
		int[] values1 = {1, 2, 3}; // 배열 만들고 값 넣기
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1); // result1: 6
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});  // 앞의 과정을 메소드로 만들고, 그 메소드의 실행을 넣음
		System.out.println("result2: " + result2);	// result2: 15
		
		int result3 = myCom.sum2(1, 2, 3); // result3: 6
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5); // result4: 15
		System.out.println("result4: " + result4);
	}
}


/* minver
아래 두 문장은 배열을 만들어서 값 넣은 것
배열을 만들어 값 넣는 메소드를 만들고 변수(=객체)에 넣은 것
int[] values1 = {1, 2, 3}; ==> 결과는 6
int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5}); ==> 결과는 15

아래 두 문장은 메소드의 매개변수로 값을 넣은 것
int result3 = myCom.sum2(1, 2, 3); ==> 결과는 6
int result4 = myCom.sum2(1, 2, 3, 4, 5); ==> 결과는 15
*/

