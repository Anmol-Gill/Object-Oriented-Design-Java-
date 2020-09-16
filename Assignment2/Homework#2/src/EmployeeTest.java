

public class EmployeeTest extends Employee{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();

		e1.setFirstName("Joe");
		e1.setLastName("Smith");
		e1.setEmployeeStatus("contractors");
		e1.setPayAmount(100000);
		
		System.out.println(e1.getName() + ", is " + e1.getEmployeeStatus() + ", pay is $" + e1.getPayAmount()
		+ ", should get paid or working ");
		
	}
}
