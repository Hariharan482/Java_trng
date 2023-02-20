package d2;

public class Ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h=new House();
		h.setDoor(75, 12);
		h.setWind(50, 11);
		h.getCost();
	}

}

class House{
	Door d;
	Window w;
	void setDoor(int a,int b) {
		d.setvalue(a, b);
	}
	void getCost() {
		System.out.println(d.getCost());
		System.out.println(w.getCost());
	}
	void setWind(int a,int b) {
		w.setvalue(a, b);
	}
}

class Door{
	int cost,area,psqmc;
	int getCost(){
		cost=area*psqmc;
		return cost;
	}
	void setvalue(int n,int b) {
		area=n;
		psqmc=b;
	}
}

class Window{
	int cost,area,psqmc;
	int getCost() {
		cost=area*psqmc;
		return cost;
	}
	void setvalue(int n,int b) {
		area=n;
		psqmc=b;
	}

}