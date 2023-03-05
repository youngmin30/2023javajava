package chap05.exam08_advanced_for;

public class AdvancedForExample {
	
	public static void main(String[] args) {
		
		int[] scores = { 95, 71, 84, 93, 87 }; // 배열에 항목 입력
		
		int sum = 0;
		
		for (int score : scores) { // for (타입 변수: 배열명) {
			sum = sum + score; // 그 배열 scores에 있는, 변수 score는 배열의 한 항목이고 합을 더한 것을 sum에 넣음
		}
		System.out.println("점수 총합 = " + sum); // 점수 총합 = 430
		
		
		double avg = (double) sum / scores.length; // 배열의 길이
		System.out.println("점수 평균 = " + avg); // 점수 평균 = 86.0

	} 
}
