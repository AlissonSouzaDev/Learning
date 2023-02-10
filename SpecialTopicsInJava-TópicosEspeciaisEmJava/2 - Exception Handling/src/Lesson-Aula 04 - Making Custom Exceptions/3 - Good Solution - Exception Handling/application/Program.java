package application;

import java.time.LocalDate;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		
			System.out.print("Room number:" + " ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy):" + " ");
			LocalDate checkIn = LocalDate.parse(sc.next(), Reservation.fmt);
			checkIn.format(Reservation.fmt);
			System.out.print("Check-out date (dd/MM/yyyy):" + " ");
			LocalDate checkOut = LocalDate.parse(sc.next(), Reservation.fmt);
			checkOut.format(Reservation.fmt);
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println(reservation);
				
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy):" + " ");
			checkIn = LocalDate.parse(sc.next(), Reservation.fmt);
			System.out.print("Check-out date (dd/MM/yyyy):" + " ");
			checkOut = LocalDate.parse(sc.next(), Reservation.fmt);
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);
		
		}
		
		catch (DomainException e) {
			
			System.out.println("Error in reservation:" + " " + e.getMessage());
			
		}
		
		catch (RuntimeException e) {
			
			System.out.println("Unexpected Error!");
			
		}
		
		sc.close();
		
	}
	
}
