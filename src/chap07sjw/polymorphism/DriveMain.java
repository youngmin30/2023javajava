package chap07sjw.polymorphism;

public class DriveMain {

	public static void main(String[] args) {
		Driver 운전자 = new Driver();
		// 폴리모피즘 - 조상클래스로 선언하고 객체는 자손클래스로 만들어 대입
		Vehicle[] vehicles = new Vehicle[] {
			new Taxi(), new Truck()
		};
		운전자.drive(vehicles[0]);
		운전자.drive(vehicles[1]);

	}

}
