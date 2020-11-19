import java.io.Serializable;

public abstract class Shape extends Thread implements Serializable {
	private double height;
	private double width;
	
	public Shape(double width) {
		setWidth(width);
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public abstract double computeArea();
}
