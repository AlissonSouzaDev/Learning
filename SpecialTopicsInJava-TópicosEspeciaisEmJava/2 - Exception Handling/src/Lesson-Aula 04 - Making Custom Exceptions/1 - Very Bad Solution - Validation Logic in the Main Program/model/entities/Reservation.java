package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
	
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}

	public Integer getRoomNumber() {
		
		return roomNumber;
		
	}

	public void setRoomNumber(Integer roomNumber) {
		
		this.roomNumber = roomNumber;
		
	}

	public LocalDate getCheckIn() {
		
		return checkIn;
		
	}

	public LocalDate getCheckOut() {
		
		return checkOut;
		
	}
	
	public Integer duration() {
		
		Duration drn = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());
		
		Long drn2 = drn.toDays();
		
		Integer drn3 = drn2.intValue();
		
		return drn3;
		
	}
	
	public void updateDates(LocalDate checkin, LocalDate checkOut) {
		
		this.checkIn = checkin;
		this.checkOut = checkOut;
		
	}
	
	@Override
	public String toString() {
		
		return "Reservation: Room "
				+ roomNumber
				+ ", check-in: "
				+ checkIn.format(fmt)
				+ ", check-out: "
				+ checkOut.format(fmt)
				+ ", "
				+ duration()
				+ " nights";
		
	}
	
}
