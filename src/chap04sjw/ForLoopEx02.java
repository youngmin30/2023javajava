package chap04sjw;

public class ForLoopEx02 {

	public static void main(String[] args) {
		// for loop문은 다양하게 응용할 수 있음. 
		// 구구단 2단 부터 9단까지 한 화면에 출력 
		for(int row = 1; row<=9; row++) {
			for(int dan = 2; dan<=9; dan++) {
				System.out.print(dan +"*"+row+"="+(dan*row)+"\t");
			}
			System.out.println();
		}
	}

}
