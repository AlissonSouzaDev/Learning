package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
		
			while (x > 0 && y > 0) {
			
				System.out.println("first");
			
				x = sc.nextInt();
				y = sc.nextInt();
			
			}
		
			while (x < 0 && y > 0) {
			
				System.out.println("second");
			
				x = sc.nextInt();
				y = sc.nextInt();
			
			}
		
			while (x < 0 && y < 0) {
			
				System.out.println("third");
			
				x = sc.nextInt();
				y = sc.nextInt();
			
			}
		
			while (x > 0 && y < 0) {
			
				System.out.println("fourth");
			
				x = sc.nextInt();
				y = sc.nextInt();
			
			}
		
		}
		
		sc.close();

	}

}
