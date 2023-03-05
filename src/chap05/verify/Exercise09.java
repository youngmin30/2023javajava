package chap05.verify;
import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) { // 실행 클래스
		
		boolean run = true;	// run에 true 입력	
		
		int studentNum = 0; // studentNum에 0 입력
		int[] scores = null; // scores라는 배열에 null 입력
		
		// Scanner라는 객체 생성
		Scanner scanner = new Scanner(System.in); // 키보드로 입력 받은 값 받음
		
		while(run) { // 조건이 항상 true로 함
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt(); // int 타입의 숫자 입력
			
			if(selectNo == 1) { // 선택한 번호가 1이면
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2) { // 선택한 번호가 2이면
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if(selectNo == 3) { // 선택한 번호가 3이면
				for(int i=0; i<scores.length; i++) { // scores라는 배열의 길이
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if(selectNo == 4) { // 선택한 번호가 1이면
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					max = (max<scores[i])? scores[i] : max;
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if(selectNo == 5) { // 선택한 번호가 5이면
				run = false;
			}
		}	
		System.out.println("프로그램 종료");
	}
}


