package d1;
import java.util.*;

public class p114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String x=sc.nextLine();
		//System.out.println(x.length());
		for(int i=0;i<x.length();i++) {
			int t=x.charAt(i)-'0';
			System.out.print(a[t]+" ");
	}}

}
