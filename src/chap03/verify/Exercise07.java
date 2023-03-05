package chap03.verify;
public class Exercise07 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		
		System.out.println( (x>7) && (y<=5) );
		// x는 10이고, 7보다 크니까 true 
		// y는 5이고, 5와 같으니까 true
		// 양쪽이 true이므로, && 연산을 하면 true
		
		System.out.println( (x%3 == 2) || (y%2 != 1) ); 
		// x는 10이고, 10을 3으로 나눈 나머지가 1이므로 2와 같다는 것은 false
		// y는 5이고, 5를 2로 나눈 나머지가 1이므로, 1과 같지 않다는 것은 false
		// 양쪽이 모두 false인데, || 연산은 둘 중 하나가 true이면 true이므로 해당되지 않아 false
		
	}
}





