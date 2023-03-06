package chap08sjw;
// 
public interface FromVision {
	//인터페이스에서 선언하는 변수는 상수이다.
	int MIN_IQ = 130; // public static final
	// 인터페이스 내의 메소드는 일반적으로 추상메소드 이다. 
	String getGisu(); // public abstract 생략 
	String getGuaJung(); // public abstract 생략 
	
	// static method는 여러 개를 둘 수 있다. 
	// 객체 생성없이 기존의 구현체들에게 새로운 기능을 획일적으로 
	// 간단하게 부여하는 방법 이다. 
	static String getVersion(){
		return "Ver 1.03";
	}
	// 또한 구현체에게 추상메소드를 구현하지 않아도 되게 
	// 기본적인 메소드를 제공할 수 있는데, 이것을 default method라고 한다.
	default String getInfor() {
		return "FromVision인터페이스는 비젼직업전문학교 졸업생 객체를 만들때에 사용!";
	}

}
