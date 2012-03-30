package period.one;

public class SavingsAccount extends BankAccount {
	public double minimumBalance;
	public double interestRate;
	
	public void addInterest(double interest) {
		interestRate = interest;
		balance = balance + (interestRate/100)*balance;
		minimumBalance = 0;
	}
}
