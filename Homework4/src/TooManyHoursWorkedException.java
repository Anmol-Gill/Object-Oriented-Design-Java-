public class TooManyHoursWorkedException extends Exception {
	public TooManyHoursWorkedException() {
		super("Invalid number.");
	}
	
	public TooManyHoursWorkedException (String message) {
		super(message);
	}
}