
public class BankAccount {
	
	private double balance;
	private double interestRate;
	private double interest;
	
	
	/**Constructor*/
	
	public BankAccount (double startBalance,
						double intRate)
	
	{
		balance = startBalance;
		interestRate = intRate;
		interest= 0.0;
		
	}
	
	/** The deposit method adds the parameter amount to balance field*/
	
	public void deposit (double amount)
	
	{
		balance += amount;
	}

	/** The withdraw method subtracts the parameter amount to balance field*/
	
	public void withdraw (double amount)
	
	{
		balance-=amount;
	}
	
	/** The addInterest method adds the inerest each month amount to balance field*/
	
	public void addInterest ()
	
	{
		interest = balance * interestRate;
		balance += interest;
	}
	
	/** Get balance method */
	
	public double getInterest ()
	
	{
		return balance;
		
	}
	
}


