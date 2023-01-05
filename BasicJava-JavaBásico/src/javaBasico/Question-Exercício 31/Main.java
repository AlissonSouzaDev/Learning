package javaBasico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			if (N >= 2 && N <= 1000) {
				
				int result = i * N;
				
				System.out.println(i + " x " + N + " = "+ result);
			}
		}
		
		sc.close();

	}

}
