package chap02sjw;// 소속을 밝힌다. 유니크!
// 고동색은 모두 예약어(자바명령어) 이다.
public class Chapt3Exam01 { // 이 괄호는 클래스의 시작을 의미 

	public static void main(String[] args) {// 메인메소드 블럭의 시작점
		// 자바 초기 연습 영역 
		// +,-,*, / ,% 
		int a = 10; // a,b 를 변수라고 한다~ 메모리이름
		int b = 20; 
		// 콘솔화면에 출력하라 ()속의 내용을 
		System.out.println(a+b);//a,b 피연산자(오퍼렌드)
		System.out.println(10+20);
		System.out.println(a+20);
		// '/' 연산자 (나누기) 주의! 
		System.out.println(5/2); // int/int ===> int 
		System.out.println(5.0/2); // double/int ===> double
		
		System.out.println(a/b);//int/int ===> int 
		System.out.println((double)a/b);//double/int ===> double
		// byte<short=char<int<long<float<double 
		// '가' 의 할당된 char값 
		System.out.println('가'+0);// char + int ===> int 
		System.out.println('힣'+0);
		// 한글의 코드 범위(char 값) 44032 ~ 55203
		// 특수문자 
		System.out.println('☆'+0);
		System.out.println('韓'+0);
		///////////////////////////////////////
		// % 몫은 버리고 나머지만 취하는 연산자 
		// 게시글 수가 386개이다
		// 한 페이지에 20개씩 보여 줄 수 있다.
		// 마지막 페이지 몇 페이지 인가? 
		// 마지막 페이지에 나타나는 라인수가 얼마 인가? 
		///////////////////////////////////////
		int pages = 386/20; 
		int remains = 386 % 20; // 나머지가 있다면
		
		if(remains>0) {
			pages++;
		}
		
		System.out.println("총페이지수:"+pages);
		System.out.println("마지막페이지의 라인수:"+remains);
		
		
	}// 메인메소드 블럭의 끝 

}// 클래스의 끝을 의미 
