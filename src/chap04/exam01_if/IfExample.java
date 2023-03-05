package chap04.exam01_if;

public class IfExample {
	public static void main(String[] args) {
		
		int score = 93; // 93을 초기화
		
		if(score>=90) { // 90 이상이므로, ture가 되어서 아래 문장 실행
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score< 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
	}
}
