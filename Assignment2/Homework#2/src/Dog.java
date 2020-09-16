
public class Dog extends Animal implements Domesticated{

	public Dog(String typeOfAnimal, String name, int age, String gender, String environment, String speed) 
	{
		super(typeOfAnimal, name, age, gender, environment, speed);
	}
	
	public void walk() 
	{
		System.out.println(name + " is walking");
	}
	
	public void greetHuman() 
	{
		System.out.println(name + " greets human");
	}
	
	public void bark() 
	{
		System.out.println(name+ " is barking");
	}
	
}
