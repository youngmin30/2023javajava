package chap06.exam03_constructor_overloading;

public class CarExample {
	
	public static void main(String[] args) { // 실행 클래스
		
		// 객체 클래스에는 필드, 생성자가 선언되어 있음
		// 실행 클래스에서 그 객체에 접근해서 객체를 생성함
		Car car1 = new Car(); // 객체 생성줄(총 4개 객체 만듦, 필드는 서로 다른 개수만큼 사용함)
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}

