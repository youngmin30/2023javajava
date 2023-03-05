package chap05sjw.src.a.b.c;

public class TwoDimArray {

	public static void main(String[] args) {
		int[] scores = {10,20,40,67,88};
		System.out.println(scores.length);
		// 앞의 []는 행을의미, 뒤의 []는 열을 의미한다고 간주해보자~
		int[][] score2 = {
				{10,20,40,67,88,89,99,100},// 국어
				{10,20,40,67,88},// 영어
				{10,40,67,88}// 수학
		};
		System.out.println(score2.length);//행 
		System.out.println(score2[0].length);//0행의 컬럼 
		System.out.println(score2[1].length);//1행의 컬럼 
		System.out.println(score2[2].length);//2행의 컬럼 
		
		int[] xscore = new int[20]; 
		int[][] yscore = new int[3][20];
		// 2차원 배열 전체를 차례로 접근하여 값을 출력해보자! 
		for(int i=0;i<score2.length;i++) {
			for(int j=0;j<score2[i].length;j++) {
				System.out.println(score2[i][j]);
			}
		}
		// 국어의 합계와 평균 구하기 
		int korSum = 0; 
		for(int i=0;i<score2[0].length;i++) {
			korSum += score2[0][i];
		}
		System.out.println("국어점수합계:"+ korSum);
		System.out.printf("평균: %5.2f",((float)korSum/score2[0].length));
		// 영어 성적의 합계와 평균 구하기 
		
	}

}
