package Assignment7;

import java.io.File;
import java.util.Scanner;

public class ListFilesInDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner=new Scanner(System.in);
		String string = "./src";
		File file = new File(string);
		String strings1[] = file.list();

		if (file.isDirectory()) {
			String strings[] = file.list();
			for (int i = 0; i < strings.length; i++) {
				System.out.println(strings[i]);
			}
		} else {
			System.out.println("not exists");
		}
	}

}
