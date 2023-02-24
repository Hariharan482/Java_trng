package day4;

import java.util.Scanner;

public class MethodThrowingExpctn {
	
	public static void main(String[] args) throws MyExcep {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char other than @");
		char char1=sc.next().charAt(0);
		try {
		if(char1=='@')
			throw new MyExcep("enter a valid char");
		else {
			System.out.println(char1);
		}}
		catch(MyExcep e) {
			System.out.println(e);
		}
	}

}
