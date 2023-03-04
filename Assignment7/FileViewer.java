package Assignment7;

import java.io.*;

public class FileViewer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/Assignment7/textfile.txt"));
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
	}

}
