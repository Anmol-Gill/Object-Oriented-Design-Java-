import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		Shapes s = new Shapes();

	    s.add(new Hexagon(9.0));
	    s.add(new Hexagon(3.0));
	    s.add(new Circle(5.5));
	    s.add(new Circle(10));
	    s.add(new Triangle(2));
	    s.add(new Triangle(4));
	    s.add(new Rectangle(5, 4));
	    s.add(new Rectangle(7, 2));

	    s.compute();
	    
	    ArrayList<Shape> shapeList = s.getList();
	    for (int i = 0; i < shapeList.size(); i++) {
	        try {
	          //create the file and the name example: obj1.ser", "obj2.ser", "obj3.ser"
	          FileOutputStream fout = new FileOutputStream("obj" + (i + 1) + ".ser");
	          //set the ObjectOuputStream
	          ObjectOutputStream oos = new ObjectOutputStream(fout);
	          //write in the file
	          oos.writeObject(shapeList.get(i));
	          //close the file
	          fout.close();
	        } catch (IOException e) {

	        }
	    }
	}

}
