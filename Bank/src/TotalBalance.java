public class TotalBalance {

	public static void main(String[] args) {
		
		BankAccount savings = new SavingsAccount(1000, 1.4);
		
		savings.deposit(0);
		
		savings.withdrawal(0);
		
		System.out.println("Balance: $" + (savings.getBalance() + savings.getIntRate())
		+ "\nInterest: $" + savings.getIntRate()
		+ "\nNumber of Deposits: " + savings.getNumDeposits()
		+ "\nNumber of Withdrawals: " + savings.getNumWithdrawals()
		+ "\nMonthly Service Fee: $" + savings.getServiceCharge());
	}
}
	
		
		