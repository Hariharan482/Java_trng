package d1;
import java.util.*;
public class d16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows nd columns");
		int a[][]=new int[sc.nextInt()][sc.nextInt()];
		int r=a.length;
		int c=a[0].length;
		//System.out.println(r+" "+c);
		int e=1;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=e;
				e++;
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				 System.out.print(a[i][j]+" ");
			}
			System.out.println();
	}
}
}
