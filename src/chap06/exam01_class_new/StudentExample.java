package chap06.exam01_class_new;

public class StudentExample {

	public static void main(String[] args) { // 메인 메소드

		Student s1 = new Student(); // 객체 생성을 통해, 같은 패키지의 Studnet 객체 사용할 수 있음.
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student(); // 객체 생성을 통해, 같은 패키지의 Studnet 객체 사용할 수 있음.
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}

// 같은 클래스로 생성했지만, 두 객체는 다른 객체이다.

