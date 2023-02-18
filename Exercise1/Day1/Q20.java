package d1;
import java.util.*;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Large l=new Large();
		
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
		
		l.fndrlrge(a);
	}

}

class Large{
	public void fndrlrge(int a[][]) {
		for(int i=0;i<a.length/a[0].length;i++) {
			//System.out.println(a.length+" "+a[i].length);
			for(int j=0;j<a[i].length;j++) {
				larg(a[j]);
			}
		}}
	void larg(int b[]) {
		int max=b[0];
		for(int i=1;i<b.length;i++) {
			if(max<b[i])
				max=b[i];
		}
		System.out.println("large no"+max);
	}
}