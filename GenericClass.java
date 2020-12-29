package week4;


	class AnimalHouse<E> {

	    private E animal;

	    void setAnimal(E animal) {
	        this.animal = animal;
	    }

	    E getAnimal() {
	        return this.animal;
	    }

	    void printAnimal() {
	        System.out.println(this.animal);
	    }
	}

	class Animal{

	    @Override
	    public String toString() {
	        return "I am an Animal";
	    }
	}

	class Cat extends Animal {

	    @Override
	    public String toString() {
	        return "I am a Cat";
	    }
	}

	class Dog extends Animal {

	    @Override
	    public String toString() {
	        return "I am a Dog";
	    }
	}

	public class GenericClass {

	    public static void main(String[] args) {

	        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
	        AnimalHouse<Dog> dogHouse = new AnimalHouse<>();

	        catHouse.setAnimal(new Cat());
	        dogHouse.setAnimal(new Dog());

	        catHouse.printAnimal();
	        dogHouse.printAnimal();
	    }
	}


