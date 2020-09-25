public class Executive extends Employee {

	private double yearlyBonus;
	private double yearlyCompensation;

	public Executive() {
		super();
	}

	public Executive(String firstName, String lastName, Address address, int id, double pay, double bonus) {
		super();
	}

	public double getBonus() {
		return yearlyBonus;
	}

	public void setBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	public double getYearlyCompensation() {
		return yearlyCompensation;
	}

	public void setYearlyCompensation(double yearlyCompensation) {
		this.yearlyCompensation = yearlyCompensation;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Yearly compensation: ").append(this.yearlyCompensation).append("\n");
		sb.append("Yearly bonus: ").append(this.yearlyBonus).append("\n");
		return sb.toString();
	}

	public void introduce(boolean displaySSN) {
		displaySSN = true;
	}

	public double computerPay() {
		return yearlyBonus + yearlyCompensation;
	}
}
