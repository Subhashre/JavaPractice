package main.com.subha.concept.java8.DateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate ld =LocalDate.now() ; 
		System.out.println(ld);
		int dd = ld.getDayOfMonth();
		
		int mm =ld.getMonthValue();
		int yyyy = ld.getYear();
		int dd1 = ld.getDayOfYear();
		
		System.out.println(dd +" - "+ mm+" - "+ yyyy);
		System.out.printf("%d %d %d \n",dd,mm,yyyy );
		System.out.println(dd1 +" - "+ mm+" - "+ yyyy);
		System.out.println("///////////////////////////");
		
		LocalTime lt = LocalTime.now(); 
		System.out.println(lt); // prints current time stamp
		int hh = lt.getHour();
		int min = lt.getMinute();
		int sec = lt.getSecond();
		int nano = lt.getNano();
		System.out.printf("%d: %d: %d: %d \n",hh,min,sec,nano );
		System.out.println("///////////////////////////");
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		int ddd = ldt.getDayOfMonth();
		int mmm = ldt.getMonthValue();
		int yyy = ldt.getYear();
		int hhh = ldt.getHour();
		int minute = ldt.getMinute();
		int second = ldt.getSecond();
		int nanoo = ldt.getNano();
		System.out.printf("%d: %d: %d \n",ddd ,mmm ,yyy);
		System.out.printf("%d: %d: %d: %d",hhh ,minute ,second,nanoo);
		
		System.out.println("///////////////////////////");
		LocalDateTime dt = LocalDateTime.of(1992,06,21,12,45);
		
		System.out.println(dt);
		int dddDt = dt.getDayOfMonth();
		int mmmDt = dt.getMonthValue();
		int yyyDt = dt.getYear();
		int hhhDt = dt.getHour();
		int minuteDt = dt.getMinute();
		int secondDt = dt.getSecond();
		int nanooDt = dt.getNano();
		System.out.printf("Date: %d: %d: %d \n",dddDt ,mmmDt ,yyyDt);
		System.out.printf("Time: %d: %d: %d: %d \n",hhhDt ,minuteDt ,secondDt,nanooDt);
		
		System.out.println("After 6 months : "+dt.plusMonths(6));
		System.out.println("Before 6 months : "+dt.minusMonths(6));
	}

}
