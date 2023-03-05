package chap03.exam01_arithmetic;

public class InputDataCheckNaNExample2 {
	public static void main(String[] args) {
		
		
		String userInput = "NaN"; // 스트링에 NaN 저장
		
		
		double val = Double.valueOf(userInput); // val
		
		double currentBalance = 10000.0; // currentBalance
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음"); // NaN이 입력되어 처리할 수 없음
			val = 0.0;
		} 
		
		currentBalance += val;
		System.out.println(currentBalance); // 10000.0
	}
}
