package day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DisplayDgitalclock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(3);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String time = dtf.format(now);
		int hrs = Integer.parseInt(time.substring(11, 13));
		int min = Integer.parseInt(time.substring(14, 16));
		int sec = Integer.parseInt(time.substring(17, 19));

		DigitalClock dc = new DigitalClock(hrs, min, sec);
		// System.out.println(hrs+" "+sec+" "+min);
		es.execute(() -> {
			while (true) {
				try {
					dc.incsec();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
		});
		es.execute(() -> {
			while (true)
				dc.incmin();
		});
		es.execute(() -> {
			while (true)
				dc.inchours();
		});
		es.shutdown();
	}

}

class DigitalClock {
	int hrs, min, sec;

	public DigitalClock(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}

	synchronized void inchours() {
		if (min >= 59 && sec >= 59) {
			if (hrs > 24) {
				hrs++;
				min = 0;
				sec = 0;
				System.out.println(hrs + ":" + min + ":" + sec);
			} else {
				try {
					wait();
				} catch (Exception e) {
				}
			}
		}
		notifyAll();
	}

	synchronized void incmin() {
		if (sec >= 59) {
			min++;
			sec = 0;
			System.out.println(hrs + ":" + min + ":" + sec);
		}
		else {
			try {
				wait();
			} catch (Exception e) {
			}
		}

		notifyAll();
	}

	synchronized void incsec() throws InterruptedException {
		if (sec < 60) {
			for (int i = sec; i < 59; i++) {
				sec++;
				System.out.println(hrs + ":" + min + ":" + sec);
				Thread.sleep(1000);

							}
		} else {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		notifyAll();

	}

}