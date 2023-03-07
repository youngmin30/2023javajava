package chap20javaOracle.JavaFxmadang.src.org.vision.application;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import org.vision.common.OracleConnectionPool;
import org.vision.dao.BookDao;
import org.vision.vo.Book;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class BookController implements Initializable {
	private BookDao dao = new BookDao();
	private Connection conn;

    @FXML
    private TextField txtBookid;

    @FXML
    private TextField txtBookname;

    @FXML
    private TableView<Book> tableView;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtPublisher;

    @FXML
    void onInsert(ActionEvent event) {
    	Book vo = new Book();
    	int bookid = Integer.parseInt(txtBookid.getText());
    	String bookname = txtBookname.getText(); 
    	String publisher = txtPublisher.getText();
    	int price = Integer.parseInt(txtPrice.getText());
    	vo.setBookid(bookid);vo.setBookname(bookname);
    	vo.setPublisher(publisher);vo.setPrice(price);
    	
    	try {
			conn = OracleConnectionPool.getConnection();
			int res = dao.insert(conn, vo);//디비에 등록하기
			if(res>0) {
				System.out.println(bookname+"이 등록되었습니다.");
				// ui에반영하기
				tableView.getItems().add(vo);
				// 스크롤 반영하기 
				tableView.scrollTo(tableView.getItems().size() - 1);
			}else {
				System.out.println(bookname+"을 등록하지 못했습니다.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    @FXML
    void onDelete(ActionEvent event) {
    	try {
			int deleteKey = Integer.parseInt(txtBookid.getText());
			conn = OracleConnectionPool.getConnection();
			int res = dao.delete(conn, deleteKey);//db에 반영
			if(res>0) {
				System.out.println("등록된 자료를 삭제하였습니다.");
				int num = tableView.getSelectionModel().getSelectedIndex();
				tableView.getItems().remove(num);//ui에 반영
			}else {
				System.out.println("자료를 삭제하지 못하였습니다.");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
    }
     
    

    @FXML
    void onUpdate(ActionEvent event) {
    	Book vo = new Book();
    	int bookid = Integer.parseInt(txtBookid.getText());
    	String bookname = txtBookname.getText(); 
    	String publisher = txtPublisher.getText();
    	int price = Integer.parseInt(txtPrice.getText());
    	vo.setBookid(bookid);vo.setBookname(bookname);
    	vo.setPublisher(publisher);vo.setPrice(price);
    	try {
			conn = OracleConnectionPool.getConnection();
			int res = dao.update(conn, vo); // db에 업데이트
			if(res>0) {
				System.out.println("잘 업데이트 하였습니다.");
				int num = tableView.getSelectionModel().getSelectedIndex();
				tableView.getItems().set(num, vo);
			}else {
				System.out.println("업데이트 하지 못하였습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void onSelectone(ActionEvent event) {

    }

    @FXML
    void onSelectbycon(ActionEvent event) {
    	String condition = JOptionPane.showInputDialog("WHERE절을 넣어세요");
    	try {
			conn = OracleConnectionPool.getConnection();
			List<Book> list = dao.selectCondition(conn, condition);
			tableView.getItems().clear();
			tableView.getItems().addAll(list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override 
	public void initialize(URL location, ResourceBundle resources) {
		// TODO 초기화 작업 ~ 디자인된 컨트롤에 데이타바인딩 작업이 주
		//BookDao dao = new BookDao();
		List<Book> list = null;
		try {
			conn = OracleConnectionPool.getConnection();
			list = dao.selectAll(conn);
			
			TableColumn<Book,Integer> colBookid = new TableColumn<>("BOOKID");
			colBookid.setCellValueFactory(new PropertyValueFactory<>("bookid"));
			
			TableColumn<Book,String> colBookname = new TableColumn<>("BOOKNAME");
			colBookname.setCellValueFactory(new PropertyValueFactory<>("bookname"));
			
			TableColumn<Book,String> colPublisher = new TableColumn<>("PUBLISHER");
			colPublisher.setCellValueFactory(new PropertyValueFactory<>("publisher"));
			
			TableColumn<Book,Integer> colPrice = new TableColumn<>("PRICE");
			colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
			
			tableView.getColumns().addAll(colBookid,colBookname,colPublisher,colPrice);
			tableView.getItems().addAll(list);
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 람다방식 이벤트 처리 예 
		tableView.setOnMouseClicked(event -> {
		    if (event.getClickCount() == 2 && !tableView.getSelectionModel().isEmpty()) {
		        // 더블 클릭 시 처리할 내용
		    	Book selectedVo = tableView.getSelectionModel().getSelectedItem();
		    	txtBookid.setText(selectedVo.getBookid()+"");
		    	txtBookname.setText(selectedVo.getBookname());
		    	txtPublisher.setText(selectedVo.getPublisher());
		    	txtPrice.setText(selectedVo.getPrice()+"");
		    }
		});
	}
}