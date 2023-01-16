package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Height;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be typed?" + " ");
		int n = sc.nextInt();
		Height[] name = new Height[n];
		Height[] age = new Height[n];
		Height[] height = new Height[n];
		Height functions = new Height();

		for (int i = 0; i < name.length; i++) {
			
			System.out.println("Person data" + " "+ (i + 1) + ":");
			System.out.print("Name:" + " ");
			name[i] = new Height(sc.next());
			sc.nextLine();
			
			System.out.print("Age:" + " ");
			age[i] = new Height(sc.nextInt());
			
			System.out.print("Height:" + " ");
			height[i] = new Height(sc.nextDouble());
		
		}
		
		System.out.println();
		for (int i = 0; i < height.length; i++) {
			
			functions.sumHeight = functions.sum(functions.sumHeight, height[i].getHeight());
			
		}
		
		System.out.printf("Medium height: %.2f%n", functions.avg(functions.sumHeight, height.length));

		for (int i = 0; i < age.length; i++) {
			
			functions.increaser(age[i].getAge());
			
		}
		
		System.out.printf("People under 16 years old: %.1f%%%n", functions.underAgeProb(age.length));

		for (int i = 0; i < age.length; i++) {
			
			functions.printAge(name[i].getName(), age[i].getAge());
			
		}
		
		sc.close();

	}

}
