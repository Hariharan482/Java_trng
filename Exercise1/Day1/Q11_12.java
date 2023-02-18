package d1;
import java.util.*;
public class Q11_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int a[][]=new int[sc.nextInt()][];
		int e=1;
		int r=a.length;
		for(int i=0;i<r;i++) {
			System.out.println("enter no of cols");
			int c=sc.nextInt();
			a[i]=new int[c];
			for(int j=0;j<c;j++) {
			a[i][j]=e;
			e++;}
		}
		
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i].length);
			for(int j=0;j<a[i].length;j++) {
				 System.out.print(a[i][j]+" ");
			}
			System.out.println();
	}

		
	//args
	System.out.println("Arg 0 "+args[0]);
	System.out.println("Arg 1 "+args[1]);
		
}}
