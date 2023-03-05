package chap04.verify;

public class Exercise05 {
	
	public static void main(String[] args) {
		
		for(int x=1; x<=10; x++) {  // 1부터 10 이하까지 갈 때, 1씩 증가시키면서
			for(int y=1; y<=10; y++) {  // 1부터 10 이하까지 갈 때, y를 증가시키면서
				if( (4*x + 5*y) == 60) { // 4와 x를 곱하고, 5와 y를 곱하는 것
					System.out.println("(" + x + ", " + y + ")"); // 300
				}
			}
		}
	}
}

