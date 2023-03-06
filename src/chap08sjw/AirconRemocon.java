package chap08sjw;

public class AirconRemocon implements Remocon{

	@Override
	public void on() {
		System.out.println("에어콘이 작동합니다.");
		
	}

	@Override
	public void off() {
		System.out.println("에어콘의 전원이 차단됩니다.");
		
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
