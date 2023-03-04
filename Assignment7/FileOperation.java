package Assignment7;

import java.io.File;
import java.nio.file.Files;

public class FileOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("./src/Assignment7/output.txt");
		File file2 = new File("./src/Assignment7/exercises.txt");
		System.out.println(file1.exists());
		if (file1.renameTo(file2)) {
			System.out.println("file renamed");
			if (file1.delete()) {
				System.out.println("file successfully deleted");
			}
		} else {
			System.out.println("failed");
		}
		System.out.println(file2.length());
	}

}
