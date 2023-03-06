package chap08sjw;
// 삼성리모콘, LG리모콘, Audio Remocon,AirCon Remocon 
public interface Remocon {
	String SIZE = "78*200mm";
	void on(); // public abstract 
	void off();
	void volumeUp(int x);
	void volumeDn(int x);
	
	// 1.8 버젼에서 인터페이스의 추가 기능 
	// 일일이 구현객체 추상메소드를 추가하지 않고 사용하게 
	// 만드는 법 
	default void message() {
		System.out.println("이 메세지는 인터페이스의 default메소드에서 제공합니다.");
	}
	static String getVersion() {
		return "Sung's Remocon ver 1.2";
	}
}