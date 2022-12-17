
public class SavingsAccount extends BankAccount {

	static boolean isActive;
	
	public SavingsAccount(double balance, double intRate) {
		
		super(balance, intRate);
		
		isActive = super.getBalance() >= 25;
		
	}
	
	public void withdrawal(double amount) {
		
		if (super.getBalance() < amount) {
			System.out.println("Insufficient funds.");
			System.exit(0);
		}
		
		if (super.getBalance() < 25) {
			System.out.println("Your account is inactive due to insufficient funds.");
		}	
			else {
				super.withdrawal(amount);
			}
	}
	
	public void deposit(double amount) {
		
		super.deposit(amount);
		
		if(super.getBalance() > 25) {
			System.out.println("Your account is active!");
			isActive = true;
		}
	}
	
	public void monthlyProcess() {
		
		if (super.getNumWithdrawals() > 4) {
			serviceCharge += 1;
		}
		
		if (super.getBalance() < 25); {
			System.out.println("Your account has become inactive due to insufficient funds.");
			isActive = false;
		}
	}
	

}
