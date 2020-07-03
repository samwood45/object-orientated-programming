//import java.util.Scanner;

public class BankAccount
{	
   	double balance;
   	public BankAccount(double b)
   	{
   		this.balance = b;
   	}

   	public BankAccount()
   	{
   		this.balance = 100.00;
   	}

   	public double setBalance(double b)
   	{
   		return this.balance = b;
   	}

   	public double getBalance()
   	{
   		return this.balance;
   	}

   	public double withdrawal(double d ){
   		return this.balance = this.balance - d;
   	}

   	public double deposit(double d){
   		return this.balance = this.balance +d;
   	}

   	public String tostring(){
   		return "The balance is " + this.balance;
   	}
	public static void main(String [] args)
	{
		BankAccount currentAc2 = new BankAccount();
		BankAccount currentAc = new BankAccount();
		System.out.println(currentAc2.getBalance());
		currentAc.setBalance(650.00);
		System.out.println(currentAc.getBalance());
		System.out.println(currentAc.withdrawal(1.0));
		System.out.println(currentAc.deposit(2.0));
		System.out.println(currentAc.tostring());

		
	}

}