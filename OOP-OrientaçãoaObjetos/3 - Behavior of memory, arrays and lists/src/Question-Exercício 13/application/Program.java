package application;

import entities.Position;
import util.Positioner;

public class Program {

	public static void main(String[] args) {

		Position execute = new Position();
		
		execute.matrixStarter();
		
		for (int i = 0; i < execute.getMatrixNumbers().length; i++) {
			
			for (int j = 0; j < execute.getMatrixNumbers()[i].length; j++) {
				
				execute.setMatrixNumbers(i, j);
				
			}
			
		}
		
		Positioner.setPosition(execute.getMatrixNumbers());
		
	}

}
