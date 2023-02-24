package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QforQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Enter the numerator ");
				String num = sc.next();
				if (num.charAt(0) == 'q' || num.charAt(0) == 'Q') {
					System.exit(0);
				} else {
					System.out.print("Enter the divisor ");
					String denom = sc.next();
					int num1 = Integer.parseInt(num);
					int denom1 = Integer.parseInt(denom);
					int res = num1 / denom1;
					System.out.println(res);
				}
			} catch (ArithmeticException e) {
				System.out.println(e);
			} catch (NumberFormatException i) {
				System.out.println("enter valid number");
				sc.nextLine();
			}
		}
	}

}
