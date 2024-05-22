package entities;

public class Individual extends Tax {
	private Double healthExpenditures;

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxCalculation() {
		double tax = 0.00;
		if (20000.00 >= anualIncome) {
			tax = 0.15;
		} else if (2000 < anualIncome) {
			tax = 0.25;
		}
		double healthTax = 0.00;
		if (healthExpenditures > 0) {
			healthTax = 0.50;
		}

		return (anualIncome * tax) - (healthExpenditures * healthTax);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + ": $ " + String.format("%.2f", taxCalculation()) + "\n");
		return sb.toString();
	}

}
