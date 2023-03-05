package chap06sjw.src.a.b.c.c;
// ClassCompose 객체를 만들어 테스트하는 프로그램 
public class oo1TestObjectMake {
	public static void main(String[] args) {
		// int age = 20;
		// 객체생성 
		oo1ClassCompose aperson = new oo1ClassCompose();
		 
		System.out.println(aperson.암산(100, 200));
		System.out.println("암산맨:"+aperson.name);
		System.out.println("사는곳:"+aperson.address);
		System.out.println("연락처:"+aperson.phoneNumber);
		System.out.println("주민번호:"+aperson.juminNo);
		
		// toString() 메소드가 있느냐 없느냐에 따라 출력되는 결과가 다르다. 
		System.out.println("객체:"+aperson);
		// q.b.c 패키지안의 ClassCompose 클래스 객체가  626b2d4a 주소에 있는 객체
		//a.b.c.ClassCompose@626b2d4a
	}

}
