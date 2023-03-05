package chap03.exam02_string_concat;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0; 
		String str2 = str1 + " 특징"; 
		System.out.println(str2); // JDK6.0 특징
		
		String str3 = "JDK" + 3 + 3.0; // JDK33.0 (문자열 뒤에서 더하면 문자열 연산이 됨)
		String str4 = 3 + 3.0 + "JDK"; // 6.0JDK (숫자를 먼저 더하면 숫자끼리 더하고, 그 숫자가 문자열 연산이 됨
		System.out.println(str3); 
		System.out.println(str4);		
	}
}