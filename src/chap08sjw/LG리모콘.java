package chap08sjw;

public class LG리모콘 implements Remocon{

	@Override
	public void on() {
		System.out.println("LG TV에 전원이 들어왔습니다.");
		
	}

	@Override
	public void off() {
		 System.out.println("LG TV의 전원을 차단합니다.");
		
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
