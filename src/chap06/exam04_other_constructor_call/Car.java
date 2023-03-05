package chap06.exam04_other_constructor_call;

public class Car { // 객체 클래스
	
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 오버로딩
	Car() {
	}
	
	Car(String model) {
		this(model, null, 0); // this() 자신의 다른 생성자를 호출하는 코드 반드시 생성자의 첫 줄에서만 허용함.
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}


/* this()
 * 생성자에서 다른 생성자를 호출할 때 사용하는 코드
 * 자신의 다른 생성자를 호출하는 코드로 생성자 첫 줄에서만 허용함
 * this() 다음에는 추가적인 실행문들이 온다.
 * 호출되는 생성자의 실행이 끝나면 원래 생성자로 돌아와서 다음 실행문을 실행한다.
 * 
 */

