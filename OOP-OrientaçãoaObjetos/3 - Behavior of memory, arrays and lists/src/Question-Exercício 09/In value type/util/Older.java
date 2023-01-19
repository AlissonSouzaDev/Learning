package util;

import java.util.Scanner;

public class Older {

	public static Scanner sc = new Scanner(System.in);
	
	public static int n;
	public static String[] vectName;
	public static int[] vectAge;
	public static String olderPerson = null;
	public static int olderPersonAge = 0;
	
	public static void vectStarter() {
		
		n = sc.nextInt();
		vectName = new String[n];
		vectAge = new int[n];
		
	}
	
	public static void vectNameValueInserter(int parameter) {
		
		System.out.print("Name:" + " ");
		vectName[parameter] = sc.next();
		sc.nextLine();
		
	}
	
	public static void vectAgeValueInserter(int parameter) {
		
		System.out.print("Age:" + " ");
		vectAge[parameter] = sc.nextInt();
		
	}
	
	public static void olderPersonDefiner(int parameter) {
		
		if (vectAge[parameter] > olderPersonAge) {
			
			olderPerson = vectName[parameter];
			olderPersonAge = vectAge[parameter];
			
		}
		
	}
	
}
