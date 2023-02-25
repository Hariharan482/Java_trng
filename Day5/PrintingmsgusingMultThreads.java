package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintingmsgusingMultThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es=Executors.newFixedThreadPool(4);
		Message msg=new Message();
		String str="[ ------Message------ ]";
		es.execute(()->{
			msg.print(0, 6, str);
		});
		es.execute(()->{
			msg.print(6, 12, str);
		});
		es.execute(()->{
			msg.print(12, 18, str);
		});
		es.execute(()->{
			msg.print(18, 23, str);
		});
		es.shutdown();
	}

}

class Message{
	synchronized void print(int start,int end,String msg) {
		for(int i=start;i<end;i++) {
			System.out.print(msg.charAt(i)+"");
		}
	}
}