package d1;
import java.util.*;
public class Q6_7_8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array ar=new Array();
		
		int a[]= {14,2,33,12};
		Scanner sc=new Scanner(System.in);
		// array resizing
		System.out.println("enter new sizw:");
		int x=sc.nextInt();
		a=Arrays.copyOf(a,x);
		System.out.println(Arrays.toString(a));
		
		ar.reverse(a);
		
		System.out.println("enter the element to be found:");
		int ser=sc.nextInt();
		if(ar.search(a, ser)) {
			System.out.println("found");
		}
		else
			System.out.println("not found");
		
		ar.ascending(a);
		ar.descending(a);		
		
}}

class Array{
	public void ascending(int b[]) {
		//ascending
				for(int i=0;i<b.length;i++) {
					for(int j=i;j<b.length;j++) {
						if(b[i]>b[j]) {
							int t=b[i];
							b[i]=b[j];
							b[j]=t;
						}
					}
				}
				System.out.println("Ascending order");
				System.out.println(Arrays.toString(b));

	}
	
	public void descending(int b[]) {
		//descending
				for(int i=0;i<b.length;i++) {
					for(int j=i;j<b.length;j++) {
						if(b[i]<b[j]) {
							int t=b[i];
							b[i]=b[j];
							b[j]=t;
						}
					}
				}
				System.out.println("Descending order :");
				System.out.println(Arrays.toString(b));

	}
	
	public boolean search(int b[], int ser) {
		//int c=0;
		//int flag=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]==ser) {
				System.out.println("index:"+i);
				return true;
		}
	}	
		return false;

	}
	
	public void reverse(int b[]) {
		// reverse elements
		int m=b.length-1;
				for(int i=0;i<b.length/2;i++) {
					int t=b[i];
					b[i]=b[m];
					b[m]=t;
					m--;
				}
		System.out.println("reversed elements");
		System.out.println(Arrays.toString(b));		
	}
}
