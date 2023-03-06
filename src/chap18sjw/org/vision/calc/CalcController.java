package chap18sjw.org.vision.calc;

// 계산기의 버튼 등 기능을 구현한 컨트롤러 클래스

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalcController {

    @FXML
    private TextField txtRes;

    @FXML
    private TextField txtB;

    @FXML
    private TextField txtA;

    @FXML
    void onAdd(ActionEvent event) {
    	double a = Double.parseDouble(txtA.getText());
    	double b = Double.parseDouble(txtB.getText());
    	double res = a+b;
    	txtRes.setText(res+"");
    }

    @FXML
    void onSubtract(ActionEvent event) {
    	double a = Double.parseDouble(txtA.getText());
    	double b = Double.parseDouble(txtB.getText());
    	double res = a-b;
    	txtRes.setText(res+"");
    }

    @FXML
    void onMultiply(ActionEvent event) {
    	double a = Double.parseDouble(txtA.getText());
    	double b = Double.parseDouble(txtB.getText());
    	double res = a*b;
    	txtRes.setText(res+"");
    }

    @FXML
    void onDivide(ActionEvent event) {
    	double a = Double.parseDouble(txtA.getText());
    	double b = Double.parseDouble(txtB.getText());
    	double res = a/b;
    	txtRes.setText(res+"");
    }

    @FXML
    void onModuless(ActionEvent event) {
    	double a = Double.parseDouble(txtA.getText());
    	double b = Double.parseDouble(txtB.getText());
    	double res = a%b;
    	txtRes.setText(res+"");
    }

}
