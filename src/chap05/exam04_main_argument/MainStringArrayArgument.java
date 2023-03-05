package chap05.exam04_main_argument;

public class MainStringArrayArgument {
	
	public static void main(String[] args) {
		
		if(args.length != 2) { // args의 길이가 1가 아니면 아래 문장 실행
			System.out.println("프로그램의 사용법"); 
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		/*
		 * 종료 상태값이 0이면 정상 종료, 1이면 비정상 종료
		 * System.exit(0); 정상 종료
		 * System.exit(1); 비정상 종료
		 * 참고한 곳: https://coding-factory.tistory.com/526
		 */
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		String strNum3 = args[2]; // args 추가했는데, 위 if블록은 문제없이 진행됨
		
		int num1 = Integer.parseInt(strNum1); // parseInt() 문자열을 숫자열로 변환
		int num2 = Integer.parseInt(strNum2);
		int num3 = Integer.parseInt(strNum3); // 추가한 줄
		
		int result = num1 + num2 + num3;
		System.out.println(num1 + " + " + num2 + " = " + num3 + "=" + result); // 이 문장은 실행이 안 됨
	}
}
