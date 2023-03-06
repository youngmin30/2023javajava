package chap08sjw;

public class TestMain {

	public static void main(String[] args) {
		Student a = new Student("1","산대특지능형데이터융합개발자과정","정찬수");
		Student b = new Student("1","산대특지능형데이터융합개발자과정","강호동");
		// 폴리모피즘을 이용하기 위한 방식(Promotion:자동승진 이 발생됨)
		// 이런 점에서 인터페이스는 조상클래스와 유사한 면모를 가지고 있다.
	    FromVision c = new Student("1","산대특지능형데이터융합개발자과정","아무개");
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    // 배열형태로 폴리모피즘 활용 
	    FromVision[] students = new FromVision[] {
	    		new Student("1","산대특지능형데이터융합개발자과정","정찬수"),
	    		new Student("1","산대특지능형데이터융합개발자과정","강호동"),
	    		new Student("1","산대특지능형데이터융합개발자과정","아무개")
	    };
	    // 향상된 for문 
	    //  배열타입 변수명:배열명 
		for(FromVision x:students) {
			System.out.println(x);
			System.out.println("이사람의 최소 아이큐는 "+FromVision.MIN_IQ+" 입니다.!");
		}
		// static method를 사용한 예 
		System.out.println("FromVision 인터페이스 버전:"+FromVision.getVersion());
		// functional interface를 사용한예
		Calculator add = (q,w) -> q+w;
		Calculator substract = (q,w) -> q-w;
		// 
		System.out.println(add.calc(10, 5));//15
		System.out.println(substract.calc(10, 5));// 5
		// default method 사용한 예 (람다식에서)
		System.out.println(a.getInfor());
		System.out.println(b.getInfor());
		System.out.println(c.getInfor());
	}

}
