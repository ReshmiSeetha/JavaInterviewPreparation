package chatgptQues;

class SavingAccount extends BankAccount{
	private double interestRate;
	 public SavingAccount(String accountHolder, String accountNumber, double balance, double interestRate) {
		super(accountHolder, accountNumber, balance);
		this.setInterestRate(interestRate);
	}
	    @Override
	    public void withdraw(double amount) {
	    	System.out.println("Withdrawing:"+amount);
	    	if (amount > (getBalance())) {
	    		System.out.println("Insufficient balance!");
	    	}else {
	    		setBalance(getBalance()-amount);
	    		System.out.println("New Balance"+getBalance());
	    	}
	    }
		public double getInterestRate() {
			return interestRate;
		}
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
}
