package chap02sjw;

public class Chapt3Exam04 {

	public static void main(String[] args) {
		// 비교 연산자 (==, !=, >,>=,<,<=, instanceof) 
		// 연산결과는 true, false 이다. 
		
		int a = 10;
		byte b = 10;
		double c = 10;
		System.out.println(a>=b);
		// 논리의 부정 ! ===> 단항 연산 
		boolean isMan = false; 
		isMan = !isMan; //!=
		System.out.println(isMan);
		// 2항 논리연산 ====> &(and), |(or), &&(and), ||(or)
		// 김국환 가수가 어떤 사람을 찾는데 조건 나이 18세, 이름은 순이
		int age = 18;
		String name = "순이";
		
		if(age==18 && name=="순이") {
			System.out.println("순이를 찾았다.");
		}else {
			System.out.println("순이를 못찾았다!.");
		}
		// & (한개) &&(두개)의 차이점 
		// 두개짜리를 쓰면 쓸데없는 연산은 하지 않는다. 
		
		// 우리회사 직원을 뽑는데 나이는 35세이상 되고 
		// 나이는 적더라도 고졸이상이면 된다. 
		int 나이 = 20;
		String 학력 ="고졸이상"; 
		if(나이>=35 || 학력 == "고졸이상" ) {
			System.out.println("채용 합격~~");
		}else {
			System.out.println("채용 불합격!");
		}
				
		
		
		
		

	}

}
