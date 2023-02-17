package d2;

public class d22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex c1=new complex(1,2);
		complex c2=new complex(2,3);
		c1.print();
		c2.print();
		c1.add(c2);
		c1.print();
	}

}

class complex{
	float x;
	float y;
	complex(float x,float y){
		this.x=x;
		this.y=y;
	}
	public void add(complex c) {
		this.x+=c.x;
		this.y+=c.y;
	}
	public void print() {
		System.out.println(this.x+"+"+this.y+"i");
	}
}