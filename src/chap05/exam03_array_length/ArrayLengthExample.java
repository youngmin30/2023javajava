package chap05.exam03_array_length;

public class ArrayLengthExample {
	
	public static void main(String[] args) {
		
		int[] scores = { 83, 90, 87 }; // 배열 scores
		
		int sum = 0; // 변수 sum
		
		for(int i=0; i<scores.length; i++) { // 항목
			sum += scores[i]; // sum = sum + scores[i];
		}
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length; // scores의 길이(항목 수)
		
		System.out.println("평균 : " + avg);
	}
}
