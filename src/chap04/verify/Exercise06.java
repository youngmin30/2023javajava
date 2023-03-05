package chap04.verify;

public class Exercise06 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) { // i는 5까지
			for(int j=1; j<=i; j++) { // j는 i보다 작은 때까지
			     	System.out.print("*");

				if(j==i) {
					System.out.println(); // 52.5
				}
			}
		}
	}
}


