package d2;

public class Ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Res r=new Res();
		r.setMarks(67, 77, 56);
		System.out.println(r.calc());
	}

}

class Student{
	String name;
	int rno;
	
}
class Exam extends Student{
	int mat,phy,chem;
	void setMarks(int mat,int phy,int chem) {
		this.mat=mat;
		this.phy=phy;
		this.chem=chem;
	}
}

class Res extends Exam{
	int tot=0;
	int calc() {
		tot=mat+phy+chem;
		return tot;
	}
}