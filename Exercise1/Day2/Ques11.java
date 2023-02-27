package d2;

public class Ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c=new C1("Hello",2);
		
	}

}


class A2{
	A2(String n){
		System.out.println("class A has String"+n);
	}
}

class B2{
	B2(int n){
		System.out.println("class B has int"+n);
	}
}

class C1 extends A2{
	B2 b;
	C1(String name,int n){
		super(name);
		b=new B2(n);
	}
}