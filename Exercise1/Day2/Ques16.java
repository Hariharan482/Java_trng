package d2;

public class Ques16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x1=new X();
		X x2=new Y();
		Y y=new Y();
		((Y)x2).do2();
	}

}


class X{
	void do1(){};
}

class Y extends X{
	void do2() {};
}