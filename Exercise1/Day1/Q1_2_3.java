package d1;

public class Q1_2_3 {
	static int x;
	static double d1;
	static float y;
	static char a;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Hello world");//1
		double z=2345678901d;
		System.out.println(x);
		System.out.println(y+"\nchar :"+a+"\ndouble: "+z +" "+d1);
		//explicit 
		int d=(int)z;
		long l=(int)z;
		System.out.println(d+" "+l);
		//implicit
		int v=5;
		long e=v;
		float f=v;
		System.out.println(e+" "+f);
		
	}

}