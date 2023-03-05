package chap05.exam01_array_bylist;

public class ArrayCreateByValueListExample2 {
	
	public static void main(String[] args) {
		
		int[] scores; // 배열
		scores = new int[] { 83, 90, 87 }; // 배열에 항목 값
		
		int sum1 = 0; // 변수
		
		
		for(int i=0; i<3; i++) { // 배열
			sum1 += scores[i]; // sum1 = sum1 + socres[i] 배열 안 항목을 하나씩 꺼내어 sum에 넣음
		}
		
		System.out.println("총합 : " + sum1);	 // 총합 : 260
		
		int sum2 = add( new int[] { 83, 90, 87 } );
		System.out.println("총합 : " + sum2);	 // 총합 : 260
		System.out.println();
	}
	
	public static int add(int[] scores) { // 배열
		int sum = 0; // 
		for(int i=0; i<3; i++) { // 배열 크기는 셋
			sum += scores[i]; // 그 배열의 항목 하나씩 꺼내어 sum에 저장
		}
		return sum;
	}
}