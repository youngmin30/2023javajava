package chap07sjw.polymorphism;

public class Driver {
	// 다형성 활용 ~ Vehicle의 자손은 뭐든지 올 수있다.
	public void drive(Vehicle v) {
		v.run();
	}
}
