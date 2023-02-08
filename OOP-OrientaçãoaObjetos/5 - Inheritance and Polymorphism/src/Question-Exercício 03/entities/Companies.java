package entities;

public class Companies extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Companies() {
		
		super();
		
	}
	
	public Companies(String name, Double anualIncome, Integer numberOfEmployees) {
		
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
		
	}

	public Integer getNumberOfEmployees() {
		
		return numberOfEmployees;
		
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		
		this.numberOfEmployees = numberOfEmployees;
		
	}

	@Override
	public Double tax() {
		
		return (numberOfEmployees < 10) 
				? getAnualIncome() * 0.16 
						: getAnualIncome() * 0.14;	
		
	}

}
