package day5;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NonAlphaCharException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckException checkException = new CheckException();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(() -> {
			while (true) {
				checkException.checkException();
			}
		});
		executorService.execute(() -> {
			while (true) {
				checkException.checkException();
			}
		});
		executorService.shutdown();
	}

}

class CheckException {
	synchronized void checkException() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println(Thread.currentThread().getName() + ": enter a char");
			char ch = scanner.next().charAt(0);
			if (Character.isLetter(ch)) 
			{
				System.out.println("valid");
			} 
			else 
			{
				throw new CheckNonAlphaCharException("invalid");
			}
			wait();
		} 
		catch (CheckNonAlphaCharException nac) 
		{
			System.out.println(nac);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}
}

class CheckNonAlphaCharException extends Exception {
	String msg;

	public CheckNonAlphaCharException(String msg)
	{
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return msg;
	}
}