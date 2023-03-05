package chap06.exam01_instance_member;

public class Car {
	//필드
	String model;
	int speed;
	
	//생성자
	Car(String model) {
		this.model = model; // 생성자의 첫 줄에 this 사용해서, 
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed; // this()와 this.는 다름. this.는 이 클래스를 의미함.
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i); // ?????민궁확인필요 setSpeed() 인스턴스 메소드(234쪽)
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}	
}
