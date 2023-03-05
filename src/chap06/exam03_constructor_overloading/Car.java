package chap06.exam03_constructor_overloading;

public class Car {
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 오버로딩(Overloading)
	//생성자 오버로딩이란, 매개 변수를 달리하는 생성자를 여러 개 선언하는 것
	Car() {
	}
	
	Car(String model) { // 매개 변수 하나
		this.model = model;
	}
	
	Car(String model, String color) { // 매개 변수 둘
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) { // 매개 변수 셋
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

/* 생성자 초기화 방법
 * 객체를 초기화하려면 생성자도 다양화되어야 한다.
 * 중요한 필드 몇 개는 매개변수로 초기화한다.
 * 1 나머지는 객체 클래스에서 초기화한다. 
 * 2 생성자 내부에서 임의의 값이나 계산된 값으로 초기화 한다.
 * 3 객체 생성 후에 필드값을 별도로 저장한다.
 * 
 * 생성자 오버로딩
 * 매개변수를 달리하는 생성자를 여러 개 선언하는 것을 말함
 */
