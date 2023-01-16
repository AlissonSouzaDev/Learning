package entities;

public class SumVect {
	
	private double number, sum, avg;

	public SumVect(double number) {
		
		this.number = number;
		
	}	

	public SumVect() {
		
	}

	public double getNumber() {
		
		return number;
		
	}

	public void setNumber(double number) {
		
		this.number = number;
		
	}

	public double getSum() {
		
		return sum;
		
	}

	public double getAvg() {
		
		return avg;
		
	}
	
	public void add(double value) {
		
		sum += value;
		
	}
	
	public double avg(double value) {
		
		return sum / value;
		
	}
	
}
