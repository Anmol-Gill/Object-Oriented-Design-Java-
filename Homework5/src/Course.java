
public class Course {
	private String courseName;
	private String courseDescrip;
	private String dept;
	private String time;
	private String weekday;
	
	public Course(String courseName, String courseDescrip, String dept, String time, String weekday) {
		this.courseName = courseName;
		this.courseDescrip = courseDescrip;
		this.dept = dept;
		this.time = time;
		this.weekday = weekday;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescrip;
	}
	public void setCourseDescription(String courseDescrip) {
		this.courseDescrip = courseDescrip;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	
	
}
