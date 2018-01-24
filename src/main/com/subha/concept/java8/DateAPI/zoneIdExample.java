package main.com.subha.concept.java8.DateAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zoneIdExample {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("I am currently in "+zone +" zone");
		
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		
		ZoneId zoneAmerica = ZoneId.of("America/Los_Angeles");
		System.out.println("America zone is " + zoneAmerica);
		ZonedDateTime laDt = ZonedDateTime.now(zoneAmerica);
		System.out.println("Current time at America is " + laDt);
		
	}

}
