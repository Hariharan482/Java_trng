package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventoryMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Inventory inventory = new Inventory();
		executorService.execute(() -> {
			for (int i = 0; i < 3; i++) 
			{
				inventory.produce();
			}
		});
		executorService.execute(() -> {
			for (int i = 0; i < 3; i++) 
			{
				inventory.consume();
			}
		});
		executorService.shutdown();
	}
}

class Inventory {
	int items = 0;

	synchronized void produce() {
		if (items == 1) {
			try 
			{
				wait();
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
		System.out.println("Producer added prod");
		items = 1;
		notify();
	}

	synchronized void consume() {
		if (items == 0) 
		{
			try 
			{
				wait();
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
		System.out.println("Consumer consumes prod");
		items = 0;
		notify();
	}
}