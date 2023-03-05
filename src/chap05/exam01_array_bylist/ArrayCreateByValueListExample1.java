package chap05.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {
	
	
	public static void main(String[] args) {
		
		int[] scores = { 83, 90, 87 }; // 크기가 고정되지 않은 배열에 세 개의 항목 넣음
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		
		
		
		int sum = 0; // 변수
		
		for(int i=0; i<3; i++) {
			sum += scores[i]; // 여기에서 sum 사용하려고, 위에서 만든 것 i는 세 항목 중 하나를 말함.
		}
		System.out.println("총합 : " + sum);	// 총합 : 260	
		
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg); // 평균 : 86.66666666666667
	}
}