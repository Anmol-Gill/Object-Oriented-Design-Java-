import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PersonTest extends Person{

	public PersonTest(String firstN, String lastN, int age) {
		super(firstN, lastN, age);
	}

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("Joe","Smith", 40));
		list.add(new Person("Amy","Gold", 32));
		list.add(new Person("Tony","Stork", 21));
		list.add(new Person("Sean","Irish", 24));
		list.add(new Person("Tina","Brock", 28));
		list.add(new Person("Lenny","Hep", 18));
		
		
		System.out.println("Ascending by age: ");
		Collections.sort(list, Person.AgeAscending);
		for(Person str: list){
			System.out.println(str);
	    }
		System.out.println("");
		System.out.println("Descending by age: ");
		Collections.sort(list, Person.AgeDescending);
		for(Person str: list){
			System.out.println(str);
	    }
		System.out.println("");
		
		System.out.println("Ascending by first name: ");
		Collections.sort(list, Person.FirstNComparator);
		for(Person str: list){
			System.out.println(str);
	   }
		System.out.println("");
		System.out.println("Descending by first name: ");
		Collections.sort(list, Person.FirstNComparatorDes);
		for(Person a: list){
			System.out.println(a);
	   }
		System.out.println("");
		
		System.out.println("Ascending by last name: ");
		Collections.sort(list, Person.LastNComparator);
		for(Person str: list){
			System.out.println(str);
	    }
		System.out.println("");
		System.out.println("Descending by last name: ");
		Collections.sort(list, Person.LastNComparatorDes);
		for(Person str: list){
			System.out.println(str);
	    }
	}
}
