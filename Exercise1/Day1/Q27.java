package d1;
import java.util.*;
public class Q27 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			System.out.println("org inv:"+i);
			i+=(i*0.4);
			System.out.println("after one yr:"+i);
			i-=1500;
			System.out.println("after second yr:"+i);
			i+=(i*0.12);
			System.out.println("after third yr:"+i);
	}

}
