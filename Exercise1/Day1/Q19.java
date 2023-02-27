package d1;
import java.util.*;
public class Q19 {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows nd cols");
		int a[][]=new int[sc.nextInt()][sc.nextInt()];
		sc.nextLine();
		System.out.println("enter values");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		P p=new P();
		p.print(a);
		p.rev(a);
		System.out.println("row revers mat");
		p.print(a);
	}
}	
	class P{
		public void print(int b[][]){
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b[i].length;j++) {
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
				}
			}
		public void rev(int a[][]) {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					int m=a[i].length-1;
					for(int k=0;k<a[i].length/2;k++) {
						int t=a[i][k];
						a[i][k]=a[i][m];
						a[i][m]=t;
						m--;
				}
			}}

		}
}