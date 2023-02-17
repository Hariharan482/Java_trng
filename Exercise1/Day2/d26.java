package d2;

public class d26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sttc a=new sttc();
		sttc a1=new sttc();
	}
}

class sttc{
	static {
		System.out.println("static block");
	}
	{
		System.out.println("1st inst meth");
	}
	sttc(){
		System.out.println("constr");
	}
	{
		System.out.println("2nd inst meth");
	}
}