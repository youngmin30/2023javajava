package chap02.exam03_accuracy;
public class FromIntToFloat {
	public static void main(String[] args) {
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		// System.out.println(num2); // 123456780
		num2 = (int) num3;
		// System.out.println(num3); // 1.23456784E8
		
		int result = num1 - num2; // 같은 타입끼리 연산함
		System.out.println(result);
	}
}

