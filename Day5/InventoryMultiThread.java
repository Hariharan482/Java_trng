package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventoryMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(2);
		Inventory iv = new Inventory();
		es.execute(() -> {
			for (int i = 0; i < 3; i++) {
				iv.add();
			}
		});
		es.execute(() -> {
			for (int i = 0; i < 3; i++) {
				iv.consume();
			}
		});
		es.shutdown();
	}
}

class Inventory {
	int items = 0;

	synchronized void add() {
		if (items == 1) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		System.out.println("Producer added prod");
		items = 1;
		notify();

	}

	synchronized void consume() {
		if (items == 0) {
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Consumer consumes prod");
		items = 0;
		notify();

	}
}