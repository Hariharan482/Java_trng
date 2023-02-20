package d2;

public class Singlton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingTon s=SingTon.getInstance();
		SingTon s1=SingTon.getInstance();
		System.out.println(s+" "+s1);
	}

}


class SingTon{
	private static SingTon st=null;
	private SingTon() {
		System.out.println("Heloo");
	}
	
	public static SingTon getInstance() {
		if (st==null)
				st=new SingTon();
		return st;
	}
	
}