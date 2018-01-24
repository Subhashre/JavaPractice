package main.com.subha.concept.java8.DateAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		LocalDate dt = LocalDate.of(1992, Month.JUNE, 21);
		LocalDate today = LocalDate.now();
		Period period = Period.between(dt, today);
		System.out.printf("Your age is %d years %d months and %d Days \n",period.getYears(),period.getMonths(),period.getDays());
		
		
		period = Period.between(today, dt);
		System.out.printf("Your age is %d years %d months and %d Days",period.getYears(),period.getMonths(),period.getDays());
	}

}
