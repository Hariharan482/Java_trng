package day4;

public class Sample1 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	
	public void mth2() {
		// TODO Auto-generated method stub
		try {
			int i=1/0;
			return;
		}
		catch(Exception e) {
			System.out.println("finally mth2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 q1=new Sample1();
		q1.mth1();
	}

}
