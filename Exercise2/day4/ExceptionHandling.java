package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Enter the numerator ");
				String numerator = sc.next();
				if (numerator.charAt(0) == 'q' || numerator.charAt(0) == 'Q') {
					System.exit(0);
				} else {
					System.out.print("Enter the divisor ");
					String denominator = sc.next();
					int num1 = Integer.parseInt(numerator);
					int denominator1 = Integer.parseInt(denominator);
					int result = num1 / denominator1;
					System.out.println(result);
				}
			}
			catch (NumberFormatException i) {
				System.out.println("enter valid number");
				sc.nextLine();
			}
 
			catch (ArithmeticException e) {
				System.out.println(e);
			} 		}
	}

}
