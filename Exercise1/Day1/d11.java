package d1;

public class d11 {
	static int x;
	static float y;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Hello world");//1
		double z=2345678901d;
		char a='a';
		System.out.println(x);
		System.out.println(y+" char :"+a+"double: "+z);
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