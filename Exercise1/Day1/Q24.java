package d1;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quad ob=new Quad();
		ob.modify(2, 3, 4);
		System.out.println(ob.geta());
		System.out.println(ob.getb());
		System.out.println(ob.compute(1));
	}

}

class Quad{
	int a,b,c;
	Quad(){
		a=b=c=1;
	}
	Quad(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void modify(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int geta(){
		return a;
	}
	int getb() {
		return b;
	}
	int getc() {
		return c;
	}
	int compute(int x) {
		int cpt=(a*x*x)+(b*x)+c;
		return cpt;
	}
}