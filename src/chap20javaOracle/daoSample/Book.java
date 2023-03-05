package chap20javaOracle.daoSample;
public class Book {

    // 필드는 직접 입력한다.
    private int bookid;
    private String bookname;
    private String publisher;
    private int price;

    // 기본 생성자 - 매개변수가 없으므로, 기본 생성자
    // Override
    public Book() {
        super(); // super는 없어도 된다.
        // 생성자는 상속이 안 되기 때문에, 조상의 것을 한 번 호출해 준다.
    }
    public Book(int bookid, String bookname, String publisher, int price) {
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