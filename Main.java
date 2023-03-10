package Assignment6;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter expected departure date & time in format - (dd/mm/yyyy HH:MM:ss)");
		String date = scanner.nextLine();
		System.out.println("Speed nd dist to be travelled :");
		double speed = scanner.nextDouble();
		double dist = scanner.nextDouble();
		Fact.check(date, speed, dist);
		scanner.close();
	}

}

class Fact {
	static void check(String date, double speed, double dist) {
		
		LocalDateTime localDateTime = setDate.set(date);
		CalcTime ct = new CalcTime(speed, dist,localDateTime);
		localDateTime = CheckHoliday.checkHolidays(localDateTime);
		System.out.println(ct.get());
		
	}
}

class CalcTime {
	private double dist;
	private double speed;
	private LocalDateTime localDateTime;
	

	CalcTime(double speed, double dist,LocalDateTime localDateTime) {
		this.speed = speed;
		this.dist = dist;
		this.localDateTime=localDateTime;
		calcHrs();
	}

	void calcHrs() {
		
		long remTime=0;
		int daysCount=0;
		LocalTime reset ;
		long totalMins=(long) ((dist/speed)*60);

		LocalTime FinalTime = LocalTime.of(23, 59, 59);
		Duration between = Duration.between(localDateTime.toLocalTime(), FinalTime);
		//System.out.println(between.toMinutes());
		long betweenMins=between.toMinutes();
		
		int dayTime=480;
		
		if(totalMins<=dayTime) {
			if(betweenMins>=totalMins) {
				remTime=totalMins;
				totalMins=0;
				reset = localDateTime.toLocalTime();
			}
			else {
				totalMins-=betweenMins;
				reset = LocalTime.of(0,0,0);
				daysCount++;
			}
		}
		else {
			if(betweenMins<=dayTime) {
				totalMins-=remTime;
				reset = LocalTime.of(0,0,0);
				daysCount++;
			}
			else {
				totalMins-=dayTime;
				reset = LocalTime.of(0,0,0);
				daysCount++;
			}
		}
		
		while(totalMins>0){
            if(totalMins>dayTime)
            {
                totalMins-=dayTime;
                daysCount++;
            }
            else
            {
                remTime = totalMins;
                totalMins-=totalMins;
            }
           }
		while(daysCount>0) {
			localDateTime=CheckHoliday.checkHolidays(localDateTime);
			localDateTime=localDateTime.plusDays(1);
			daysCount--;
		}
		localDateTime=localDateTime.plusMinutes(remTime);
	}
	
	LocalDateTime  get(){
		return localDateTime;
	}
}

class setDate {

	static LocalDateTime set(String date) {
		if (date.equals("now"))
			return LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.parse(date, dateTimeFormatter);

		//System.out.println(localDateTime);
		return localDateTime;
	}
}

class CheckHoliday {

	static LocalDateTime checkHolidays(LocalDateTime localDateTime) {
		final String sunday="SUNDAY";
		final String saturday="SATURDAY";
		int day = localDateTime.getDayOfMonth();
		int month = localDateTime.getMonthValue();

		if (localDateTime.getDayOfWeek().toString().equals(sunday)) {
			localDateTime = localDateTime.plusDays(1);
			return localDateTime;
		}
		if (day <= 15 && day > 7 && localDateTime.getDayOfWeek().toString().equals(saturday)) {
			localDateTime = localDateTime.plusDays(1);
			return localDateTime;
		}
		if (day == 15 && month == 8) {
			localDateTime = localDateTime.plusDays(1);
			return localDateTime;
		}
		if (day == 26 && month == 1) {
			localDateTime = localDateTime.plusDays(1);
			return localDateTime;
		}

		return localDateTime;
	}
}
