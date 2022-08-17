package SsangYong220817;

class BankAccount{        //은행계좌.
	private int balance;  //잔액표시 멤버 변수. 
	int x; //멤버 변수는 자동으로 0으로 초기화됨. boolean : false, String : null, int : 0, double 0.0
	
	public void deposit(int amount) {  //저금 
		balance += amount;
	}
	public void withdraw(int amount) { //인출 
		balance -= amount;
	}
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
	public int getBalance() {
		return balance;
	}
	public void printBalance() {
		System.out.println(balance);
	}
}

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.deposit(100);
		a2.deposit(50);
		
		a1.withdraw(60);
		a2.withdraw(30);
		a1.printBalance();
		a2.printBalance();
		System.out.println(a1.x);
		
	}

}
