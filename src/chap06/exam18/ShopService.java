package chap06.exam18;

public class ShopService {
	
	// 객체 생성
	// 자기 자신을 타입으로, 자기 자신 객체 만듦
	private static ShopService singleton = new ShopService();
	
	// 메소드
	private ShopService() {} // 접근 제한시킴. 싱글톤이므로.
	
	// 메소드
	// 강의 public static ShopService getInstance()
	static ShopService getInstance() { // getInstance() // 강의 코드와 다름
		return singleton;
	}
}
