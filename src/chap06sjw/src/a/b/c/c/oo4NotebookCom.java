package chap06sjw.src.a.b.c.c;
// 노트북 컴퓨터를 모델링 함 
public class NotebookCom {
	// 노트북컴퓨터의 속성 
	String modelName;
	float monitorInch;
	int ramSize;
	int hddCapacity;
	// 생성메소드의 오버로딩/Overloading (5개)

	public NotebookCom(String modelName) {
		this.modelName = modelName;
	} 
	public NotebookCom(String modelName,float monitorInch) {
		this.modelName = modelName;
		this.monitorInch = monitorInch;
	} 
	public NotebookCom(String modelName,float monitorInch,int ramSize) {
		this.modelName = modelName;
		this.monitorInch = monitorInch;
		this.ramSize = ramSize;
	}
	// 기본생성자는 반드시 작성하도록 권장함 
	public NotebookCom() {}
	public NotebookCom(String modelName, float monitorInch, int ramSize, int hddCapacity) {
		this.modelName = modelName;
		this.monitorInch = monitorInch;
		this.ramSize = ramSize;
		this.hddCapacity = hddCapacity;
	} 
	
	public String toString() {
		return modelName+",MonitorSize:"+monitorInch+",RAM:"+ramSize+",HDD:"+hddCapacity;
	}

}
