
public class Student implements Cloneable{
	
	private String firstN;
	private String lastN;
	private int age;
	private float gpa;
	private String major;
	private String dept;
	private Course course;
	
	public Student(Student that) {
		this(that.getFirstName(),that.getLastName(),that.getAge(), that.getGPA(),that.getMajor(),
				that.getDept(), new Course(that.getCourse()));
	}
	
	public Student (String firstN, String lastN, int age, float gpa, String major, String dept, Course course) {
		this.firstN = firstN;
		this.lastN = lastN;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.dept = dept;
		this.course = course;
	}
	
	@Override
	public Object clone() {
	    Student user = null;
	    try {
	        user = (Student) super.clone();
	    } catch (CloneNotSupportedException e) {
	        user = new Student(
	          this.getFirstName(), this.getLastName(), this.getAge(), this.getGPA(),
	          this.getMajor(), this.getDept(),this.getCourse());
	    }
	    user.course = (Course) this.course.clone();
	    return user;
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

	public float getGPA() {
		return gpa;
	}

	public void setGPA(float gpa) {
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void printInfo() {
		System.out.println(this.getFirstName() + " " + this.getLastName() + ", " +
	    this.getAge() + "years old, " + this.getMajor() + ", " + this.getDept());
	}
}
