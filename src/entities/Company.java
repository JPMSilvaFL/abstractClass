package entities;

public class Company extends Tax {

	private Double numberEmployes;

	public Company(String name, Double anualIncome, Double numberEmployes) {
		super(name, anualIncome);
		this.numberEmployes = numberEmployes;
	}

	@Override
	public Double taxCalculation() {
		double tax = 0.00;
		if (numberEmployes < 10) {
			tax = 0.16;
		} else if (numberEmployes > 10) {
			tax = 0.14;
		}
		return anualIncome * tax;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + ": $ " + String.format("%.2f", taxCalculation()) + "\n");
		return sb.toString();
	}

}
