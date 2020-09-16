
public class Cat extends Animal implements Domesticated, Scratcher{

	public Cat(String typeOfAnimal, String name, int age, String gender, String environment, String speed) 
	{
		super(typeOfAnimal, name, age, gender, environment, speed);
	}
	
	public void walk()
	{
		System.out.println(name + " is walking");
	}
	
	public void greetHuman()
	{
		System.out.println(name + " is greeting human");
	}
	
	public void scratch()
	{
		System.out.println(name + " cratches");
	}

}
