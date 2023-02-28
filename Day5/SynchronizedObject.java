package day5;

public class SynchronizedObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer1 = new StringBuffer("A");
		Synchronised synchronised1 = new Synchronised(stringBuffer1);
		Synchronised synchronised2 = new Synchronised(stringBuffer1);
		Synchronised synchronised3 = new Synchronised(stringBuffer1);
		synchronised1.start();
		synchronised2.start();
		synchronised3.start();
	}

}

class Synchronised extends Thread {
	StringBuffer stringBuffer1;

	public Synchronised(StringBuffer stringBuffer1) {
		// TODO Auto-generated constructor stub
		this.stringBuffer1 = stringBuffer1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (stringBuffer1) 
		{
			System.out.println(this);
			for (int i = 0; i < 100; i++)
			{
				System.out.print(stringBuffer1 + " ");
			}
			System.out.println();
			char c = stringBuffer1.charAt(0);
			c++;
			stringBuffer1.setCharAt(0, c);
		}
	}
}