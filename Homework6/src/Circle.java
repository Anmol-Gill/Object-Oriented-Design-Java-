
public class Circle extends Shape{

	public Circle(double width) {
		super(width);
	}

	@Override
	public double computeArea() {
		return Math.PI * Math.pow(getWidth(), 2);
	}

	@Override

	public String toString() {
	    return ("Radius of Circle: " + getWidth());
	}
	
}
