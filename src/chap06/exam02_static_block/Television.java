package chap06.exam02_static_block;

public class Television {
	
	// 정적 필드(이전까지는 그냥 필드, 이번 장에서는 정적 필드)
	static String company = "Samsung"; // 정적 필드는 선언과 동시에 값 초기화
	static String model = "LCD"; // 정적 필드는 선언과 동시에 값 초기화
	static String info; // 초기화를 안한 필드
	
	// 정적 블록
	// 정적 블록은 클래스가 메모리로 로딩될 때 자동 실행됨
	static {
		info = company + "-" + model; // info 필드
	}
}


// info 필드는 정적 블록에서 company와 model 필드값을 서로 연결해서 초기값으로 설정함