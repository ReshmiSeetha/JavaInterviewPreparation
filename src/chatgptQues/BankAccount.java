package chatgptQues;

public abstract class BankAccount {
	private String accountHolder;
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountHolder,String accountNumber,double balance) {
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.setBalance(balance);	
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Deposited: " + amount + ", New Balance: " + getBalance());
	}
	public abstract void withdraw(double amount);
	
	public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + getBalance());
    }
}
