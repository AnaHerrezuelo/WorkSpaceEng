package zoo;

import java.util.ArrayList;

public class Zoo {
	ArrayList <Animal> animalList = new ArrayList <Animal>();
	
	public void addAnimal(Animal animal) {
		animalList.add(animal);
//		animal.add(new Birds("aaa", 34, true));
//		animal.add(new Mammals("aaa", 34, "carnivore"));
		
	}
	
	public void displayAllAnimal() {
		for (Animal animal2 : animalList) {
			System.out.println(animal2.toString());
		}
	}
	
	public void displayBirds() {
		for (Animal animal2 : animalList) {
			System.out.println(animal2.toString());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
