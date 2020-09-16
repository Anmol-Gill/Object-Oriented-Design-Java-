
public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String dept;

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
		this.age = age;	
	}
	
	public void setGPA(float gpa) 
	{
		this.gpa = gpa;	
	}
	
	public void setMajor(String major) 
	{
		this.major = major;	
	}
	
	public void setDept(String dept) 
	{
		this.dept = dept;	
	}
	
	public String getName() 
	{
		return firstName + " " + lastName;	
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public float getGPA()
	{
		return gpa;
	}
	
	public String getMajor() 
	{
		return major;	
	}
	
	public String getDept() 
	{
		return dept;	
	}
	
	public class Course
	{
		void printSchedule()
		{
			System.out.println("CS151 Tue/Thur 6-7:15");
			System.out.println("Eng101 Mon/Wed 10-11:15");
			System.out.println("Hist100 Tue/Thur 1:30-2:24");
		}
	}
}
