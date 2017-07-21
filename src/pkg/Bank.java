package pkg;

public class Bank {
	
	int getInterest()
	{
		return 5;
	}
	
	public static void main(String[] args)
	{
		Bank bank = new Bank();
		System.out.println(bank.getInterest());
		Bank banka = new Bank_ABC();
		System.out.println(banka.getInterest());
		Bank bankd = new Bank_DEF();
		System.out.println(bankd.getInterest());
		Bank bankf = new Bank_F();
		System.out.println(bankf.getInterest());
	}

}
