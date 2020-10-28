import java.util.*;
import java.util.LinkedList;

public class Student extends Course{

	public Student(String courseName, String courseDescrip, String dept, String time, String weekday) {
		super(courseName, courseDescrip, dept, time, weekday);
	}

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
		Course x = new Course(this.getCourseName(), this.getCourseDescription(), this.getDept(), this.getTime(), this.getWeekday());
		courses.add(x);
	}
	
	void removeCourse() {
		Course x = new Course(this.getCourseName(), this.getCourseDescription(), this.getDept(), this.getTime(), this.getWeekday());
		courses.remove(x);
	}
	
	void sortCourse(boolean x, String str) {
		if(str.equalsIgnoreCase("Course name")) 
		{
			courses.sort(new Comparator<Course>() 
			{
				@Override
				public int compare(Course c1, Course c2) 
				{
					return c1.getCourseName().compareTo(c2.getCourseName());
				}
			});
		}
		else if (str.equalsIgnoreCase("Course description")) {
			courses.sort(new Comparator<Course>() 
			{
				@Override
				public int compare(Course c1, Course c2) 
				{
					return c1.getCourseDescription().compareTo(c2.getCourseDescription());
				}
			});
		}
		else if (str.equalsIgnoreCase("Department")) {
			courses.sort(new Comparator<Course>() 
			{
				@Override
				public int compare(Course c1, Course c2) 
				{
					return c1.getDept().compareTo(c2.getDept());
				}
			});
		}
		else if (str.equalsIgnoreCase("Time")) {
			courses.sort(new Comparator<Course>() 
			{
				@Override
				public int compare(Course c1, Course c2) 
				{
					return c1.getTime().compareTo(c2.getTime());
				}
			});
		}
		else if (str.equalsIgnoreCase("Weekday")) {
			courses.sort(new Comparator<Course>() 
			{
				@Override
				public int compare(Course c1, Course c2) 
				{
					return c1.getWeekday().compareTo(c2.getWeekday());
				}
			});
		}
	}	
}
