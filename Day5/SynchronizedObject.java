package day5;

public class SynchronizedObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("A");
		Synchronised s1 = new Synchronised(sb);
		Synchronised s2 = new Synchronised(sb);
		Synchronised s3 = new Synchronised(sb);
		s1.start();
		s2.start();
		s3.start();
	}

}

class Synchronised extends Thread {
	StringBuffer sb;

	public Synchronised(StringBuffer sb) {
		// TODO Auto-generated constructor stub
		this.sb = sb;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (sb) {
			System.out.println(this);
			for (int i = 0; i < 100; i++) {
				System.out.print(sb + " ");
			}
			System.out.println();
			char c=sb.charAt(0);
			c++;
			sb.setCharAt(0,c);
		}

	}
}