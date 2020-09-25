public abstract class Employee extends Person {

	private int id;
	private String educationLevel;
	private boolean directDeposit;

	public Employee() {
		super(null, null, null);
	}

	public Employee(String firstName, String lastName, Address address, int id) {
		super(firstName, lastName, address);
		this.id = id;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getEducation() {
		return educationLevel;
	}

	public void setEducation(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public boolean isDirectDeposit() {
		return directDeposit;
	}

	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}

}
