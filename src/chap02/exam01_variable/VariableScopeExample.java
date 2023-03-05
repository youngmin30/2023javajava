package chap02.exam01_variable;

public class VariableScopeExample {
	public static void main(String[] args) {
		
		int var1; // 정수형 변수
		
		if(true) { // true이면 아래 실행
			int var2;
			
			var1 = 10; // 변수
			var2 = 20; // 변수
		}
		
		var1 = 10;
		//var2 = 20;
		
		for(int i=0; i<1; i++) {
			int var3;
			
			var1 = 10;
			//var3 = 30;
		}
		
		var1 = 10;
		//var3 = 30;
	}
}
