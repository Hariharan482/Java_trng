package day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DisplayDigitalclock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String time = dateTimeFormatter.format(now);
		int hour = Integer.parseInt(time.substring(11, 13));
		int minute = Integer.parseInt(time.substring(14, 16));
		int second = Integer.parseInt(time.substring(17, 19));

		DigitalClock digitalClock = new DigitalClock(hour, minute, second);
		// System.out.println(hour+" "+second+" "+minute);
		executorService.execute(() -> {
			while (true) 
			{
				try 
				{
					digitalClock.incrementSecond();
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		executorService.execute(() -> {
			while (true)
			{
				digitalClock.incrementMinute();
			}
		});
		executorService.execute(() -> {
			while (true) 
			{
				digitalClock.incrementHour();
			}
		});
		executorService.shutdown();
	}
}

class DigitalClock {
	int hour, minute, second;

	// String apm="AM";
	public DigitalClock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	synchronized void incrementHour() {
		if (minute >= 59 && second >= 59) 
		{
			if (hour < 24) 
			{
				hour++;
				minute = 0;
				second = 0;
				System.out.println(hour + ":" + minute + ":" + second);
			} 
			else if (hour == 24) 
			{
				hour = 0;
				minute = 0;
				second = 0;
				System.out.println(hour + ":" + minute + ":" + second);
			} 
			else {
				try 
				{
					wait();
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
			}
		}
		notifyAll();
	}

	synchronized void incrementMinute() {
		if (second >= 59) 
		{
			minute++;
			second = 0;
			System.out.println(hour + ":" + minute + ":" + second);
		} 
		else 
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
		notifyAll();
	}

	synchronized void incrementSecond() throws InterruptedException {
		if (second < 60) 
		{
			for (int i = second; i < 59; i++) 
			{
				second++;
				System.out.println(hour + ":" + minute + ":" + second);
				Thread.sleep(1000);
			}
		} 
		else 
		{
			try 
			{
				wait();
			} 
			catch (Exception e) {
				System.out.println(e);
			}
		}
		notifyAll();
	}
}