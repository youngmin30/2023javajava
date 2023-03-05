package chap04.verify;

public class Exercise03 {
	
	public static void main(String[] args) {
		
		int sum = 0; // 변수 초기화
		
		for(int i=1; i<=100; i++) { // 
			if(i%3 == 0) { // i를 3으로 나눈 나머지가 0이면 아래 문장 실행
				sum += i; // sum = sum + i;
			}
		}
		
		System.out.println("3의 배수의 합: " + sum);
	}
}

