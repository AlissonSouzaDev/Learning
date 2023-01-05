package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			
			System.out.print((int) i + " ");
			System.out.print((int) Math.pow(i, 2) + " ");
			System.out.print((int) Math.pow(i, 3));
			System.out.println();
			
		}
		
		sc.close();

	}

}
