package period.one;

public class SavingsAccount {
	public double minimumBalance;
	public double interestRate;
	
	public void addInterest(double interest) {
		interestRate = interest;
		//balance = balance + (interestRate/100)*balance;
		minimumBalance = 0;
	}
}
