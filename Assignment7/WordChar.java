package Assignment7;

import java.util.Scanner;

public class WordChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		try {
			while (scanner.hasNext()) {
				char c = scanner.next().charAt(0);
				count++;
			}
		} finally {
			System.out.println(count);
		}
	}

}
