package chatgptQues;

class CurrentAccount extends BankAccount {
	private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.setOverdraftLimit(overdraftLimit);
    }
	@Override
    public void withdraw(double amount) {
    	System.out.println("Withdrawing:"+amount);
    	if (amount > (getBalance()+getOverdraftLimit())) {
    		System.out.println("Insufficient balance!");
    	}else {
    		setBalance(getBalance()-amount);
    		System.out.println("New Balance"+getBalance());
    	}
    }
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
}
