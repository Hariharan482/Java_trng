package d2;

public class Stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result res=new Result();
		res.setname("XYZ");
		res.setroll(123);
		res.setmarks(67,76,88);
		System.out.println(res.calc());
		res.getDet();
	}

}

class Student{
	int rollno;
	String name;
	void setname(String name){
		this.name=name;
	}
	void setroll(int n) {
		rollno=n;
	}
}

class Exam extends Student{
	int mat,chem,phy;
	void setmarks(int a,int b,int c){
		mat=a;
		chem=b;
		phy=c;
	}
}

class Result extends Exam{
	float tot=0;
	float calc() {
		tot=mat+chem+phy;
		return tot;
	}
	void getDet() {
		System.out.println("Name :"+name+"\nRoll no :"+rollno);
		System.out.println("Marks :\nPhy :"+phy+"\nChem:"+chem+"\nMaths:"+mat+"\nTotal:"+tot);

	}
}