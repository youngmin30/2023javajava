package chap06.exam04_singleton;

public class SingletonExample {
	public static void main(String[] args) { // 실행 클래스
		/*
		Singleton obj1 = new Singleton();  //컴파일 에러
		Singleton obj2 = new Singleton();  //컴파일 에러
		*/
		
		Singleton obj1 = Singleton.getInstance(); // 객체 클래스에서 선언한 getInstance() 사용
		Singleton obj2 = Singleton.getInstance(); //getInstance 메소드를 통해 한번만 생성된 객체를 가져온다.
		
		if(obj1 == obj2) { // obj1과 obj2가 같은지 비교
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}


/*
getInstance()
*/