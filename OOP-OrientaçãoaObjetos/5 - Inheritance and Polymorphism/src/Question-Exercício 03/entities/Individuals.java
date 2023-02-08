package entities;

public class Individuals extends TaxPayer {

	private Double healthExpenditures;

	public Individuals() {

		super();

	}

	public Individuals(String name, Double anualIncome, Double healthExpenditures) {

		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;

	}

	public Double getHealthExpenditures() {

		return healthExpenditures;

	}

	public void setHealthExpenditures(Double healthExpenditures) {

		this.healthExpenditures = healthExpenditures;

	}

	@Override
	public Double tax() {
		
		return (getAnualIncome() < 20000.00) 
				? (getAnualIncome() * 0.15) - (healthExpenditures * 0.50) 
						: (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
		
	}

}
