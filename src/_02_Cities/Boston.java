package _02_Cities;

public class Boston extends City {
	int pop;
	double growth;

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		
		pop = population;
		growth = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		return (pop * growth) + pop * 0.5;
	}

}
