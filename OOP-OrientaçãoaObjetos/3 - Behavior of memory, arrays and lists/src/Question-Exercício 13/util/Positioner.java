package util;

import java.util.Scanner;

public class Positioner {
	
	public static Scanner sc = new Scanner(System.in);
	
	private static int position;

	public static int getPosition() {
		
		return position;
		
	}

	public static void setPosition(int[][] matrix) {
		
		position = sc.nextInt();
		
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
		
					if (position == matrix[i][j]) {
					
							System.out.println("Position" + " " + i + "," + j);
					
								if (j != 0) {
						
										System.out.println("Left:" + " " + matrix[i][j - 1]);
						
									}
					
									if (j != matrix[i].length - 1) {
						
										System.out.println("Right:" + " " + matrix[i][j + 1]);
						
									}
					
									if (i != 0) {
						
										System.out.println("Up:" + " " + matrix[i - 1][j]);
						
									}
					
									if (i != matrix.length - 1) {
						
										System.out.println("Down:" + " " + matrix[i + 1][j]);
						
									}
					}
			}
			
		} 
		
	}
	
}
