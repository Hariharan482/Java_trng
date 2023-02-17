package d1;
import java.util.*;
public class p112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,2,2,2,3,4};
		loc a=new loc();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(a.search(ar,x)) {
			System.out.println("found");
		}
		System.out.println("count"+a.c);
	}

}

class loc{
	static int c=0;
	public boolean search(int b[], int ser) {
		//int c=0;
		int flag=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]==ser) {
				c++;
			System.out.println("index:"+i);
			flag=1;
		}
	}	
		if(flag==1) {
			return true;
		}
		return false;

	}

}