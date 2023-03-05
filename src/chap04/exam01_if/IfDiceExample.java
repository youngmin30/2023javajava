package chap04.exam01_if;
// 주사위 예제
public class IfDiceExample {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) + 1;
		// 1부터 시작하는 임의의 수 6개 중 하나를 무작위로 선정
		// 그 수를 int로 변환
		
		
		// if로 switch와 case 분기하는 문장처럼 만듦.
		// 두 문장의 차이는, if문으로는 범위도 가능함.
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num==2) {	
			System.out.println("2번이 나왔습니다.");
		} else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
