package chap08sjw;

public class SmartPhone implements Remocon {

	@Override
	public void on() {
		System.out.println("폰이 켜졌습니다.");
	}

	@Override
	public void off() {
		System.out.println("폰이 꺼졌습니다.");
	}

	@Override
	public void volumeUp(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeDn(int x) {
		// TODO Auto-generated method stub
		
	}

}
