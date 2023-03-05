package chap05sjw.src.a.b.c;
// 기본패키지(java.lang)가 아닌곳의 클래스를 활용할 때에 
// import 패키지명.클래스명 
// java.util패키지 안의 Random 클래스를 수입하겠다 는 의미
import java.util.Random;
public class TestArraySum2 {
	public static void main(String[] args) {
		// TODO 고정된 임의의 수를 발생시키는 법 
		Random rnd = new Random(0);// 0 - seed 값 
		int[] scores = new int[100000];
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			scores[i] = rnd.nextInt(101);
			sum += scores[i];
		}
		System.out.printf("총점:%d, 평균:%5.2f",sum,(double)sum/scores.length);
	}

}
