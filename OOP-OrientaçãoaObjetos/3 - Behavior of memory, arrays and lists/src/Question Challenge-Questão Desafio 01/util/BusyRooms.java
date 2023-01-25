package util;

public class BusyRooms {

	private static String name;
	private static String email;
	private static int room;

	public static String getName() {
		
		return name;
		
	}

	public static String getEmail() {
		
		return email;
		
	}

	public static int getRoom() {
		
		return room;
		
	}

	public static void setBusyRooms(Integer[] vectA, String[] vectB, String[] vectC, int parameter) {
		
		room = vectA[parameter];
		name = vectB[parameter];
		email = vectC[parameter];
		
		vectA[parameter] = null;
		vectB[parameter] = null;
		vectC[parameter] = null;
		
		vectA[room] = room;	
		vectB[room] = name;
		vectC[room] = email;	
		
	}
	
	public static void printer(Integer[] vect, int parameterA, String parameterB) {
		
		if (vect[parameterA] != null) {
			
			System.out.println(parameterB);
			
		}
		
	}
	
	public static void reset() {
		
		room = 0;
		name = null;
		email = null;
		
	}
	
}
