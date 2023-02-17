package d1;
import java.util.*;
public class d18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of std");
		int r=sc.nextInt();
		int stud[][]=new int [r][5];
		float res[]=new float[r];
		for(int i=0;i<stud.length;i++) {
			int tt=0;
			for(int j=0;j<5;j++) {
				stud[i][j]=sc.nextInt();
				tt+=stud[i][j];
			}
			sc.nextLine();
			res[i]=tt/5;
		}
		System.out.println(Arrays.toString(res));
	}
}
