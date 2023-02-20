package d2;

public class Quez12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wipro[] warr=new Wipro[]{new WiproInfoTech(),new WiproBPO(),new WiproTech()};
		//Wipro w=new Wipro();
	}

}

abstract class Wipro{
	public abstract void getInfo();
	
}

class WiproInfoTech extends Wipro{
	public void getInfo(){
		System.out.println("WiproInfoTEch");
	}
}

class WiproBPO extends Wipro{
	public void getInfo() {
		System.out.println("WiproBPo");
	}
}

class WiproTech extends Wipro{
	public void getInfo() {
		System.out.println("WiproTEch");
	}
}