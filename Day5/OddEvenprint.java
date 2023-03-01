package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindEvenOdd findEvenOdd = new FindEvenOdd();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(() -> {
			findEvenOdd.printEven();
		});
		executorService.execute(() -> {
			findEvenOdd.printOdd();
		});
		executorService.shutdown();
	}

}

class FindEvenOdd {
	void printEven() {
		for (int i = 0; i <= 100; i++) 
		{
			if (i % 2 == 0) 
			{
				System.out.println("printEven :" + i);
			}
		}
	}

	void printOdd() {
		for (int i = 0; i <= 100; i++) 
		{
			if (i % 2 != 0) 
			{
				System.out.println("printOdd :" + i);
			}
		}
	}

}