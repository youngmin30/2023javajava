package chap02sjw;

public class Chapt3Exam02 {

	public static void main(String[] args) {
		// 부호연산자 연습 (+,-) 
		int a = 127;// 양수
		int b = -a;// a변수의 부호를 바꿔 b에 대입 
		int c = +a;//
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		
		// 문자열의 결합, 숫자 + 문자열 , 문자열 + 숫자 
		System.out.println("나를 사랑한 스파이"+7);
		System.out.println(8+"은 나를 사랑한 스파이");
		System.out.println("나를 사랑한 스파이"+3+4);// 7 ==> 34
		System.out.println(4+4+"은 나를 사랑한 스파이");
		// 대입연산자   = , += , -= 
		int d = 56;
		if(d<60) { // 항상조건식의 결과 true,false 이다
			d += 5; // d = d+5;
			System.out.println("수고했지만, 조금만 더 분발하세요");
		}else{// 60점 이상
			System.out.println("수고했습니다.");
		}
		
	}

}
