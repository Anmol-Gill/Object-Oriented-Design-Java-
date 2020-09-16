
public class Animal {

	String typeOfAnimal;
	String name;
	int age;
	String gender;
	String environment;
	String speed;
	
	public Animal(String typeOfAnimal, String name, int age, String gender, String environment, String speed) {
		this.typeOfAnimal = typeOfAnimal;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.speed = speed;
	}
	
	public void setTypeOfAnimal(String typeOfAnimal)
	{
		this.typeOfAnimal = typeOfAnimal;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public void setEnvironment(String environment)
	{
		this.environment = environment;
	}
	
	public void setSpeed(String speed)
	{
		this.speed = speed;
	}
	
	public String getTypeOfAniaml()
	{
		return typeOfAnimal;
	}
	
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getEnvironment()
	{
		return environment;
	}
	
	public String getSpeed()
	{
		return speed;
	}
	
	public void move()
	{
		System.out.println("Generic animal movement");
	}
	
	public void sound()
	{
		System.out.println("Generic animal sound");
	}
	
	public void eat()
	{
		System.out.println("Generic aniaml eating");
	}
	
	public void sleep()
	{
		System.out.println("Generic animal sleeping");
	}
	
	//Override
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
        sb.append("Type of animal: ").append(this.typeOfAnimal).append("\n");
        sb.append("Name of animal: ").append(this.name).append("\n");
        sb.append("Animal age: ").append(this.age).append("\n");
        sb.append("Gender of animal: ").append(this.gender).append("\n");
        sb.append("Environment where it lives: ").append(this.environment).append("\n");
        sb.append("How fast it moves: ").append(this.speed).append("\n");
        return sb.toString();
		
	}
	
	public static void main(String[] args) {
		Animal a1 = new Animal ("mammal","dog", 13, "male", "mountains", "15 miles/hr");
		System.out.println(a1);
	}
}
