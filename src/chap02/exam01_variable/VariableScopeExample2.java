package chap02.exam01_variable;

public class VariableScopeExample2 {
	
	public static void main(String[] args) {
		
		int v1 = 15; // 변수 v1에 15 넣음.
		
		if(v1>10) { // v1가 10보다 크다는 조건을 만족하므로, 블록 안 실행
			
			int v2; // 이 블록 안에서만 사용하는 변수
			v2 = v1 - 10;
		}
		
		
		//int v3 = v1 + v2 + 5;  //v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
	} 
}
