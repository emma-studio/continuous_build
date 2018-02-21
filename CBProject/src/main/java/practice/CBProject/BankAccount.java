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
    	if (this.balance < amount || amount < 0)
    		return 0;
    	this.balance -= amount;
    	return amount;
    }
    
    public double getBalance()
    {
    	return this.balance;
    }
}
