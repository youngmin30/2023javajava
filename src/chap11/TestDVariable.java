package chap11;

public class TestDVariable {

	public static void main(String[] args) {
		new TestDVariable().sum(1,2,3,4,5,6,7,8,9,10);
		new TestDVariable().sum(1,3,5,7,9);
		new TestDVariable().sum2(new int[] {1,3,5,7,9});
	}
	// 가변형 인수의 사용예
	public void sum(int...num) { // 가변형 - 매개변수의 개수를 0개 이상 임의지정가능)
		// 위의 형식매개변수 num 은 num[] 배열로 바뀐다.
		// int[] num ={1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		for(int x:num) {
			sum += x;
		}
		System.out.println("합:"+sum);
	}
	
	public void sum2(int[] num) {
		int sum =0;
		for(int x:num) {
			sum += x;
		}
		System.out.println("합:"+sum);
	}

}
