package chap05.exam07_array_copy;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		
		int[] oldIntArray = { 1, 2, 3 }; // 정수형 복사할 배열 작성하고 값 초기화
		int[] newIntArray = new int[5]; // 정수형 복사될 배열 객체 생성(이 객체는 공간이 다섯)
		
		for(int i=0; i<oldIntArray.length; i++) { // i는 다음 항목의 인덱스
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) { // 새 배열의 인덱스
			System.out.print(newIntArray[i] + ", "); // 쉼표 기준으로 한 항목씩 출력
		}
	}
}