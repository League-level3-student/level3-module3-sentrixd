package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Cow());
		animals.add(new Cow());
		animals.add(new Pig());
		animals.add(new Chicken());
		animals.add(new Sheep());
		animals.add(new Sheep());
		
		for (int i = 0; i < animals.size(); i++) {
			animals.get(i).makeNoise();
		}
	}

}
