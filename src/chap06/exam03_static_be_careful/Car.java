package chap06.exam03_static_be_careful;

public class Car {
	
	// 필드명
	int speed;
	
	// 메소드
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	// 실행 클래스
	public static void main(String[] args) { // 실행 클래스 위치 이쪽이어도 가능
		
		Car myCar = new Car(); // 객체 생성
		
		myCar.speed = 60;
		myCar.run();
	}
}

