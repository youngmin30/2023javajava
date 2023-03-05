package chap20javaOracle.daoGuide;

/*
데이터베이스의 한 레코드(한 줄) 정보를 담는 클래스
이 클래스를 VO(Value Object) 클래스라고도 함.
VO: Value Object
DTO: Data Transfer Object

데이터베이스의 한 레코드 정보를 담는 클래스

VO 클래스 구조

1. 필드 - 직접 입력
2. 기본 생성자 - 매개 변수가 없으므로 기본 생성자
            기본 생성자에 super 없어도 있는 것으로 가정하므로 생략 가능
            생성자는 상속이 안 되므로, 조상의 것을 한 번 호출한다는 의미에서 super 사용함.
3. Getter, Setter 메소드
4. toString()
*/


public class Bookg {
	
	// 필드는 직접 입력한다.
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	// 기본 생성자 - 매개변수가 없으므로, 기본 생성자
	// Override
	public Bookg() {
		super(); // super는 없어도 된다.
		// 생성자는 상속이 안 되기 때문에, 조상의 것을 한 번 호출해 준다.
	}
	public Bookg(int bookid, String bookname, String publisher, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	
	// Getter, Setter 자동 생성
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", publisher=" + publisher + ", price=" + price
				+ "]";
	}
	
}
