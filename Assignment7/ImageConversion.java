package Assignment7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream("./src/Assignment7/pic.jpeg");
			FileOutputStream fileOutputStream = new FileOutputStream("./src/Assignment7/pic2.jpeg");
			byte buff[] = new byte[1024];
			int i;
			while ((i = fileInputStream.read(buff)) != -1) {
				fileOutputStream.write(buff);
			}

			fileInputStream.close();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
