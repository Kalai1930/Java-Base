package com.greenTechnoClass.Day3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.now();
		//System.out.println(dt);
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getDayOfYear());
		//System.out.println(dt.getDayOfWeek());
		System.out.println(dt.getHour());
		System.out.println(dt.getMinute());
		System.out.println(dt.getSecond());
		System.out.println(dt.getYear()); */
		
		//other timezone
		ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime america = ZonedDateTime.now(ZoneId.of("America/New_York"));
		ZonedDateTime uk = ZonedDateTime.now(ZoneId.of("Europe/London"));
		
		System.out.println(india.getHour());
		System.out.println(america.getHour());
		System.out.println(uk.getHour());
		
	}

}
