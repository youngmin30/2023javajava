package chap10;
// 예외의 전가(Propagation) ~ 실무적으로 서버프로그램에서는 클라이언트가
// 예외를 인식하도록 예외를 던진다. 
public class TestException04 {

	public static void main(String[] args) {
		try {
			new TestException04().test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	public void test() throws Exception{
		int a =100;
		int b = 0;
		double c =0.0;
		System.out.println((a/c)+""+(a/b));
	}

}
