package chap04.exam04_break;

public class  BreakExample {
	public static void main(String[] args) throws Exception { // throws Exception
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			
			if(num == 6) { // 이 줄은 왜 필요한지, 잘은 모르겠지만, 난수를 while문 돌면서 얻다가 언제든 마치기 위해서 정한 수가 6인 모양
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}


