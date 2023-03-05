package chap04.exam02_switch;

public class SwitchCharExample {
	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
				
			case 'B': // char grade = 'B'; case는 하나만 저장할 수 있음. B이든 b이든 이렇게 표현
			case 'b':
				System.out.println("일반 회원입니다.");
				break;		
				
			default:
				System.out.println("손님입니다.");
		}
	}
}

