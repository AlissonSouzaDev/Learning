package application;

import entities.BoardingHouse;
import util.BusyRooms;

public class Program {

	public static void main(String[] args) {
		
		BoardingHouse execute = new BoardingHouse();
		
		System.out.print("How many rooms will be rented?" + " ");
		execute.vectStarter();
		
		for (int i = 0; i < execute.getRoomsToRent(); i++) {
			
			System.out.println("Rent #" + (i + 1) + ":" + " ");
			System.out.print("Name:" + " ");
			execute.setVectName(i);
			System.out.print("Email:" + " ");
			execute.setVectEmail(i);
			System.out.print("Room:" + " ");
			execute.setVectRooms(i);
			BusyRooms.setBusyRooms(execute.getVectRooms(), execute.getVectName(), execute.getVectEmail(), i);
			
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < execute.getVectRooms().length; i++) {

			BusyRooms.printer(execute.getVectRooms(), i, execute.toString(i));
			
		}
		
		BusyRooms.reset();
		
		execute.sc.close();
		
	}

}
