
public class BusinessTest {

	public static void main(String[] args) {
		Executive ex1 = new Executive("Adam", "Lamb", null, 11111111, 2980000.9, 3000000.00);
		ex1.setFirstName("Adam");
		ex1.setLastName("Lamb");
		ex1.setAge(50);
		ex1.setID(11111111);
		ex1.introduce(false);
		ex1.setYearlyCompensation(2980000.9);
		ex1.setBonus(3000000.00);
		System.out.println("Total pay: $" + ex1.computePay());
		System.out.println(ex1.toString());
		
		Executive ex2 = new Executive("Bill", "Gates", null, 2764827, 999800.00, 100000.00);
		ex2.setFirstName("Bill");
		ex2.setLastName("Gates");
		ex2.setAge(64);
		ex2.setID(2764827);
		ex2.introduce(false);
		ex2.setYearlyCompensation(999800.00);
		ex2.setBonus(100000.00);
		System.out.println("Total pay: $" + ex2.computePay());
		System.out.println(ex2.toString());
		
		Customer c1 = new Customer("Joe", "Smith", null, 01234);
		c1.setAge(43);
		Address add = new Address(408, "Broadway St", "San Jose", "97333", " CA");
		c1.introduce();
		c1.setID(2174683);
		c1.setPayPreference("cash");
		System.out.println(add.getStreetNum() + " " + add.getStreetName() + " " + add.getCity() + " " 
				+ add.getZip() + " " + add.getState());
		c1.makePayment();
		System.out.print(c1.toString());

		System.out.println(" ");

		Customer c2 = new Customer("Jill", "Green", null, 01234);
		c2.setAge(51);
		Address ad = new Address(123, "Markeley St", "San Jose", "97333", " CA");
		c2.introduce();
		c2.setID(7365982);
		c2.setPayPreference("cash");
		System.out.println(ad.getStreetNum() + " " + ad.getStreetName() + " " + ad.getCity() + " " 
				+ ad.getZip() + " " + ad.getState());
		c2.makePayment();
		System.out.print(c2.toString());
		
		System.out.println("");
		
		FullTimeSalaried fts1 = new FullTimeSalaried("Millie", "Brown", null, 110000.00);
		fts1.setAge(28);
		Address a = new Address(822, "Broadway", "New York City", "97333", " NY");
		fts1.setFirstName("Millie");
		fts1.setLastName("Brown");
		fts1.setID(7190342);
		fts1.introduce(true);
		fts1.setBasePay(2173.80);
		System.out.println(a.getStreetNum() + " " + a.getStreetName() + " " + a.getCity() + " " 
				+ a.getZip() + " " + a.getState());
		System.out.println("Pay is: $" + fts1.computePay(52));
		
		System.out.println("");
		
		FullTimeSalaried fts2 = new FullTimeSalaried("Jane", "Stewart", null, 113000.00);
		fts2.setAge(28);
		Address aa = new Address(202, "5th St", "Brooklyn", "97333", " NY");
		fts2.setFirstName("Jane");
		fts2.setLastName("Stewart");
		fts2.setID(91901122);
		fts2.introduce(true);
		fts2.setBasePay(2197.50);
		System.out.println(aa.getStreetNum() + " " + aa.getStreetName() + " " + aa.getCity() + " " 
				+ aa.getZip() + " " + aa.getState());
		System.out.println("Pay is: $" + fts2.computePay(50));
		
		System.out.println("");
		
		FullTimeHourly p1 = new FullTimeHourly("Amy", "Smith", null, 3456987, 135.20, 75.28);
		Address aaa = new Address(100, "Meadow Lane", "Brooklyn", "97300", " NY");
		p1.setFirstName("Amy");
		p1.setLastName("Smith");
		p1.setAge(22);
		p1.setID(3456987);
		p1.setOvertimePay(75.20);
		p1.setBasePay(135.20);
		p1.introduce(true);
		System.out.println(aaa.getStreetNum() + " " + aaa.getStreetName() + " " + aaa.getCity() + " " 
				+ aaa.getZip() + " " + aaa.getState());
		System.out.println("Total pay: $" + p1.computePay(45));
		System.out.println(p1.toString());
		
		FullTimeHourly p2 = new FullTimeHourly("Dave", "Boe", null, 5628487, 175.20, 234.00);
		Address aaaa = new Address(700, "Meadow Lane", "Brooklyn", "97300", " NY");
		p2.setFirstName("Dave");
		p2.setLastName("Boe");
		p2.setAge(43);
		p2.setID(5628487);
		p2.setOvertimePay(234.00);
		p2.setBasePay(1175.20);
		p2.introduce(true);
		System.out.println(aaaa.getStreetNum() + " " + aaaa.getStreetName() + " " + aaaa.getCity() + " " 
				+ aaaa.getZip() + " " + aaaa.getState());
		System.out.println("Total pay: $" + p2.computePay(45));
		System.out.println(p2.toString());
		
		PartTimeHourly p3 = new PartTimeHourly("Bob","Newport", null, 1575.00);
		Address a1 = new Address(500, "Circle St", "San Jose", "97333", " CA");
		p3.setFirstName("Bob");
		p3.setLastName("Newport");
		p3.setAge(43);
		p3.setID(6347183);
		p3.setHourlyPay(35.00);
		p3.introduce(true);
		System.out.println(a1.getStreetNum() + " " + a1.getStreetName() + " " + a1.getCity() + " " 
				+ a1.getZip() + " " + a1.getState());
		System.out.println("Total pay: $" + p3.computePay(45));
		System.out.println(p3.toString());
		
		PartTimeHourly p4 = new PartTimeHourly("Molly","K", null, 1800.00);
		Address a2 = new Address(222, "West Ave.", "San Jose", "97333", " CA");
		p4.setFirstName("Molly");
		p4.setLastName("K");
		p4.setAge(36);
		p4.setID(2548143);
		p4.setHourlyPay(40.00);
		p4.introduce(true);
		System.out.println(a2.getStreetNum() + " " + a2.getStreetName() + " " + a2.getCity() + " " 
				+ a2.getZip() + " " + a2.getState());
		System.out.println("Total pay: $" + p4.computePay(45));
		System.out.println(p4.toString());
		
		Contractor p5 = new Contractor("Anne","Benson", null, 1125.00, 1998723);
		Address a3 = new Address(798, "Markeley Ln", "San Jose", "97333", " CA");
		p5.setFirstName("Anne");
		p5.setLastName("Benson");
		p5.setAge(26);
		p5.setID(1998723);
		p5.setBasePay(25.00);
		p5.introduce(true);
		System.out.println(a3.getStreetNum() + " " + a3.getStreetName() + " " + a3.getCity() + " " 
				+ a3.getZip() + " " + a3.getState());
		System.out.println("Total pay: $" + p5.computePay(45));
		System.out.println(p5.toString());
		
		Contractor p6 = new Contractor("Bill","Stevons", null, 1000.00, 7143963);
		Address a4 = new Address(888, "West Avenue", "San Jose", "97333", " CA");
		p6.setFirstName("Bill");
		p6.setLastName("Stevons");
		p6.setAge(53);
		p6.setID(7143963);
		p6.setBasePay(1000.00);
		p6.introduce(true);
		System.out.println(a4.getStreetNum() + " " + a4.getStreetName() + " " + a4.getCity() + " " 
				+ a4.getZip() + " " + a4.getState());
		System.out.println("Total pay: $" + p4.computePay(25));
		System.out.println(p4.toString());
		
	}

}