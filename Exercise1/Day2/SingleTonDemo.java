package d2;

public class SingleTonDemo
   {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon s=SingleTon.getInstance();
		SingleTon s1=SingleTon.getInstance();
		System.out.println(s+" "+s1);
	}

}


class SingleTon{
	private static SingleTon st=null;
	private SingleTon() {
		System.out.println("Heloo");
	}
	
	public static SingleTon getInstance() {
		if (st==null)
				st=new SingleTon();
		return st;
	}
	
}