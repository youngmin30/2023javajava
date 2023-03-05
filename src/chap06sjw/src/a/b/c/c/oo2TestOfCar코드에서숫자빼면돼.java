package chap06sjw.src.a.b.c.c;

public class TestOfCar {

	public static void main(String[] args) {
		//String company,int doors,int cc,int price
		Car sonata =  new Car("HD",5,2000,30_000_000);// 회계 10,000,000
		Car malinata = new Car("KIA",5,2050,31_000_000);
		Car basic = new Car(); // 속성이 할당되지 않은 객체 
		System.out.println(sonata.toString());
		System.out.println(malinata);
		System.out.println(basic);
		
		basic.company = "SAMSUNG"; 
		basic.doors = 5;
		basic.cc = 1800;
		basic.price = 18_000_000;
		
		System.out.println(basic);
		
	}

}
