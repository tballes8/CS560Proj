package person.beans;

import java.sql.SQLException;
import java.util.List;

import dao.CourseDAO;

public class Course {
	private int id;
	private String name;
	private int credits;
	private CourseDAO courseDAO = new CourseDAO();
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public boolean isValidCourse() {
		return name != null && credits != 0;
	}
	
	public void addCourse() throws SQLException {
	    courseDAO.addCourse(this);
	}
	
	public List<Course> getCourses() throws SQLException {
		  return courseDAO.getCourses();
		}
}
