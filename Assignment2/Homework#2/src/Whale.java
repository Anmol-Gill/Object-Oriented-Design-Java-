
public class Whale extends Animal implements Swimmer{

	public Whale(String typeOfAnimal, String name, int age, String gender, String environment, String speed) 
	{
		super(typeOfAnimal, name, age, gender, environment, speed);
	}

	@Override
	public void swim() {
		System.out.println(name + " swims");
	}

}
