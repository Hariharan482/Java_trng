package day4;

public class Sample {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}
	
	public void mth2() {
		// TODO Auto-generated method stub
		try {
			int a=1/0;			
			//return;
			System.exit(0);

					}
		catch(Exception e) {
			System.out.println("finally mth2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample q1=new Sample();
		q1.mth1();
	}

}
