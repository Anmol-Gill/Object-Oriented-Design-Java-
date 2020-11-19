import java.util.ArrayList;

public class Shapes<T extends Shape> {
	private ArrayList<T> shapeList;

	public Shapes() {
		shapeList = new ArrayList<>();
	}

	public void add(T shape) {
		shapeList.add((T) shape);
	}

	public void remove(T shape) {
		shapeList.remove((T) shape);
	}

	public Shapes(ArrayList<Shape> shapeList) {
		this.shapeList = (ArrayList<T>) shapeList;
	}
	
	public ArrayList<T> getList(){
		return shapeList;
	}

	public void setShapeList(ArrayList<T> shapeList) {
	    this.shapeList = shapeList;
	  }

	public void compute() {
		System.out.println("Shape List:");
		for (Shape shape : shapeList) {
			shape.start();
		}
	}
}
