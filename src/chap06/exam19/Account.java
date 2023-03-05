package chap06.exam19;

public class Account {
	public static final int MIN_BALANCE = 0; // 정적 파이널 상수, 한 번 정한 값으로 끝까지
	public static final int MAX_BALANCE = 1000000; // 위와 같음
	
	private int balance; // private이 붙은, 이 

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<Account.MIN_BALANCE || balance>Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
}
