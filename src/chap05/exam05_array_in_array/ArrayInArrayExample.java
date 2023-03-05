package chap05.exam05_array_in_array;

public class ArrayInArrayExample {
	
	public static void main(String[] args) {	
		
		int[][] mathScores = new int[2][3]; // 2행 3열의 행렬 만듦.
		for(int i=0; i<mathScores.length; i++) { // 수학점수 배열의 행 만들기
			for(int k=0; k<mathScores[i].length; k++) { // 수학점수 배열의 열 만들기
				System.out.println("mathScores["+i+"]["+k+"]=" // 행렬 숫자 출력
						+mathScores[i][k]); // 그 행렬에 해당하는 값 출력
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][]; // 영어 점수 배열 2행, 정하지 않은 열
		englishScores[0] = new int[2]; // 2행 객체 생성
		englishScores[1] = new int[3]; // 3열 객체 생성
 		for(int i=0; i<englishScores.length; i++) { // 영어점수 행의 수
			for(int k=0; k<englishScores[i].length; k++) { // 영어 점수 열의 수
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]); // 해당 행렬의 값 출력
			}
		}
		System.out.println();		
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} }; // 자바 점수 배열 0행 0열에 95, 0행 1열에 80, 1행 0열에 92 순으로 저장
		for(int i=0; i<javaScores.length; i++) { // 자바점수배열의 행
			for(int k=0; k<javaScores[i].length; k++) { // 자바점수배열의 열
				System.out.println("javaScores["+i+"]["+k+"]=" // 행렬 출력, 그 행렬의 위치에 맞는 값 입력
						+javaScores[i][k]);
			}
		}
	} 
}

