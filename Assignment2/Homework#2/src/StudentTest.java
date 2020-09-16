
public class StudentTest extends Student {
	
	public static void main(String[] args) {

		Student student1 = new Student();
		Student.Course print =  student1.new Course();
		
		student1.setFirstName("John");
		student1.setLastName("Smith");
		student1.setAge(20);
		student1.setGPA((float) 3.6);
		student1.setMajor("Computer Science");
		student1.setDept("School of Computer Science");

		System.out.println(student1.getName() + ", " + student1.getAge() + 
				" years old, " + student1.getGPA() + " gpa, " + student1.getMajor()
				+ " major, " + student1.getDept() + " department.");
		
		print.printSchedule();
	}
}
