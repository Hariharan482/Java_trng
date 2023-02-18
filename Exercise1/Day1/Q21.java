package d1;
import java.util.*;
public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year nd month :");
		int y=sc.nextInt();
		String m=sc.next();
		
		switch(m) {
		case "Jan" :
			System.out.println(31);
			break;
		case "Feb" :
			if(y%4==0 && (y%100!=0 || y%400==0))
				System.out.println(29);
			else 
				System.out.println(28);
			break;
		case "Mar" :
			System.out.println(31);
			break;
		case "Apr" :
			System.out.println(30);
			break;
		case "May" :
			System.out.println(31);
			break;
		case "Jun" :
			System.out.println(30);
			break;
		case "Jul" :
			System.out.println(31);
			break;
		case "Aug" :
			System.out.println(31);
			break;
		case "Sep" :
			System.out.println(30);
			break;
		case "Oct" :
			System.out.println(31);
			break;
		case "Nov" :
			System.out.println(30);
			break;
		case "Dec" :
			System.out.println(31);
			break;
		default :
			System.out.println("invalid month");
		}
	}

}
