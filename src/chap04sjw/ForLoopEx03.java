package chap04sjw;
public class ForLoopEx03 {
	// 학습할 요소가 여러 개가 있는 소스 
	public static void main(String[] args) {
		// 명확하게 설명 ~ 干 이라는 객체를 String 타입으로 선언
		// 객체란 ~ 한 묶음의 관련정보 덩어리(정적인(변수,상수), 동적인(메소드))
		// 기성(만들어진) 클래스의 정보를 알고 싶으면 ~ api를 공부한다. 
		String 干 = "갑을병정무기경신임계"; 
		String 支 = "자축인묘진사오미신유술해";
		// for문 연습 
		for(int i=0;i<干.length();++i) {
			System.out.println(干.charAt(i));
		}
		System.out.println("-------------------------"); 
		for(int i=0;i<支.length();++i) {
			System.out.println(支.charAt(i));
		}
		// 어려운 부분  -  잘 학습 하실것! 
		//       간, 지, 총카운트; 총돌릴횟수;증감식 
		for (int i=0,j=0,cnt=0;cnt<60;i++,j++,cnt++) {
			if(i==10) i = 0;// 한줄인 if문은 {}를 없애 간결하게 표현할 수 있다
			if(j==12) j = 0; 
			System.out.println(""+干.charAt(i)+支.charAt(j)+"\t"+(cnt+1));
		}
	}
}