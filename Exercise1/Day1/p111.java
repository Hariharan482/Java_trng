package d1;
import java.util.*;
public class p111 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	check c=new check();
	if(c.isArmstrong(x)) {
		System.out.println("armstrong no");
	}
	else if(c.isPerfect(x)) {
		System.out.println("perfect no");
	}
	else if(c.isPalindrome(x)) {
		System.out.println("palindrome!");
	}
	else {
		System.out.println("none of these");
	}
	}
}

class check{
	static boolean isArmstrong(int n)   
	{   
	int temp, digits=0, last=0, sum=0;   
	temp=n;     
	while(temp>0)    
	{   
	temp = temp/10;   
	digits++;   
	}   
	temp = n;   
	while(temp>0)   
	{   
	last = temp % 10;   
	sum +=  (Math.pow(last, digits));   

	temp = temp/10;   
	}  
	if(n==sum)     
	return true;      
	else return false;   
	}   
	
	
	static boolean isPerfect(long num)  
	{       
	long sum=0;  
	for(int i=1; i <= num/2; i++)  
	{  
	if(num % i == 0)  
	{    
	sum=sum + i;  
	}   
	}
	if(sum==num) {
	return true;
	}
	return false;
	} 
	
	static boolean isPalindrome(int o) {
		  int reverseNum = 0;
		  int temp = o;

		  while (temp > 0) {

		    int lastDigit =  temp% 10;
		    reverseNum = reverseNum * 10 + lastDigit;
		    temp = temp / 10;
		  }

		  if (o == reverseNum) {
		    return true;
		  } else {
		    return false;
		  }

		}

}