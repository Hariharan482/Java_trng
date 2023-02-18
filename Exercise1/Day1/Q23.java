package d1;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q232 ob=new Q232();
		ob.gett();
	}

}

class Q231{
	protected int t=5;
}

class Q232 extends Q231{
	void gett() {
		System.out.println(t);
	}
}