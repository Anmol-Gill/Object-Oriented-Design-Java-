import java.util.Scanner;

public class Employee extends Person{

	private int employeeID;
	private String employeeStatus;
	private int payAmount;
	Scanner scan = new Scanner(System.in);
	private int workHours;
	private int rate;
	private int salary;
	private int weeks;
	
	public Employee (int employeeID, String employeeStatus, double payAmount) 
	{
		super("", "", 0, "", "", "", 0);
	}
	
	public void setEmployeeID(int employeeID)
	{
		this.employeeID= employeeID;
	}
	
	public void setEmployeeStatus(String employeeStatus)
	{
		this.employeeStatus = employeeStatus;
	}
	
	public void setPayAmount(int payAmount)
	{
		this.payAmount = payAmount;
	}
	
	public void setWorkHours(int workHours)
	{
		this.workHours = workHours;
	}
	
	public void setRate(int rate)
	{
		this.rate = rate;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public void setWeeks(int weeks)
	{
		this.weeks = weeks;
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public String getEmployeeStatus()
	{
		return employeeStatus;
	}
	
	public int getPayAmount()
	{
		return payAmount;
	}
	
	public int getWorkHours()
	{
		return workHours;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public int getWeeks()
	{
		return weeks;
	}
	
	public double calculatePay(int salary, int weeks)
	{
		System.out.println("Type of employee: ");	
		employeeStatus = scan.next();
		int workHours= 0;
		int rate = 0;
		if (employeeStatus == "part time" || employeeStatus == "contractor")
			{
				partTime(workHours, rate);
			}
		else if (employeeStatus == "full time")
			{
				fullTime(salary, weeks);
			}
		return payAmount;
	}
	
	void partTime(int workHours, int rate)
	{
		payAmount = (workHours*rate);
	}
	
	void fullTime(int salary, int weeks)
	{
		payAmount = ((salary/52)*weeks);
	}
}
