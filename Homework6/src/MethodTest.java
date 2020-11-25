import java.util.ArrayList;
import java.util.List;

public class MethodTest {

	public static <T> int Count(List<T> list) {
		return list.size();
    }
    
	public static void main(String[] args) {

	    ArrayList<String> stringList = new ArrayList<>();
	    ArrayList<Integer> integerList = new ArrayList<>();
	    ArrayList<Double> doubleList = new ArrayList<>();

	    stringList.add("Hello");
	    stringList.add("this");
	    stringList.add("is");
	    stringList.add("the");
	    stringList.add("example");

	    integerList.add(4);
	    integerList.add(3);
	    integerList.add(9);
	    integerList.add(1);
	    integerList.add(2);
	    integerList.add(5);

	    doubleList.add(1.6);
	    doubleList.add(3.0);
	    doubleList.add(1.5);
	    doubleList.add(4.5);
	    doubleList.add(2.6);
	    doubleList.add(1.3);
	    doubleList.add(9.5);
	    doubleList.add(32.1);
	    
	    System.out.println("String List Count: " + Count(stringList));
	    System.out.println("Integer List Count: " + Count(integerList));
	    System.out.println("Double List Count: " + Count(doubleList));

	}
}
