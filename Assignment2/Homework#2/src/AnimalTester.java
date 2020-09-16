
public class AnimalTester extends Animal{

	public AnimalTester(String typeOfAnimal, String name, int age, String gender, String environment, String speed) {
		super(typeOfAnimal, name, age, gender, environment, speed);
	}

	public static void main(String[] args) {
		Animal dog = new Dog("Dog", "Fred", 7, "male", "home", "10 miles/hr");
		System.out.println(dog);
		((Dog) dog).bark();
		dog.eat();
		dog.sleep();
		((Domesticated) dog).walk();
		((Domesticated) dog).greetHuman();
		
		System.out.println("");
		
		Animal cat = new Cat("Cat", "Bailey", 3, "female", "home", "4 miles/hr");
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		((Domesticated) cat).walk();
		((Domesticated) cat).greetHuman();
		((Scratcher) cat).scratch();
		
		System.out.println("");
		
		Animal racoon = new Racoon("Racoon", "Shadow", 3, "male", "forest", "9 miles/hr");
		System.out.println(racoon);
		racoon.eat();
		racoon.sleep();
		((Racoon) racoon).walk();
		((Scratcher) racoon).scratch();
		
		System.out.println("");
		
		Animal whale = new Whale("Whale", "Blue", 15, "female", "ocean", "12 miles/hr");
		System.out.println(whale);
		whale.eat();
		whale.sleep();
		((Swimmer) whale).swim();
		
	}
}
