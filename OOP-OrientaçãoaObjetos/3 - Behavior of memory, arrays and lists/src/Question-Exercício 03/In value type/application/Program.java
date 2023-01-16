package application;

import java.util.Locale;
import java.util.Scanner;

import util.PersonData;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be typed?" + " ");
		int n = sc.nextInt();
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];

		for (int i = 0; i < height.length; i++) {
			
			System.out.println("Person data" + " "+ (i + 1) + ":");
			
			System.out.print("Name:" + " ");
			name[i] = sc.next();
			sc.nextLine();
			
			System.out.print("Age:" + " ");
			age[i] = sc.nextInt();
			
			System.out.print("Height:" + " ");
			height[i] = sc.nextDouble();
			
		}

		System.out.println();
		for (int i = 0; i < height.length; i++) {
			
			PersonData.sumHeight = PersonData.sum(PersonData.sumHeight, height[i]);
			
		}
		
		System.out.printf("Medium height: %.2f%n", PersonData.avg(PersonData.sumHeight, height.length));

		for (int i = 0; i < age.length; i++) {
			
			PersonData.increaser(age[i]);
			
		}

		System.out.printf("People under 16 years old: %.1f%%%n", PersonData.underAgeProb(age.length));

		for (int i = 0; i < age.length; i++) {
			
			PersonData.printAge(name[i], age[i]);
			
		}

		sc.close();

	}
	
}
