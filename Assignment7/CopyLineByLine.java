package Assignment7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyLineByLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/Assignment7/textfile.txt"));
			BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("./src/Assignment7/copytext2.txt"));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				bufferWriter.write(line);
				bufferWriter.newLine();
			}
			bufferedReader.close();
			bufferWriter.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
