package d3;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cls1 cl1=new Cls1();
		cl1.Method1(cl1);
	}

}

class Cls{
	
}
interface A{
	void methA1();
	void methA2();
}
interface B{
	void methB1();
	void methB2();
}
interface C{
	void methC1();
	void methC2();
}
interface ABC extends A,B,C{
	void methABC();
}

class Cls1 extends Cls implements ABC{

	@Override
	public void methA1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methA2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methB1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methB2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methC1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methC2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methABC() {
		// TODO Auto-generated method stub
		
	}
	 public void  Method1(A a) {
		 System.out.println("interface a");
		 
	 }
 public void  Method2(B b) {
		 
	 }
 public void  Method3(C c) {
	 
 }
 public void  Method4(ABC abc) {
	 
 }
}
