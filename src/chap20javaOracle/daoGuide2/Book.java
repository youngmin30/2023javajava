package chap20javaOracle.daoGuide2;
// 데이타베이스의 한레코드 정보를 담는 클래스를 만듦 
// VO class 라고 한다. (Value Object) , DTO(Data Transfer Object)

public class Book {

	// 필드명
	// 이 때 사용하는 필드명은 우리가 만든 마당서점 데이터베이스의 필드명과 같음
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;


	// 기본 생성자
	// 오라클db에 있는 Book 테이블을 이용하기 위한 기본 생성자
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


    // 생성자(매개 변수로 필드명을 사용함)
	public Book(int bookid, String bookname, String publisher, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}


	// Getter, Setter 메소드로 필드에 있는 값을 가져옴
	public int getBookid() {
		return bookid;
	} // bookid를 가져와서
	public void setBookid(int bookid) {
		this.bookid = bookid;
	} // bookid를 사용한다. 이하 동일
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



	// 문자로 보여준다.
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", publisher=" + publisher + ", price=" + price
				+ "]";
	}
	
}
