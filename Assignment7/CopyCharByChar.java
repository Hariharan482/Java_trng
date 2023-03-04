package Assignment7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharByChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fileReader = new FileReader("./src/Assignment7/textfile.txt");
			FileWriter fileWriter = new FileWriter("./src/Assignment7/copytext.txt");
			int c;
			while ((c = fileReader.read()) != -1) {
				//System.out.println((char)c);
				fileWriter.write(c);
			}
			fileReader.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
