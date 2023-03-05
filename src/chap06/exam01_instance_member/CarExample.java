package chap06.exam01_instance_member;

public class CarExample {
	public static void main(String[] args) { // 실행 클래스
		
		// 객체 생성
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		// 객체 클래스에 있는 run() 메소드를 생성한 객체마다 사용하겠음
		myCar.run();
		yourCar.run();
	}
}
