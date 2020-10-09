
public class StudentTest {

	public static void main(String[] args) {
		Course a = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");
		Student s = new Student("John", "Smith", 20, 
				(float) 3.6, "Computer Science Major", "School of Computer Science department", a);
		s.printInfo();
		s.setCourse(a);
		a.setCourseName("CS151");
		a.setDescription("Object Oriented Design and Programming");
		a.setDept("CS");
		a.setStartTime("6:00pm");
		a.setWeekday("Tue");
		System.out.println(a.getCourseName() + "," + a.getDescription() +", " + a.getDept() + ", " +
		a.getStartTime() + ", " + a.getWeekday());
	
		System.out.println("");
		System.out.println("Deep copy: ");
		
		Student s2 = (Student) s.clone();
		s2.printInfo();
		Course a2 = (Course) a.clone();
		System.out.println(a2.getCourseName() + "," + a2.getDescription() +", " + a2.getDept() + ", " +
				a2.getStartTime() + ", " + a2.getWeekday());
		
	}

}