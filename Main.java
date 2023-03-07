package Assignment6;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter expected departure date & time in format - (dd/mm/yyyy HH:MM:ss)");
		String date = sc.nextLine();
		System.out.println("Speed nd dist to be travelled :");
		double speed = sc.nextDouble();
		double dist = sc.nextDouble();
		Fact.check(date, speed, dist);
		sc.close();
	}

}

class Fact {
	static void check(String date, double speed, double dist) {
		
		LocalDateTime ldt = setDate.set(date);
		CalcTime ct = new CalcTime(speed, dist,ldt);
		ldt = CheckHoliday.checkHolidays(ldt);
		System.out.println(ct.get());
		
	}
}

class CalcTime {
	private double dist;
	private double speed;
	private LocalDateTime ldt;
	

	CalcTime(double speed, double dist,LocalDateTime ldt) {
		this.speed = speed;
		this.dist = dist;
		this.ldt=ldt;
		calcHrs();
	}

	void calcHrs() {
		
		long remTime=0;
		int daysCount=0;
		LocalTime reset ;
		long totalmins=(long) ((dist/speed)*60);

		LocalTime FinalTime = LocalTime.of(23, 59, 59);
		Duration between = Duration.between(ldt.toLocalTime(), FinalTime);
		//System.out.println(between.toMinutes());
		long l=between.toMinutes();
		
		int dayTime=480;
		
		if(totalmins<=dayTime) {
			if(l>=totalmins) {
				remTime=totalmins;
				totalmins=0;
				reset = ldt.toLocalTime();
			}
			else {
				totalmins-=l;
				reset = LocalTime.of(0,0,0);
				daysCount++;
			}
		}
		else {
			if(l<=dayTime) {
				totalmins-=remTime;
				reset = LocalTime.of(0,0,0);
				daysCount++;
			}
			else {
				totalmins-=dayTime;
				reset = LocalTime.of(0,0,0);
				daysCount++;
			}
		}
		
		while(totalmins>0){
            if(totalmins>dayTime)
            {
                totalmins-=dayTime;
                daysCount++;
            }
            else
            {
                remTime = totalmins;
                totalmins-=totalmins;
            }
           }
		while(daysCount>0) {
			ldt=CheckHoliday.checkHolidays(ldt);
			ldt=ldt.plusDays(1);
			daysCount--;
		}
		ldt=ldt.plusMinutes(remTime);
	}
	
	LocalDateTime  get(){
		return ldt;
	}
}

class setDate {

	static LocalDateTime set(String date) {
		if (date.equals("now"))
			return LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime d = LocalDateTime.parse(date, df);

		//System.out.println(d);
		return d;
	}
}

class CheckHoliday {

	static LocalDateTime checkHolidays(LocalDateTime d) {
		int day = d.getDayOfMonth();
		int month = d.getMonthValue();

		if (d.getDayOfWeek().toString() == "SUNDAY") {
			d = d.plusDays(1);
			return d;
		}
		if (day <= 15 && day > 7 && d.getDayOfWeek().toString() == "SATURDAY") {
			d = d.plusDays(1);
			return d;
		}
		if (day == 15 && month == 8) {
			d = d.plusDays(1);
			return d;
		}
		if (day == 26 && month == 1) {
			d = d.plusDays(1);
			return d;
		}

		return d;
	}
}
