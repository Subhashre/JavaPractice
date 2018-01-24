package main.com.subha.concept.java8.DateAPI;

import java.time.Year;
import java.util.Scanner;

public class YearClassAPIExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year...");
		int n = sc.nextInt();
		Year y = Year.of(n);
		if(y.isLeap())
			System.out.printf("The year %d is a leap year \n",n);
		else
			System.out.printf("The year %d is not a leap year \n",n);
	}

}
