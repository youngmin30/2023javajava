package chap05sjw.src.a.b.c;
// 이늄은 한정된 표현으로 제한 하고 싶을 때 작성하는 특수한 타입 이다. 
public class EnumTest {

	public static void main(String[] args) {
		Week today = Week.MON ;
		switch(today) {
		case SUN:
			System.out.println("오늘은 방콕 뒹구는 날입니다.");
			break;
		case FRI:
			System.out.println("오늘은 불탄다나 뭐라나?");
			break;
		default: 
			System.out.println("자바공부를 열심히 하는 날입니다.");
		}

	}

}
// 동일한 소스에 여러 개의 클래스를 작성할 수 있다. 
// main클래스를 여러 개 작성할 수는 없습니다.(main()메소드가 없는 클래스만 가능)
// public 표기를 할 수 없다. 
enum Week{
	SUN,MON,TUE,WED,THR,FRI,SAT
}
