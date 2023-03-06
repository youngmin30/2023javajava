package chap08sjw;
public class TestRemocon {
	public static void main(String[] args) {
		// 익명의 이너클래스 방식으로 인터페이스를 구현한 객체를 만들수 있다.
		Remocon audioRemocon = new Remocon() {
			@Override
			public void on() {
				System.out.println("오디오에 전원이 들어왔습니다");
			}
			@Override
			public void off() {
				System.out.println("오디오에 전원이 차단했습니다.");
			}
			@Override
			public void volumeUp(int x) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void volumeDn(int x) {
				// TODO Auto-generated method stub
				
			}
		};
		삼성리모콘 sr = new 삼성리모콘();
		// 폴리모피즘을 이용할 수 있음
		Remocon[] remocons = new Remocon[] {
			new 삼성리모콘(),
			new  LG리모콘(),
			new AirconRemocon(),
			new SmartPhone(),
			audioRemocon,
			sr
		};
		for(Remocon x:remocons) {
			x.on();
		}
		System.out.println();
		for(Remocon x:remocons) {
			x.off();
			x.message();
		}
		System.out.println(Remocon.getVersion());
	}
}
