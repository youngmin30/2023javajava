package chap06.exam02_return;

public class Car {
	//필드
	int gas;
	
	//생성자 ==> minver 없으니 기본 생성자가 있는 것으로 간주함
	
	//메소드
	void setGas(int gas) { // 리턴 타입이 없는 메소드와 매개 변수
		this.gas = gas; // 리턴값이 없는 메소드로 매개값을 받아서, gas 필드값을 변경함 (여기에서 this는 이 클래스를 의미)
	}
	
	boolean isLeftGas() { // 리턴 타입이 있는 메소드
		if(gas==0) { // if의 조건식이 true이면 아래 문장 실행
			System.out.println("gas가 없습니다."); 
			return false; // 리턴값이 boolean인 메소드, gas 필드값이 0이면 false, 1이면 true를 리턴함
		}
		System.out.println("gas가 있습니다."); // if 조건식이 false이면(true이면, 0이 아니면) 실행할 문장
		return true; // gas가 1을 반환
	}
	
	
	void run() { // 리턴 타입 없는 메소드
		while(true) { // 조건이 true이면 반복
			if(gas > 0) { // 조건이 true이면 아래 문장 실행
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1; // 실행한 뒤 gas를 gas = gas-1을 대입
			} else { // 조건이 true가 아닐 때 실행할 문장
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; // return문은 즉시 메소드를 종료시키 문, run() 메소드 종료 시킴
			}
		}
	}
}

