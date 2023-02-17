package d2;

public class d29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
	}

}
class A{
	public int i;
	private int j;
	protected  String k;
	
}

class B extends A{
	/*public int gety() {
		return j;
	}*/
	private int getx() {
		return i;
	}
	protected String getStr() {
		return k;
	}
	B(){
		//gety();
		getx();
		getStr();
	}
}