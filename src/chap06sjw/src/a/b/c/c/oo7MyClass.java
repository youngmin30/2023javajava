package chap06sjw.src.a.b.c.c;

import java.sql.Date;

// 나만 사용하는 특수한 클래스 
// 귀찮고 번거로운 작업을 나만의 메소드로 해결하기위함.
public class MyClass {
	// 객체만들 필요 없이 바로 클래스명으로 접근 할 수 있는 메소드를 만들 때에는 
	// static 을 붙인다. 
	private MyClass() {}
	// 구의 표면적을 내주는 메소드를 설계해보자!
	// 공식 4pi r 제곱 
	public static double getSurface(double radius) {
		return 4 * Math.PI * radius * radius;
	}
	// 섭씨를 받아서 화씨 온도로 바꿔주는 기능 (공식  f = (c * (9/5)) +32 
	public static double c2F(double c) {
		return (c * (9/5.0))+32.0;
	}
	public static double f2C(double f) { // c = (f-32) *(5/9)
		return (f - 32) *(5.0/9);
	}
	public static String doubleLine(int n) {
		String line="";
		for (int i=0;i<n;i++) {
			line += "=";
		}
		return line;
	}
	
	public static String getMailTail() {
		String mailTail=new Date(System.currentTimeMillis()).toString();
		mailTail += "\n";
		mailTail += "\t\t\t\t\t 당신의 존경하는 친구 \n";
		mailTail += "\t\t\t\t\t 아 무 개 드림.";
		return mailTail;
	}
	
}
