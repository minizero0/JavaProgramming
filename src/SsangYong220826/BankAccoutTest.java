package SsangYong220826;

class NegativeBalanceException extends Exception{
	public NegativeBalanceException(String str) {
		super(str);
	}
}

class BankAccount{
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance += money;
		System.out.println("입금 후 잔액 : " + balance);
	}
	public void withdraw(int money) throws NegativeBalanceException{
		if (money > balance)
			throw new NegativeBalanceException("출금 금액: " + money + " 잔고: " + balance + " 보다 많습니다.");
		balance -= money;
		System.out.println("출금 후 잔액 : " + balance);
		
	}
}

public class BankAccoutTest {

	public static void main(String[] args) throws NegativeBalanceException{
		try {
			BankAccount ba = new BankAccount(100);
			ba.deposit(20);
			ba.withdraw(121);
		}catch(NegativeBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
