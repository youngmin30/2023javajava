package chap10;
public class TestException03 {
	public static void main(String[] args) {
		//new TestException03().test();
		//new TestException03().test2();
		//test3();
		test4();
	}
	public void test() {
		try {
			int a = 10; 
			int b = 0;
			String c = null;
			System.out.println(a/b);//ArithmeticException
			System.out.println(c.toString());// NullPointerException
		} 
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("------------------<정상종료>-------------------");
	}
	public void test2() {
		try {
			int a = 10; 
			int b = 0;
			System.out.println(a/b);//ArithmeticException
		} 
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		try {
			String c = null;
			System.out.println(c.toString());
		} catch(NullPointerException e) {
			e.printStackTrace();
		}

		System.out.println("------------------<정상종료>-------------------");
	}
	
	public static void test3() {
		try {
			String[] names = {"강감찬","을지문덕","최윤덕","김종서"}; 
			for(int i=1;i<=4;i++) {
				System.out.println(names[i]);
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("================<정상종료>===============");
	}
	
	public static void test4() {
		Animal dog = new Dog(); //Promotion 
		Animal xdog = dog;//Promotion 
		Dog dog2 = new Dog();
		Animal ydog = dog2;//Promotion 
		Animal ani = new Animal(); 
		try {
			Dog dog3 = (Dog)ani;// ClassCastException ---> RuntimeException의 일종
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("예외가 발생하건 안하건 이 줄은 출력됨.");
		}
		System.out.println(">>> 정상종료 <<<");
		
	}
	
	static class Animal{}
	static class Dog extends Animal{}
	static class Cat extends Animal{}
	
	
}








