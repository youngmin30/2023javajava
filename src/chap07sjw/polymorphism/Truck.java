package chap07sjw.polymorphism;



public class Truck extends Vehicle {
	@Override
	public void run() {
		System.out.println("트럭이 먼지를 펄펄날리면서 달리고 있다.");
	}

}
