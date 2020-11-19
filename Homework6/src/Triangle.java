
public class Triangle extends Shape {

	private double length;
	
	public Triangle(double width) {
		super(width);
	}

	@Override
	public double computeArea() {
		return (getHeight() * getWidth()) / 2;
	}

	@Override

	public String toString() {
		return ("Triangle width: " + getWidth() + " triangle length: " + getLength());
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
}
