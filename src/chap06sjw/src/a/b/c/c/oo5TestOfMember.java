package chap06sjw.src.a.b.c.c;

//import java.sql.Date;
import java.util.Date;
public class TestOfMember {

	public static void main(String[] args) {
		Member hgd = new Member();
		hgd.setName("홍길동");
		hgd.setPhone("010-1111-2222");
		hgd.setEmail("hgd@naver.com");
		hgd.setId("hgd");
		hgd.setPassword("12345678");
		hgd.setAddress("충남 공주시");
		hgd.setJoinDate();// 현재시각을 가입일자로 기록 
		hgd.setActive(true);
		System.out.println(hgd);
		System.out.println("작업종료시각:"
				+ new Date(System.currentTimeMillis()));
	}
}
