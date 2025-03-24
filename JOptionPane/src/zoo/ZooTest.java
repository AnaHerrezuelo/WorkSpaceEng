package zoo;

public class ZooTest {
	public static void main(String[] args) {
		Zoo zoo= new Zoo();
		zoo.addAnimal(new Animal("animal", 34));
		zoo.addAnimal(new Birds("bird", 14, true));
		zoo.addAnimal(new Mammals("Mammal", 56, "omnivore"));
		zoo.displayAllAnimal();
	}

}
