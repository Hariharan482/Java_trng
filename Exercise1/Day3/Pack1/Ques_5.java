package Pack1;
import d3.*;
public class Ques_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ext e=new Ext();
		e.meth1();
		e.meth2();
		System.out.println(e.getX());
		e.getMeth();
		Ques6 c=new Ques6();
		//c.print(); visibility
 	}

}


class Ext extends Ques6 implements Int1{
	int getX() {
		return a;
	}
	public void meth1(){
		System.out.println("method1");
	}
	
	public void meth2() {
		System.out.println("method2");
	}
	
public void meth3() {
	System.out.println("method3");
}

   public void getMeth() {
	print();
}
}


