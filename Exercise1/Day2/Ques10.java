package d2;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		
	}

}


class A1{
	A1(){
		System.out.println("class A");
	}
}

class B1{
	B1(){
		System.out.println("class B");
	}
}

class C extends A1{
	B1 b=new B1();
}