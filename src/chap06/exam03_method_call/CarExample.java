package chap06.exam03_method_call;

public class CarExample {
	
	public static void main(String[] args) { // 실행 클래스
		
		Car myCar = new Car(); // 객체 생성
		
		myCar.keyTurnOn(); // 객체에서 메소드 사용
		myCar.run(); // 객체에서 메소드 사용
		int speed = myCar.getSpeed(); // 메소드 기능을 speed에 저장
		System.out.println("현재 속도: " + speed + "km/h"); // 결과 확인
	}
}
