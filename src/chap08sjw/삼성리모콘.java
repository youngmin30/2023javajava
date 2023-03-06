package chap08sjw;
// 옆인터페이스가 가지는 추상메소드부분을 이 클래스에서 구상화(Concrete)
public class 삼성리모콘 implements Remocon {

	@Override
	public void on() {
		System.out.println("삼성TV에 전원이 들어왔습니다.");
		
	}

	@Override
	public void off() {
		 System.out.println("삼성TV의 전원을 차단합니다.");
		
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
