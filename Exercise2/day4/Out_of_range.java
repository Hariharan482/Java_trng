package day4;


public class Out_of_range extends Exception{
	String msg;
	public Out_of_range(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
}