package entities;

import java.util.Scanner;

public class BoardingHouse {
	
	public Scanner sc = new Scanner(System.in);
	
	private int roomsToRent;
	private String[] vectName;
	private String[] vectEmail;
	private Integer[] vectRooms;
	
	public BoardingHouse() {
		
	}
	
	public int getRoomsToRent() {
		
		return roomsToRent;
		
	}

	public String[] getVectName() {
		
		return vectName;
		
	}
	
	public void setVectName(int parameter) {
		
		sc.nextLine();
		vectName[parameter] = sc.nextLine();
		
	}

	public String[] getVectEmail() {
		
		return vectEmail;
		
	}
	
	public void setVectEmail(int parameter) {
		
		vectEmail[parameter] = sc.nextLine();
		
	}

	public Integer[] getVectRooms() {
		
		return vectRooms;
		
	}
	
	public void setVectRooms(int parameter) {
		
		vectRooms[parameter] = sc.nextInt();
		
		while (vectRooms[parameter] < 0 || vectRooms[parameter] >= 10) {
			
			System.out.println();
			System.out.println("Invalid room, please type again!");
			System.out.print("Room:" + " ");
			vectRooms[parameter] = sc.nextInt();
			
		}
		
		System.out.println();
		
	}
	
	public void vectStarter() {
		
		roomsToRent = sc.nextInt();
		
		vectName = new String[10];
		vectEmail = new String[10];
		vectRooms = new Integer[10];
		
		System.out.println();
		
	}
	
	public String toString(int parameter) {
		
		return vectRooms[parameter]
				+ ": " 
				+ vectName[parameter]
				+ ", " 
				+ vectEmail[parameter];				
			
	}
	
}
