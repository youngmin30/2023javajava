package chap03sjw;

// 삼항연산자 - (조건)?A:B ; 
// 조건이 true라면 A를 취하고, 그렇치 않다면 B를 취한다.
public class Chapter3Exam05 {

	public static void main(String[] args) {
		// 취한다는 의미를 신경쓰서 알아두세요.
		int age = 20;
		if (age >= 18) {
			System.out.println("참이슬 판매 가능~~~");
		} else {
			System.out.println("미성년자 술 판매금지!");
		}

		System.out.println((age >= 18) ? "참이슬 판매 가능~~~" : "미성년자 술 판매금지!");
		String result = (age >= 18) ? "참이슬 판매 가능~~~" : "미성년자 술 판매금지!";
		System.out.println(result);

	}

}
