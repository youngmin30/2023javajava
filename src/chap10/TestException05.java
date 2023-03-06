package chap10;

//import java.util.Random;

// 사용자 정의 Exception
public class TestException05 {

	public static void main(String[] args) {
		//Random rnd = new Random();
		
		try {
			throw new MyException("이건 나의 예외 메세지임!");
		} catch (MyException e) {
			System.err.println(e.getMessage());
		}

	}
	// 중첩클래스(이너클래스)
	static class MyException extends Exception{
		public MyException() {}
		public MyException(String msg) {
			super(msg);
		}
	}
	

}
