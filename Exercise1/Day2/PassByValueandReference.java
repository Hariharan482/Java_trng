package d2;

import java.util.Arrays;

public class PassByValueandReference {
	public static void main(String[] args) {
		Primitive p=new Primitive();
		int x=10;
		System.out.println("before funct call:"+x);
		p.change(x);
		System.out.println("after func call:"+x);
		int arr[]= {0,2,3,4,5};
		System.out.println("before funct call:"+Arrays.toString(arr));
		p.change(arr);
		System.out.println("aftr funct call:"+Arrays.toString(arr));
	}	
}
class Primitive{
	public void change(int x) {
		x++;
	}
	public void change(int x[]) {
		x[0]=1;
	}
}