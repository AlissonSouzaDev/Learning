package util;

import java.util.Scanner;

public class SumVect {

	public static Scanner sc = new Scanner(System.in);
	
	public static int n;
	public static int[] vectParcelA;
	public static int[] vectParcelB;
	public static int[] vectSumC;
	
	public static void vectDefiner() {
		
		n = sc.nextInt();
		
	}
	
	public static void vectParcelAExecution() {
		
		vectParcelA = new int[n];
		
		for (int i = 0; i < vectParcelA.length; i++) {
			
			vectParcelA[i] = sc.nextInt();
			
		}
	
	}
	
	public static void vectParcelBExecution() {
		
		vectParcelB = new int[n];
		
		for (int i = 0; i < vectParcelB.length; i++) {
			
			vectParcelB[i] = sc.nextInt();
			
		}
		
		sc.close();
	
	}
	
	public static void vectSumCExecution() {
		
		vectSumC = new int[n];
		
		for (int i = 0; i < vectSumC.length; i++) {
			
			vectSumC[i] = vectParcelA[i] + vectParcelB[i];
			System.out.println(vectSumC[i]);
			
		}
	
	}	
	
}
