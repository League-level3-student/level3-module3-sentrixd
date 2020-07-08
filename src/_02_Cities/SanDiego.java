package _02_Cities;

public class SanDiego extends City{
	int pop;
	double growth;
	
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		
		pop = population;
		growth = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		return pop * growth + 1000000;
	}
}
