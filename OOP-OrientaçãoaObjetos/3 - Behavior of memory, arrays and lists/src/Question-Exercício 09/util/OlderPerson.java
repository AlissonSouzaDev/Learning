package util;

public class OlderPerson {
	
	private static String olderPerson;
	private static int olderAge;
	
	public static String getOlderPerson() {
		
		return olderPerson;
		
	}

	public static void setOlderPerson(int[] vectAge, String[] vectName, int parameter) {
		
		if (vectAge[parameter] > olderAge) {
			
			olderPerson = vectName[parameter];
			olderAge = vectAge[parameter];
			
		}
		
	}
	
	public static void reset() {
		
		olderPerson = null;
		olderAge = 0;
		
	}

}
