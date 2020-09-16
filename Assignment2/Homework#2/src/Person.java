import java.util.Scanner;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String socialSN;
	private String address;
	private String gender;
	private float weight;
	Scanner scan = new Scanner(System.in);
	
	public Person(String firstName, String lastName, int age, String socialSN, String address, String gender, float weight) 
	{	
		//introduce():
		this.firstName = firstName;	
		this.lastName = lastName;	
		this.age=age;
		this.socialSN = socialSN;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;	
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;	
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setSocialSN(String socialSN)
	{
		this.socialSN = socialSN;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public void setWeight(float weight)
	{
		this.weight = weight;
	}
	
	public String getName() 
	{
		return firstName + " " + lastName;	
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public String getSocialSN()
	{
		return socialSN;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public float getWeight()
	{
		return weight;
	}
	
	@Override
    public String toString() 
    { 
	StringBuilder sb = new StringBuilder();
        sb.append("First name : ").append(this.firstName).append("\n");
        sb.append("Last name : ").append(this.lastName).append("\n");
        sb.append("Age : ").append(this.age).append("\n");
        sb.append("Social Security Number : ").append(this.socialSN).append("\n");
        sb.append("Address : ").append(this.address).append("\n");
        sb.append("Gender : ").append(this.gender).append("\n");
        sb.append("Weight : ").append(this.weight).append("\n");
        return sb.toString();
    } 
	
	void introduce()
	{
		System.out.println(getName() + ", " + getAge() + " years old, SNN: " + getSocialSN()
		+ ", Address: " + getAddress() + ", Gender: " + getGender() + ", Weight: " + getWeight());
	}
}

