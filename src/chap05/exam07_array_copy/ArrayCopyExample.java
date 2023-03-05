package chap05.exam07_array_copy;


public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5]; // 공간이 다섯인 배열 만들고, 복사한 요소가 셋이면 나머지 자리에 null 자동으로 넣음
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) { // 새 strArray의 항목 수(길이)
			System.out.print(newStrArray[i] + ", "); // 그 길이를 인덱스로 그 자리에 있는 항목
		}
	}
}