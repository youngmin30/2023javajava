package chap04.exam01_if;
public class IfNestedExample {
	public static void main(String[] args) {
		
		int score = (int)(Math.random()*20) + 81;
		// 20개의 수를 무작위로 뽑는데, 그 중 가장 작은 수가 81이다. 
		// 81부터 20개의 수를 무작위로 얻고, 그 결과를 int로 변환한다.
		System.out.println("점수: " + score);
		
		String grade; // score에 따라서 grade를 주는 것
		
		if(score>=90) { // 90 이상의 점수이면
			if(score>=95) { // 95 이상의 점수인지 다시 확인
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {	
			if(score>=85) { // 90 이상의 점수가 아니라면, 85 이상인지 확인
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
	}
}
