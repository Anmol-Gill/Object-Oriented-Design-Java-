
public class BusinessTest {

	public static void main(String[] args) {
		Customer c1 = new Customer("Joe", "Smith", null, 01234);
		c1.setAge(43);
		c1.setAddress(12, "4th St", "San Jose", "97333", " CA");
		c1.introduce();
		c1.makePayment();
		c1.setID(2174683);
		c1.setPayPreference("check");
		System.out.print(c1.toString());

		System.out.println(" ");

		Customer c2 = new Customer("Jill", "Green", null, 01234);
		c2.setAge(51);
		c2.setAddress(123, "Markeley St", "San Jose", "97333", " CA");
		c2.introduce();
		c2.makePayment();
		c2.setID(7365982);
		c2.setPayPreference("cash");
		System.out.print(c2.toString());
	}

}