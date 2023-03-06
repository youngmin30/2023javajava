package chap20javaOracle.daoSample2;
// 데이타베이스의 한레코드 정보를 담는 클래스를 만듦 
// VO class 라고 한다. (Value Object) , DTO(Data Transfer Object)

public class Book {

	private int bookid;
	private String bookname;
	private String publisher;
	private int price;



	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Book(int bookid, String bookname, String publisher, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}



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



	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", publisher=" + publisher + ", price=" + price
				+ "]";
	}
	
}
