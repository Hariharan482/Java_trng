package d1;
import java.util.*;
public class Q4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(isPrime(a)) {
			System.out.println("prime");
		}
		else 
			System.out.println("not a prime");
		
		avg av=new avg();
		av.aver(5);
	}
	
	 static boolean isPrime(int x) {
		if(x==1 || x==2 || x==3) {
			return true;
		}
		else if(x%2==0 || x%3==0) {
			return false;
		}
		else {
			for(int i=5;i<x;i+=6) {
				if(x%i==0 || (x+2)%2==0) {
					return false;
				}
			}
		}
		return true;
	}
}

class avg{
	public void aver(int x){
		System.out.println(((x*(x+1))/2/x));
	}
}

