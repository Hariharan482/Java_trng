package d1;

public class Q25_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=-243;
		int j=243;
		//if(i==j);
		if(i!=j)
			System.out.println("same");
	}

}

//protected 
class Base{
	String method() {
		return "wow";
	}
}

class Derived{
	public void useD() {
		Base b=new Base();
		System.out.println("base says :"+b.method());
	}
}