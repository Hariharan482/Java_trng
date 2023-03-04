package Assignment7;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();

		String strings[] = string.split(" ");

		for (String string1 : strings) {
			System.out.println(string1.length());
		}
	}

}
