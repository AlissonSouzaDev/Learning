package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

	public Scanner sc = new Scanner(System.in);
	private List<Integer> id = new ArrayList<>();
	
	private int n;
	private String[] vectName;
	private double[] vectSalary;
	

	public Employee() {
		
	}


	public List<Integer> getId() {
		
		return id;
		
	}


	public void setId(int parameterA) {
		
		id.add(sc.nextInt());

	}

	public String[] getVectName() {
		
		return vectName;
		
	}


	public void setVectName(int parameter) {
		
		sc.nextLine();
		vectName[parameter] = sc.nextLine();
		
	}


	public double[] getVectSalary() {
		
		return vectSalary;
		
	}


	public void setVectSalary(int parameter) {
		
		vectSalary[parameter] = sc.nextDouble();
		System.out.println();
		
	}
	
	public void vectStarter() {
		
		n = sc.nextInt();
		vectName = new String[n];
		vectSalary = new double[n];
		System.out.println();
		
	}

	public String toString(int parameter) {
		
		return id.get(parameter)
				+ ", "
				+ vectName[parameter]
				+ ", " 
				+ String.format("%.2f", vectSalary[parameter]);
		
	}
	
}
