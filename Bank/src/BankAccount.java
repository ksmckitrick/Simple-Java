
public abstract class BankAccount {
	
	private double balance;
	private double numDeposits;
	private double numWithdrawals;
	private double intRate;
	protected double serviceCharge;
	
	
	/*==Balance Getter and Setter==*/
	
	public double getBalance() {
		
		return balance;
	}
	
	public void setBalance(double balance) {
		
		this.balance = balance;
	}
	
	
	/*==Deposits Getter and Setter==*/
	
	public double getNumDeposits() {
		
		return numDeposits;
	}
	
	public void setNumDeposits(double numDeposits) {
		
		this.numDeposits = numDeposits;
	}
	
	
	/*==Withdrawal Getter and Setter==*/
	
	public double getNumWithdrawals() {
		
		return numWithdrawals;
	}
	
	public void setNumWithdrawals(double numWithdrawals) {
		
		this.numWithdrawals = numWithdrawals;
	}
	
	
	/*==Interest Rate Getter and Setter==*/
	
	public double getIntRate() {
		
		return intRate;
	}
	
	public void setIntRate(double intRate) {
		
		this.intRate = intRate;
	}
	
	
	/*==Service Charge Getter and Setter==*/
	
	public double getServiceCharge() {
		
		return serviceCharge;
	}
	
	public void setServiceCharge(double serviceCharge) {
		
		this.serviceCharge = serviceCharge;
	}
	
	
	public BankAccount(double balance, double intRate) {
		
		this.balance = balance;
		this.intRate = intRate;
	}
	
	
	public void deposit (double amount) {
		
		this.balance += amount;
		this.numDeposits++;
	}
	
	public void withdrawal (double amount) {
		
		this.balance -= amount;
		this.numWithdrawals++;
	}
	
	public void calcInterest() {
		
		double monthlyInterest;
		monthlyInterest = balance * intRate / 12;
		
		this.balance += monthlyInterest;
		
	}
	
	public void MonthlyServiceCharge() {
		
		this.balance -= serviceCharge;
		
		calcInterest();
		
		this.numDeposits = 0;
		this.numWithdrawals = 0;
		this.serviceCharge = 0;
	}

}
