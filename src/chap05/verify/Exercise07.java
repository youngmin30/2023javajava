package chap05.verify;

public class Exercise07 {
	
	public static void main(String[] args) { // 실행 클래스
		
	    int max = 0;
	    
	    int[] array = { 1, 5, 3, 8, 2 }; // array라는 이름의 배열 만듦.
	 
		for(int i=0; i<array.length; i++) { // array의 길이는 항목의 개수
			if(max<array[i]) { // 배열에서 하나씩 꺼내어, 최대값에 넣음
				max = array[i]; // true
			}
		}

	    System.out.println("max: " + max); // false
	}
}

