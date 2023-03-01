package Day6;
import java.util.Scanner;

public class StrategyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String string1=sc.next();
		try 
		{
			Bank bank=new Bank(string1);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
class Bank{
	String string="Day6.";
	Bank(String type) throws Exception{
		AccountType accountType=(AccountType)Class.forName(string.concat(type)).newInstance();
		accountType.getDetails();
	}
}
abstract class AccountType{
	public abstract void getDetails();
}

class SavingsAccount extends AccountType{
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("This is Savings Account Type");
	}
}

class CurrentAccount extends AccountType{
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("This is Current Account Type");
	}
}

class SalaryAccount extends AccountType{
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("This is Salary Account Type");
	}
}