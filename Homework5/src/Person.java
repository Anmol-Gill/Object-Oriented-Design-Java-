import java.util.Comparator;
public class Person{
	private String firstN;
	private String lastN;
	private int age;
	
	public Person(String firstN, String lastN, int age) {
		this.firstN = firstN;
		this.lastN = lastN;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstN;
	}
	public void setFirstName(String firstN) {
		this.firstN = firstN;
	}
	public String getLastName() {
		return lastN;
	}
	public void setLastName(String lastN) {
		this.lastN = lastN;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	 public String toString(){
		return firstN+" "+lastN+", "+age;  
	}
	 
	public static Comparator<Person> FirstNComparator = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			String PersonName1 = p1.getFirstName().toUpperCase();
			String PersonName2 = p2.getFirstName().toUpperCase();
			return PersonName1.compareTo(PersonName2);
		}
	};
	
	public static Comparator<Person> FirstNComparatorDes = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			String PersonName1 = p1.getFirstName().toUpperCase();
			String PersonName2 = p2.getFirstName().toUpperCase();
			return PersonName2.compareTo(PersonName1);
		}
	};
	
	public static Comparator<Person> LastNComparator = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			String PersonName1 = p1.getLastName().toUpperCase();
			String PersonName2 = p2.getLastName().toUpperCase();
			return PersonName1.compareTo(PersonName2);
		}
	};
	
	public static Comparator<Person> LastNComparatorDes = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			String PersonName1 = p1.getLastName().toUpperCase();
			String PersonName2 = p2.getLastName().toUpperCase();
			return PersonName2.compareTo(PersonName1);
		}
	};
	
	public static Comparator<Person> AgeAscending = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			int agep1 = p1.getAge();
			int agep2 = p2.getAge();
			return agep1-agep2;
		}
	};
	
	public static Comparator<Person> AgeDescending = new Comparator<Person>() {
		public int compare(Person p1, Person p2) {
			int agep1 = p1.getAge();
			int agep2 = p2.getAge();
			return agep2-agep1;
		}
	};
}
