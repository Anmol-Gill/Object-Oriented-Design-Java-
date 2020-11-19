
public class Hexagon extends Shape {

	public Hexagon(double width) {
		super(width);
	}

	@Override
	public double computeArea() {
		return (3 * Math.sqrt(3) * Math.pow(getWidth(), 2) / 2);
	}

	@Override
	public String toString() {
		return ("Hexagon side width: " + getWidth());
	}

}
