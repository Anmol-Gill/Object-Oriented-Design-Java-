
public class Racoon extends Animal implements Scratcher{

	public Racoon(String typeOfAnimal, String name, int age, String gender, String environment, String speed) 
	{
		super(typeOfAnimal, name, age, gender, environment, speed);
	}
	
	public void walk()
	{
		System.out.println(name + " is walking");
	}
	@Override
	public void scratch()
	{
		System.out.println(name + " scratches");
	}
}
