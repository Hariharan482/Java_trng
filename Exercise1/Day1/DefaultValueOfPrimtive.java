package d1;

public class DefaultValueOfPrimtive {
	static int int1;
	static double double1;
	static float float1;
	static char char1;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Hello world");//1
		double double2=2345678901d;
		System.out.println(int1);
		System.out.println(float1+"\nchar :"+char1+"\ndouble: "+double2+" "+double1);
		//explicit 
		int double3=(int)double2;
		long long1=(int)double2;
		System.out.println(double3+" "+long1);
		//implicit
		int implctint=5;
		long implctlong=implctint;
		float implctfloat=implctint;
		System.out.println(implctfloat+" "+implctlong);
		
	}

}