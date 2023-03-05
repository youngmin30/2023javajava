package chap06sjw.src.a.b.c.c;
// 실행클래스 - main클래스 - 주클래스 
public class TestOfNotebookCom {

	public static void main(String[] args) {
		NotebookCom a = new NotebookCom();
		//String modelName, float monitorInch, int ramSize, int hddCapacity
		NotebookCom b = new NotebookCom("삼성NB7080",15.2F,16,512);
		System.out.println(a);
		System.out.println(b);
		// 기본생성자로 생성된 객체에 속성 값넣기 
		a.modelName = "LG Gram";
		a.monitorInch = 15.5f;
		a.ramSize = 16; 
		a.hddCapacity = 1024;
		System.out.println(a);
		
		

	}

}
