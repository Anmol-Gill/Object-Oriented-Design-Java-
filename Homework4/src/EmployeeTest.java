
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setFirstName("Bob");
		e1.setLastName("Hawks");
		e1.setEmployeeID("35826422");
		e1.setHourlyPay(25.50);
		System.out.println("Name: " + e1.getFirstName() + " " + e1.getLastName());
		System.out.println("Employee ID: " + e1.getEmployeeID());
		System.out.println("Hourly pay: $" + e1.getHourlyPay() + "/hr");
		//I used scanner input to put in the hours worked into the computePay() method
		e1.computePay(); 				
		e1.computePay();
		e1.computePay();
		e1.computePay();
		e1.computePay();
		e1.computePay();

	}

}
