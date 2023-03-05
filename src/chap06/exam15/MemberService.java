package chap06.exam15;

public class MemberService {
	
	// 메소드
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true; // id가 hong이고, password가 12345이면 true
		} else {
			return false; // 아니라면 false
		}
	}
	
	// 메소드 logout()
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
