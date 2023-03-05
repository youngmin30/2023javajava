package chap06sjw.src.a.b.c.c;
// 수입신고 ~ java.lang 패키지나 현재작성중인 패키지 이외에 있는
// 클래스를 사용하고자 할때 밟아야 하는 절차 
import java.util.Date;

public class 초기화블럭연습 {

	public static void main(String[] args) {
		System.out.println(Some.today);
		System.out.println(new Some().insa +" 오늘은" + Some.today + " 입니다." );
		//
		Some[] somes = new Some[] {
			new Some(),new Some(),new Some(),new Some(), new Some()	
		};
		System.out.println(somes[0].insa +":" +somes[0].today);
		System.out.println(somes[1].insa +":" +somes[1].today);
		somes[2].today = new Date(1000L);
		System.out.println(somes[2].insa +":" +somes[1].today);
		System.out.println(somes[0].insa +":" +somes[0].today);
	}

}

class Some{
	public static Date today; // 클래스 필드(정적 필드 ==> 고정적 필드 ==> 클래스에 고정적)
	public String insa;// 인스턴스 필드 ==> 만들어 지는 객체마다 할당할 공간
	// 초기화 블럭 
	{
	  this.insa = "Hello~~~";	
	}
	// static한 필드값을 부여하는 역할을 하므로써 생성메소드의 역할을 수행한다.
	static {
		today = new Date(System.currentTimeMillis());
	}
	
}
