package chap08sjw;
public class CalcTest {
	// Functional Interface 람다식에서 활용한 예 
	public static void main(String[] args) {
		Calculator add = (q,w) -> q+w;
		Calculator substract = (q,w) -> q-w;
		Calculator add2 = new Calculator(){

			@Override
			public int calc(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
			
		};
		Calculator subtract2 = new Calculator() {

			@Override
			public int calc(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
			
		};
		
		// 
		System.out.println(add.calc(10, 5));//15
		System.out.println(substract.calc(10, 5));// 5

	}

}
