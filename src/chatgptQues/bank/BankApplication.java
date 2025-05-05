package chatgptQues.bank;


public class BankApplication {
	public static void main(String args[]) {
	SavingAccount sa=new SavingAccount("Resh","0090",3000,1);
	sa.deposit(9000);
	sa.withdraw(100000);
	sa.displayAccountDetails();
	CurrentAccount ca=new CurrentAccount("Reshmi","0080",3000,1000);
	ca.deposit(9000);
	ca.withdraw(12500);
	ca.displayAccountDetails();
	}
}
