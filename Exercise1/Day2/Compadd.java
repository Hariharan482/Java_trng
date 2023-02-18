package d2;

public class Compadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(1,2);
		Complex c2=new Complex(2,3);
		c1.print();
		c2.print();
		c1.add(c2);
		c1.print();
	}

}

class Complex{
	float x;
	float y;
	Complex(float x,float y){
		this.x=x;
		this.y=y;
	}
	public void add(Complex c) {
		this.x+=c.x;
		this.y+=c.y;
	}
	public void print() {
		System.out.println(this.x+"+"+this.y+"i");
	}
}