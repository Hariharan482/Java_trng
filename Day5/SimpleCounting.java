package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.execute(() -> {
			for (int i = 1; i <= 100; i++) {
				System.out.println(i);
				try 
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i % 10 == 0) 
				{
					System.out.println(i / 10 + " set of Ten numbers reached");
				}
			}
		});
		executorService.shutdown();

	}

}
