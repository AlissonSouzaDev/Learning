package entities;

public class Height {

	private String name;
	private int age;
	private double height;
	
	public final int ageLimit = 16;
	public double sumHeight = 0.0;
	public int underAge = 0;

	public Height(String name) {
		
		this.name = name;
		
	}

	public Height(int age) {
		
		this.age = age;
		
	}

	public Height(double height) {
		
		this.height = height;
		
	}
	
	public Height() {
		
	}

	public String getName() {
		
		return name;
		
	}

	public void setName(String name) {
		
		this.name = name;
				
	}

	public int getAge() {
		
		return age;
		
	}

	public void setAge(int age) {
		
		this.age = age;
		
	}

	public double getHeight() {
		
		return height;
		
	}
	

	public void setHeight(double height) {
		
		this.height = height;
		
	}
	
	public double sum(double sum, double value) {
		
		return sum + value;
		
	}

	public double avg(double sum, double value) {
		
		return sum / value;
				
	}
	
	public void increaser(int parameter) {	
		
		if (parameter < ageLimit) {
			
			underAge++;
			
		} 
		
	}

	public double underAgeProb(double parameterA) {
		
		double parameterB = 0;
		
		if (underAge > 0) {
			
			parameterB = (underAge / parameterA) * 100;
			
		}
		
		return parameterB;
		
	}
	
	public void printAge(String parameterA, int parameterB) {
		
		if (parameterB < 16) {
			
			System.out.println(parameterA);
			
		}
		
	}
	
}
