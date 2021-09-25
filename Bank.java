
public class Bank {
	private int id;
	private double balance;

	
	Bank() {
		id = 0;
		balance = 0;
	}

	
	Bank(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}

	
	public void setId(int newId) {
		id = newId;
	}

	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	
	public int getId() {
		return id;
	}

	
	public double getBalance() {
		return balance;
	}
	
}