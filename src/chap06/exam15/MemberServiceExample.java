package chap06.exam15;

public class MemberServiceExample {
	
	public static void main(String[] args) { // 실행 클래스
		
		// 객체 생성
		MemberService memberService = new MemberService(); // 객체 생성
		 
		// 불린 타입 변수에 로그인 메소드 넣음
		boolean result = memberService.login("hong", "12345"); // 불린 타입 result 
		
		// result가 true이면 블록 안 실행 아니면 else 실행
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}

