package chap03.verify;
public class Exercise02 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // x는 연산 전에 1을 증가시키고, y는 연산 후에 1을 증가시킴
		// x가 11이고, y는 20일 때 연산을 한 값이 z에 저장이 된다.
		// 그리고 z는 아래로 내려가 출력이 되고,
		// y는 1이 증가될 것
		// 여기서는 필요 없음.
		
		System.out.println(z); // 31
	}
}
