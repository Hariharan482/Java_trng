package day4;

import java.util.Scanner;

public class DervdClsExcp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dervd d=new Dervd();
	}

}

class Base {
	Base() throws Exception{
		System.out.println("Base Cls");
		throw new ArithmeticException();
	}
	
}

class Dervd extends Base{

	Dervd() throws Exception {
		try{
			//super();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
		
	}
	
}