package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findevenodd fedo=new findevenodd();
		ExecutorService es=Executors.newFixedThreadPool(2);
		es.execute(()->{
			fedo.even();
		});
		es.execute(()->{
			fedo.odd();
		});
		es.shutdown();
	}
	
}

class findevenodd{
	void even() {
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println("even :"+i);
			}
		}
	}
	
	void odd() {
		for(int i=0;i<=100;i++) {
			if(i%2!=0) {
				System.out.println("odd :"+i);
			}
		}
	}

}