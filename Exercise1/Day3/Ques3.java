package d3;

import java.util.Arrays;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedStack fs=new FixedStack();
		fs.push(1);
		fs.push(2);
		fs.push(3);
		fs.pop();
		fs.pop();
		fs.pop();
		fs.pop();
		
		DynamicStack ds=new DynamicStack();
		System.out.println("Dynamic Stack :");
		ds.push(0);
		ds.push(1);
		ds.push(2);
		ds.push(3);
		ds.push(4);
		ds.push(5);
		ds.pop();
		ds.pop();
	}

}

interface Stack{
	void pop() ;
	void push(int n);
}

class FixedStack implements Stack{
	int a[]=new int[5];
	int top=-1;
	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(top==-1) {
			System.out.println("empty");
		}
		else {
		int s=a[top--];
		System.out.println(s);
		}
	}

	@Override
	public void push(int n) {
		// TODO Auto-generated method stub
		if(top>a.length) {
			System.out.println("stack is full");
		}
		else {
			a[++top]=n;
		}
	}
	
}

class DynamicStack implements Stack{
	int da[]=new int[4];
	int top=-1;
	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(top==-1) {
			System.out.println("empty");
		}
		else {
		int s=da[top--];
		System.out.println(s);
		}

		
	}

	@Override
	public void push(int n) {
		// TODO Auto-generated method stub
		if(top>=da.length-1) 
			resize(da.length);
		da[++top]=n;

	}
	void resize(int len) {
		da=Arrays.copyOf(da, len*2);
	}
	
}
