package day5;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NonalphaCharException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckException ce = new CheckException();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(() -> {
			while (true) {
				ce.check();
			}
		});
		es.execute(() -> {
			while (true) {
				ce.check();
			}
		});
		es.shutdown();
	}

}

class CheckException {
	synchronized void check() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println(Thread.currentThread().getName() + ": enter a char");
			char ch = sc.next().charAt(0);
			if (Character.isLetter(ch)) {
				System.out.println("valid");
			} else {
				throw new NonAlphaException("invalid");
			}
			wait();
		} catch (NonAlphaException nac) {
			System.out.println(nac);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}
}

class NonAlphaException extends Exception {
	String msg;

	public NonAlphaException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
}