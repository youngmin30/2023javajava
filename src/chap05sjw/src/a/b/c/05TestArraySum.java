package chap05sjw.src.a.b.c;
import java.util.Arrays;
import java.util.Random;
public class TestArraySum {
	public static void main(String[] args) {
		// 배열의 선언 
		int[] scores = new int[20];
		//Random rnd = new Random(0);
		// 임의의 숫자 0~ 100 사이의 정수를 발생 
		for(int i=0;i<20;i++) {
			scores[i] = (int)(Math.random()*101);//0~100정수
			//항상 동일한 임의의 수를 발생시키는 법 
			//scores[i] = rnd.nextInt(101);//0~100정수
		}
		// 간단하게 배열내용을 출력하는 방법 (간편출력,간이출력)
		System.out.println(Arrays.toString(scores));
		// 점수합산하기 
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
			sum += scores[i];//sum = sum + scores[i];
		}
		System.out.println("성적합계:"+sum+" 평균:"+(sum/scores.length));
		
	}

}
