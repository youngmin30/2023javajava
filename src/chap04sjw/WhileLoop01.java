package chap04sjw;
// for ~ 하는 동안, while ~ 하는 동안 
// for문은 반복할 횟수가 미리 예견되는 경우
// while문은 반복할 횟수를 미리 재단하기 어려운 경우 
public class WhileLoop01 {

	public static void main(String[] args) {
		// 조금 난해 합니다. 
		// 임의의 숫자를 컴퓨터가 만들어 내는 법 
		// 정수 1~1000 사이의 숫자를 발생시킬 수 있다.
		// Math.random() 이 결과는 0~0.999999 사이의 double형 실수 임의 만들어줌
		
		// 1~ 45 (로또 숫자 범위) 
		int bNum = (int)(Math.random()*45)+1;
		// 60 ~ 100 (F가 아닌 점수) 
		int score = (int)(Math.random()*41)+60;
		////////////////////////////////////////
		// () 속이 true 라야 while루프문 안으로 들어간다.
		int aNum = 0;
		while(true) {
			aNum = (int)(Math.random()*1000)+1;//1~1000
			System.out.println(aNum);
			// 무한루프를 종료하려면 break를 사용 
			if (aNum>500) break;// 탈출구 
		}
		// 구구단 2단 출력하는 while문 
		int cnt = 1; // 화일 문 안 팎에서 영향력을 미친다.
		while(cnt<=9) {
			System.out.println("2 * "+cnt+" = "+(2*cnt));
			cnt++;
		}
		// 소스의 기능은 같지만 차이 나는 점은 카운트변수의 scope가 틀리다. 
		// for문의 카운트 변수는 for문 안에서만 사용된다. 
		for(int cnt2=1;cnt2<=9;cnt2++) {
			System.out.println("2 * "+cnt2+" = "+(2*cnt2));
		}
		

	}

}
