package d3;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere s=new Sphere(2);
		Triangle t=new Triangle(2,3,5);
		Circle c=new Circle(5);
		
	}

}

interface calcArea{
	void area();
	void perm();
}
interface calcVolume{
	void vol();
	void sarea();
}

class Circle implements calcArea{
	int r;
	Circle(int r){
		this.r=r;
		System.out.println("***Circle***");
		area();
		perm();
	}
	public void area(){
		System.out.println("Area:"+Math.PI*r*r);
	}
	public void perm(){
		System.out.println("Perimeter:"+2*Math.PI*r);
	}
}

class Triangle implements calcArea{
	int a,b,c;
	Triangle(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("***Triangle***");
		area();
		perm();
	}
	public void area(){
		double s=(a+b+c)/2;
		System.out.println("Area:"+Math.sqrt((s*(s-a)*(s-b)*(s-c))));
	}
	public void perm(){
		System.out.println("Perimeter:"+(a+b+c));
	}
}


class Square implements calcArea{
	int r;
	Square(int r){
		this.r=r;
		System.out.println("***Square***");

		area();
		perm();
	}
	public void area(){
		System.out.println("Area:"+r*r);
	}
	public void perm(){
		System.out.println("Perimeter"+4*r);
	}
}

class Sphere implements calcArea,calcVolume{
	int r;
	Sphere(int r){
		this.r=r;
		System.out.println("Area , Perimeter , Volume , SurfaceArea Of Sphere :");
		area();
		perm();
		vol();
		sarea();
			}
	public void area(){
		System.out.println(Math.PI*r*r);
	}
	public void vol(){
		System.out.println((4/3)*Math.PI*r*r*r);
	}
	public void perm(){
		System.out.println(2*Math.PI*r);
	}
	public void sarea() {
		System.out.println(4*Math.PI*r*r);
	}
	
}


class Cuboid implements calcArea,calcVolume{
	int r;
	Cuboid(int r){
		this.r=r;
		System.out.println("Area , Perimeter , Volume , SurfaceArea Of Cuboid :");
		area();
		perm();
		vol();
		sarea();
		

	}
	public void area(){
		System.out.println(r*r);
	}
	public void vol(){
		System.out.println(r*r*r);
	}
	public void perm(){
		System.out.println(4*r);
	}
	public void sarea() {
		System.out.println(6*r*r);
	}
}