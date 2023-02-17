package d2;

public class d25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objc o1=new objc();
		System.out.println(o1.print());
		objc o2=new objc();
		System.out.println(o2.print());
		objc o3=new objc();
		System.out.println(o3.print());
		objc o4=new objc();
		System.out.println(objc.c);
	}

}
class objc{
	static int c=0;
	objc(){
		c++;
	}
	public int print() {
		return c;
	}
}
