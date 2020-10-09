import java.util.Scanner;

public class Employee {

	private String firstN;
	private String lastN;
	private String employeeID;
	private double hourlyPay;

	public Employee(){
		
	}
	
	public void computePay() throws NumberFormatException{
		Scanner scan = new Scanner(System.in);
		int hours = scan.nextInt();
		double pay = 0;
		try {
			if (hours < 0) {
				System.out.println("Input is invalid.");
			}
			else if (hours > 40){
				System.out.println("Invalid number. Must be less than 40");
			}
			else {
				pay = hours*hourlyPay;
				System.out.println("Pay is: " + pay);
			}
			
		} catch (NumberFormatException e){
			System.out.println("Input is invalid.");
		}
	}
	
	public String getFirstName() {
		return firstN;
	}

	public void setFirstName(String firstN) {
		this.firstN = firstN;
	}

	public String getLastName() {
		return lastN;
	}

	public void setLastName(String lastN) {
		this.lastN = lastN;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
}

