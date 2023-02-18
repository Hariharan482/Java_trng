package d1;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MEth a=new MEth();
		a.getStr();
		//a.getx();
		a.geti();
	}

}

class MEth{
	public int i=3;
	private int j=4;
	protected  String k="Hello";
	private int getx() {
		return i;
	}
	protected String getStr() {
		return k;
	}
	int geti() {
		return i;
	}
}