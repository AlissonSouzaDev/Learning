package util;

import java.util.Arrays;

public class Average {
	
	private static double average;
	private static int peerAverage;
	private static double[] vectAverage;
	
	public static double getAverage() {
		
		return average;
		
	}
	
	public static void setAverage(double sum, double value) {
		
		average = sum / value;
				
	}
	
	public static int getPeerAverage() {
		
		return peerAverage;
		
	}
	
	public static void setPeerAverage(int[] vect, int parameter) {
		
		if (vect[parameter] % 2 == 0) {
			
			Sum.setSumResult(vect, parameter);
			peerAverage++;
			
		}
		
	}
	
	public static double setAverageOfPeerAverage(double sum) {
		
		return average = sum / peerAverage;
		
	}

	public static double[] getVectAverage() {
		
		return vectAverage;
		
	}
	
	public static void setVectAverage(double[] vectA, double[] vectB, int parameter) {
		
		vectAverage[parameter] = Sum.setSumResult(vectA, vectB, parameter);
		
	}

	public static void vectStarter(int parameter) {
		
		vectAverage = new double[parameter];
		
	}
	
	public static void peerAverageElements(double parameter) {
		
		if (Sum.getSumResult() != 0.0) {
			
			System.out.print("PEER AVERAGE =" + " " + parameter);
			
		} else {
			
			System.out.print("NO EVEN NUMBERS");
			
		}
		
	}
	
	public static void belowAverageElements(double[] vect, int parameter) {
		
		if (vect[parameter] < average) {
			
			System.out.println(vect[parameter]);
			
		}
		
	}
	
	public static void reset() {
		
		average = 0;
		peerAverage = 0;
		Arrays.fill(vectAverage, 0);
		
	}
	
}
