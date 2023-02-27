package day4;


public class OutOfRange extends Exception{
	String msg;
	public OutOfRange(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
}