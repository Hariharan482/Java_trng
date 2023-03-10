package Assignment5;

import java.util.HashMap;
import java.util.Scanner;

public class FlyWeight {

	public static void main(String[] args) {
		
		Factory factory=new Factory();
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		Pen pen=factory.getPen(name);
		System.out.println(pen.getRefillColor());
	}

}
class Factory{
	private HashMap<String, Pen> pens=new HashMap<>();
	
	Pen getPen(String string) {
		Pen pen=pens.get(string);
		if(pen==null) {
			pen=new Pen();
			pen.setRefillColor(string);
			pens.put(string, pen);
		}
		return pen;
	}
}
class Pen{
	String color;
	
	void setRefillColor(String color) {
		this.color=color;
	}
	
	String getRefillColor() {
		return this.color;
	}
}

