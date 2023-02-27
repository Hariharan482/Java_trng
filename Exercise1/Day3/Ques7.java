package d3;
import Vechicle.Fourwheeler;
public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.wheel();
	}

}

class Car extends Fourwheeler{
	public void wheel(){
		System.out.println("Car has 4 wheels");
	}
} 