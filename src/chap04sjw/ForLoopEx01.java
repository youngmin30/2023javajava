package chap04sjw;

public class ForLoopEx01 {
	public static void main(String[] args) {
		// for루프문은 아주 많은 연습이 필요합니다.
		// #####
		// #####
		// #####
		// #####
		// #####
		for (int i = 0; i < 5; i++) {
			System.out.println("#####");
		}
		System.out.println("------------------------------");
		// 조건 # 한개를 for문에 활용해서 위와같은 결과가 나오게 구성해라.
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("#");
			}
			System.out.println();

		}
		System.out.println("------------------------------");
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print("#");
			}
			System.out.println();
		}
		// 과제 
		// #####
		// ####
		// ###
		// ##
		// #
		//
		//
		System.out.println("--------------1----------------");
		for (int j = 0; j < 5; j++) {
			for (int i = j; i < 5; i++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("--------------2---------------");
		for (int j = 0; j < 5; j++) {
			for (int i = 5; i>j; i--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
