package chap04.exam01_if;

public class IfElseExample {
	public static void main(String[] args) {
		
		int score = 85; // 정수형 변수 score에 85 초기값 선언
		
		if(score>=90) { // score가 90보다 크거나 같으면 블록 안을 실행
			System.out.println("점수가 90보다 큽니다."); 
			System.out.println("등급은 A 입니다.");
		} else { // 아니라면 블록 밖을 실행
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}
}
