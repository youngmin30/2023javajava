package chap04.exam03_dowhile;
import java.util.Scanner;

public class  DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		// 객체 생성
		Scanner scanner = new Scanner(System.in); // 키보드로 입력 받게 하는 것
		String inputString; // 아래에 나옴 scnner 아래에서 받을 것, 미리 필드만 선언
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q") ); // 논리 부정 연산자 ! 결과가 false이면 종료함.
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
}


