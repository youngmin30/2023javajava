package chap03.verify;
public class Exercise08 {
	public static void main(String[] args) {
		
		double x = 5.0;
		double y = 0.0;
		
		double z = 5 % y;
		

		if( Double.isNaN(z) ) { // isNaN() 숫자가 아닌 값을 찾는 함수??
			System.out.println("0.0으로 나눌 수 없습니다.");
			
		} else {
			
			double result = z + 10;
			System.out.println("결과: " + result);
			

		}
	}
}




