
public class Rectangle extends Shape{

	private double length;
	
	public Rectangle(double width, double length) {
		super(width);
		this.setLength(length);
	}

	@Override
	public double computeArea() {
		return getHeight() * getWidth();
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public String toString() {
	    return ("Rectangle width: " + getWidth() + " and length: " + getLength());
	}

}
