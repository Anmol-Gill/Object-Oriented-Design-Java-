

public class EmployeeTest extends Employee{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(13784, "contractor", 60);
		Person p1 = new Person("Joe", "Smith", 25, "123-45-6789", "221 Baker St", "male", (float) 120.803);
		e1.setEmployeeStatus("contractor");
		e1.setWorkHours(30);
		e1.setRate(60);
		p1.introduce();
		System.out.println(p1.getName() + ", a " + e1.getEmployeeStatus() + " , pay is $" + e1.getRate()
		+ "/hr, should get paid or working "+ e1.getWorkHours() + " hours");
		
		System.out.println("");
		
		Employee e2 = new Employee(34567, "full time", 60);
		Person p2 = new Person("Lisa", "Gray", 20, "123-45-9989", "209 Baker St", "female", (float) 99.803);
		e2.setEmployeeStatus("full time");
		e2.setSalary(110000);
		e2.setWeeks(2);
		p2.introduce();
		System.out.println(p2.getName() + ", a " + e2.getEmployeeStatus() + "employee , pay is $" + e2.getSalary()
		+ "/yr, should get paid or working "+ e2.getWeeks() + " weeks"); 
		
		System.out.println("");
		
		Employee e3 = new Employee(34567, "full time", 60);
		Person p3 = new Person("Timothy", "Briggs", 37, "123-45-9000", "200 Baker St", "male", (float) 199.2);
		e3.setEmployeeStatus("full time");
		e3.setSalary(80000);
		e3.setWeeks(4);
		p3.introduce();
		System.out.println(p3.getName() + ", a " + e3.getEmployeeStatus() + "employee , pay is $" + e3.getSalary()
		+ "/yr, should get paid or working "+ e3.getWeeks() + " weeks"); 
		
		System.out.println("");
		
		Employee e4 = new Employee(13784, "part time", 60);
		Person p4 = new Person("George", "Wallace", 54, "111-22-3333", "101 Bart St", "male", (float) 184.2);
		e4.setEmployeeStatus("part time");
		e4.setWorkHours(25);
		e4.setRate(20);
		p4.introduce();
		System.out.println(p4.getName() + ", a " + e4.getEmployeeStatus() + " employee , pay is $" + e4.getRate()
		+ "/hr, should get paid or working "+ e4.getWorkHours() + " hours");
		
		System.out.println("");
		
		Employee e5 = new Employee(13784, "contractor", 60);
		Person p5 = new Person("Amy", "Student", 19, "111-22-6789", "221 Bart St", "female", (float) 113.2);
		e5.setEmployeeStatus("contractor");
		e5.setWorkHours(45);
		e5.setRate(45);
		p5.introduce();
		System.out.println(p5.getName() + ", a " + e5.getEmployeeStatus() + " employee , pay is $" + e5.getRate()
		+ "/hr, should get paid or working "+ e5.getWorkHours() + " hours");		
	}
}
