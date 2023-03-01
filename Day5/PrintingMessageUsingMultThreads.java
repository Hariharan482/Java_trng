package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintingMessageUsingMultThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		Message message = new Message();
		//String string1 = "[ ------Message------ ]";
		executorService.execute(() -> 
		{
			//message.printString(0, 6, string1);
			message.printString("\"[ ------" + Thread.currentThread().getName() + "------ ]\" " );
		});
		executorService.execute(() -> 
		{
			//message.printString(6, 12, string1);
			message.printString("\"[ ------" + Thread.currentThread().getName() + "------ ]\" " );
		});
		executorService.execute(() -> 
		{
			//message.printString(12, 18, string1);
			message.printString("\"[ ------" + Thread.currentThread().getName() + "------ ]\" " );
		});
		executorService.execute(() -> 
		{
			//message.printString(18, 23, string1);
			message.printString("\"[ ------" + Thread.currentThread().getName() + "------ ]\" " );
		});
		executorService.shutdown();
	}

}

class Message {
	synchronized void printString( String string1) 
	{
			System.out.println(string1);
	}
}