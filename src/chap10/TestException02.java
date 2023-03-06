package chap10;

public class TestException02 {

	public static void main(String[] args) {
		new TestException02().xxxx();
		xxxx();
	}
	
	public static void xxxx() {
		try {
			int x =10;
			int y = 0;
			int r = x/0;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("--------<정상종료>--------");
		
	}

}
