package chap06.exam01_getter_setter;

public class CarExample {
	
	public static void main(String[] args) {
		
		// 객체 생성
		Car myCar = new Car();
		
		//잘못된 속도 변경
		// 객체 클래스에 있는 메소드 setSpeed() 이용하는 것
		myCar.setSpeed(-50); 
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		// 이해가 필요함.
		// if문 ==> stop이 false가 될 때
		if(!myCar.isStop()) { // myCar라는 객체로 isStop() 메소드를 사용하는데, not true이면 스톱이 아니면
			myCar.setStop(true); // 스톱 해라.
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}

/* 
 * Getter, Setter는 메소드이다.
 * Getter
 * 필드 값을 읽기 위해 사용
 * private 필드의 값을 리턴하는 역할을 한다.
 * 
 * Setter
 * 필드 값을 설정하기 위해 사용
 * 외부에서 주어진 값을 필드값으로 수정한다.
 */
