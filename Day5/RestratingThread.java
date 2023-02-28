package day5;

public class RestratingThread extends Thread {
	public void run() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread();
		thread1.start();
		thread1.start();
	}

}
