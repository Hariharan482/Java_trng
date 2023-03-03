package Assignment5;

import java.util.Scanner;

public class MementoPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		ActualClass actualClass=new ActualClass();
		
		int id=scanner.nextInt();
		String name=scanner.next();
		
		actualClass.setter(id, name);
		actualClass.print();
		
		actualClass.restore();
		actualClass.print();
	}

}

class ActualClass{
	int id;
	String name;
	Backup backup=new Backup();
	
	void setter(int id,String name) {
		backup.updateBackup(this.id,this.name);
		this.id=id;
		this.name=name;
	}
	
	void restore() {
		this.id=backup.id;
		this.name=backup.name;
	}
	
	void print() {
		System.out.println("Id : "+id+" Name : "+name);
	}
}

class Backup{
	int id;
	String name;
	
	public Backup() {
		// TODO Auto-generated constructor stub
	}
	
	void updateBackup(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
}