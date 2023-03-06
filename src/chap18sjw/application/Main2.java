package chap18sjw.application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

// gui 프로그램의 주도적 실행 담당하는 클래스 
// 반드시 javafx.application.Application 를 상속받아 만든다. 
public class Main2 extends Application {
	
	@Override // Application 클래스가 가지고 있는  start() 메소드를 오버라이딩 한다.
	public void start(Stage primaryStage) {
		// 배(치),사(이즈),보(이게),이(벤트) 작업 
		try {
			
			// 동,서,남,북,중 (오방)에 컴포넌트(컨트롤)를 배치하게 만든 멍석 
			//BorderPane root = new BorderPane();
			BorderPane root = FXMLLoader.load(getClass().getResource("hellow.fxml"));
			// 장면 
			Scene scene = new Scene(root);//가로,세로 픽셀수 
			// 무대에 장면을 배치 
			primaryStage.setScene(scene);
			// 불을 켜서 보이게 한다. 
			primaryStage.setTitle("GUI 역할분담 테스트");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	// launch() 메소드를 통하여 우회적으로 start()메소드를 호출하면 
	// 내부적으로 쓰레드로 배사보이 작업이 이루어 진다.  
	public static void main(String[] args) {
		launch(args);
	}
}
