package chap18sjw.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GugudanController { // sceneBuilder에서 view, skeleton을 눌러 구조 가져오기

    @FXML
    private TextField txtDan; // 텍스트 필드의 fx:id를 txtDan으로 지정한 것

    @FXML
    private TextArea textArea; // 텍스트 필드의 fx:id를 txtDan으로 지정한 것

    
    @FXML
    void onDisplay(ActionEvent event) { // 버튼의 onAction에 지정한 것
    	int dan = Integer.parseInt(txtDan.getText());
    	StringBuffer buffer = new StringBuffer(); // StringBuffer() 공부
    	for(int i=1;i<=9;i++) {
    		buffer.append(dan +" * "+ i + " = "+(dan*i)+ "\n");
    	}
    	textArea.setText(buffer.toString());
    }

}
