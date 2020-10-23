import java.util.Comparator;
import java.util.LinkedList;
public class Student{


	private String firstN;
	private String lastN;
	private int age;
	private float gpa;
	private String major;
	private String dept;
	private LinkedList<Course> courses;
	
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
	public LinkedList<Course> getCourses() {
		return courses;
	}
	public void setCourses(LinkedList<Course> courses) {
		this.courses = courses;
	}
	
	void addCourse(){
		
	}
	
	private String getCourseName() {
		// TODO Auto-generated method stub
		return null;
	}
	void removeCourse() {
		
	}
	
	void sortCourse() {
		
	}
	
	
}
