package SsangYong220817;

class BankAccount{        		//은행계좌.
	private double balance;  	//잔액표시 멤버 변수. 
	int x; 						//멤버 변수는 자동으로 0으로 초기화됨. boolean : false, String : null, int : 0, double 0.0
	
	public void deposit(double amount) {  //저금 
		balance += amount;
	}
	public void withdraw(int amount) { //인출
		if (balance < amount) 
			System.out.println("금액이 부족합니다.");
		else
		balance -= amount;
	}
	public double	 getBalance() {
		return balance;
	}
	public void printBalance() {
		System.out.println(balance);
	}
	public void addInterest() {
		balance *= 1.075;
		//balance = blanace + (balance * 0.075);
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
		a1.addInterest();
		a1.printBalance();
		a2.printBalance();
		System.out.println(a1.x);
		
	}

}
