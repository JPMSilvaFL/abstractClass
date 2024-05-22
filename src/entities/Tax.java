package entities;

public abstract class Tax {
	protected String name;
	protected Double anualIncome;

	public Tax(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Double taxCalculation();

	public abstract String toString();
}
