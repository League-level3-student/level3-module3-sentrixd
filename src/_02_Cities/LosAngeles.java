package _02_Cities;

public class LosAngeles extends City{
	int pop;
	double growth;

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		
		pop = population;
		growth = growthRate;
	}

	@Override
	double getAnnualTaxes() {
		return pop * growth * (growth / 2);
	}
	
}
