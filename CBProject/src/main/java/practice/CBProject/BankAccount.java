package practice.CBProject;

public class BankAccount 
{
    private double balance = 0;
    
    public BankAccount(double balance)
    {
    	this.balance = balance;
    }
    
    public double debit(double amount)
    {
    	if (amount < 0)
    		return 0;
    	if (this.balance < amount)
    		amount = this.balance;
    	this.balance -= amount;
    	return amount;
    }
    
    public double getBalance()
    {
    	return this.balance;
    }
}
