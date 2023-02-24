package day4;

import java.util.Scanner;

public class UserDfExcep {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");
		char st=sc.next().charAt(0);
		try{if(st=='@') {
			throw new MyExcep("not a valid char");
		}}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


class MyExcep extends Exception{
	String msg;
	MyExcep(String msg){
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
}

