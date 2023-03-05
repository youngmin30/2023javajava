package chap05.exam06_array_reference_object;

public class ArrayReferenceObjectExample {
	
	public static void main(String[] args) {	
		
		String[] strArray = new String[3]; // 스트링배열 객체를 만듦, 크기는 3행
		strArray[0] = "Java"; // 0행 0열에 자바
		strArray[1] = "Java"; // 0행 1열에 자바
		strArray[2] = new String("Java"); // 0행 2열에 자바(스트링)

		System.out.println( strArray[0] == strArray[1]); // true
		System.out.println( strArray[0] == strArray[2] );  // false
		System.out.println( strArray[0].equals(strArray[2]) ); // true
		
		// 타입 확인
		System.out.println(strArray[0] instanceof String); // true
		System.out.println(strArray[1] instanceof String); // true
		System.out.println(strArray[2] instanceof String); // true
	} 
}

