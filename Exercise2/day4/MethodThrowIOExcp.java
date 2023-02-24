package day4;

import java.io.IOException;

public class MethodThrowIOExcp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExceptionDemo exd=new ExceptionDemo();
		exd.throwExcep();
		System.out.println("hello");
	}

}

class ExceptionDemo  {
	void throwExcep() throws IOException{
		throw new IOException("IO Exception");
	}
}