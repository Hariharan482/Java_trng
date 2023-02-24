package day4;

import java.io.IOException;

public class MethThrowIOExcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcpDemo exd=new ExcpDemo();
		exd.throwExcep();
	}

}

class ExcpDemo{
	void throwExcep(){
		//throw new IOException("IO Exception");
	}
}