package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-09T19:35:54");
		Instant d06 = Instant.parse("2022-08-20T17:26:12Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("Past Week Local Date =" + " " + pastWeekLocalDate);
		System.out.println("Next Week Local Date =" + " " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("Past Week Local Date Time =" + " " + pastWeekLocalDateTime);
		System.out.println("Next Week Local Date Time =" + " " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Past Week Instant =" + " " + pastWeekInstant);
		System.out.println("Next Week Instant =" + " " + nextWeekInstant);

		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias =" + " " + t1.toDays());
		System.out.println("t2 dias =" + " " + t2.toDays());
		System.out.println("t3 dias =" + " " + t3.toDays());
		System.out.println("t4 dias =" + " " + t4.toDays());	

	}

}
