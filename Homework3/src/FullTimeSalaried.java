public class FullTimeSalaried extends FullTimeEmployee {

	public FullTimeSalaried() {
		super();
	}

	public FullTimeSalaried(String firstName, String lastName, Address add, double salary) {
		super();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Salary: ").append(this.computePay(0)).append("\n");
		return sb.toString();
	}

	public void introduce(boolean displaySSN) {
		displaySSN = true;
	}

	public double computePay(int numWeeks) {
		double x = numWeeks * getBasePay();
		return x;
	}

}
