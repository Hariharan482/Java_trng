package d2;

public class Ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r=new Result();
		r.setMarks(67, 77, 56);
		System.out.println(r.calc());
	}

}

class Student{
	String name;
	int rollno;
	
}
class Exam extends Student{
	int mat,phy,chem;
	void setMarks(int mat,int phy,int chem) {
		this.mat=mat;
		this.phy=phy;
		this.chem=chem;
	}
}

class Result extends Exam{
	int total=0;
	int calc() {
		total=mat+phy+chem;
		return total;
	}
}