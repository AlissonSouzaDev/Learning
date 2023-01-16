package entities;

public class Even {

	private int number;
	public int pairTotal = 0;

	public Even(int number) {
		
		this.number = number;
		
	}
	
	public Even() {
		
	}

	public int getNumber() {
		
		return number;
		
	}

	public void setNumber(int number) {
		
		this.number = number;
		
	}
	
	public void accumulator(int parameter) {
		
		if (parameter % 2 == 0) {
			
			System.out.print(parameter + " ");
			
			pairTotal++;
			
		}
		
	}
	
	public void skipEmptySpace() {
		
		System.out.println();
		System.out.println();
		
	}
	
}
