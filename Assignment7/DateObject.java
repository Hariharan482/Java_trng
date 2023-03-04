package Assignment7;

import java.io.*;
import java.util.Date;

public class DateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		ReadObj readObj = new ReadObj();
		WriteObject writeObj = new WriteObject();
		try {
			System.out.println("writing..");
			writeObj.write(date);
			System.out.println("reading..");
			readObj.read(date);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class WriteObject {
	void write(Date date) throws IOException {
		FileOutputStream fileInputStream = new FileOutputStream("./src/Assignment7/emp.dat");
		ObjectOutputStream objectInputStream = new ObjectOutputStream(fileInputStream);

		objectInputStream.writeObject(date);
	}
}

class ReadObj {
	void read(Date date) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("./src/Assignment7/emp.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		System.out.println((Date) objectInputStream.readObject());
	}
}