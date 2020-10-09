
public class Course implements Cloneable{

	private String name;
	private String des;
	private String dept;
	private String startTime;
	private String weekday;
	
	public Course(String name, String des, String dept, String startTime, String weekday) {
		this.name = name;
		this.des = des;
		this.dept = dept;
		this.startTime = startTime;
		this.weekday = weekday;
	}
	
	public Course(Course that) {
		this(that.getCourseName(), that.getDescription(), that.getDept(),that.getStartTime(), that.getWeekday());
		
	}

	public String getCourseName() {
		return name;
	}

	public void setCourseName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return des;
	}

	public void setDescription(String des) {
		this.des = des;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	
	@Override
	public Object clone() {
	    try {
	        return (Course) super.clone();
	    } catch (CloneNotSupportedException e) {
	        return new Course(this.getCourseName(), this.getDescription(), this.getDept(),
	        		this.getStartTime(), this.getWeekday());
	    }
	}

}
