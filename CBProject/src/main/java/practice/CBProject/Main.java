package practice.CBProject;

public class Main {
	public static void main(String[] args) 
	{
		BankAccount bankAccount = new BankAccount(100);
		System.out.println(bankAccount.getBalance());
		
		bankAccount.debit(10);
		System.out.println(bankAccount.getBalance());
	}
}
