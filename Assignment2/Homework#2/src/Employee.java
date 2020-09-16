import java.util.Scanner;

public class Employee extends Person{

	private int employeeID;
	private String employeeStatus;
	private double payAmount;
	Scanner scan = new Scanner(System.in);
	
	public Employee () 
	{
		calculatePay();
		getPayAmount();
	}
	
	public void setEmployeeID(int employeeID)
	{
		this.employeeID= employeeID;
	}
	
	public void setEmployeeStatus(String employeeStatus)
	{
		this.employeeStatus = employeeStatus;
	}
	
	public void setPayAmount(double payAmount)
	{
		this.payAmount = payAmount;
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public String getEmployeeStatus()
	{
		return employeeStatus;
	}
	
	public double getPayAmount()
	{
		return payAmount;
	}
	
	public double calculatePay()
	{
		System.out.println("Type of employee: ");	
		employeeStatus = scan.next();
		int workHours;
		double rate;
		double salary;
		int weeks;
		if (employeeStatus == "part time" || employeeStatus == "contractor")
			{
				scan.next();
				System.out.println("hours of work: ");
				workHours = scan.nextInt();
				System.out.println("rate/hr: ");
				rate = scan.nextDouble(); 
				payAmount = workHours*rate;
			}
		else if (employeeStatus == "full time")
			{
				salary = scan.nextDouble();
				weeks = scan.nextInt();
				payAmount = (salary/52)*weeks;
			}
		return payAmount;
	}
}
