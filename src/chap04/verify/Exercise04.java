package chap04.verify;

public class Exercise04 {
	
	public static void main(String[] args) {
		
		while(true) { // 조건
			int num1 = (int)(Math.random()*6) + 1; // 난수
			int num2 = (int)(Math.random()*6) + 1; // 난수
			
			System.out.println("(" + num1 + ", " + num2 + ")");
			
			if( (num1+num2) == 5) { // 17, 24
				break;
			}
		}
	}
}

