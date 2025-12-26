import java.util.*;

public class Lecturer extends Researcher {

	private Map<UUID, Course> courses = new HashMap<UUID, Course>();

	public List<Course> getCourses() {
		return new ArrayList<Course>(courses.values());
	}

	/**
	 * 
	 * @param course
	 */
	public void addCourse(Course course) {
		this.courses.put(course.id(), course);
	}

	/**
	 * 
	 * @param id
	 */
	public void removeCourse(UUID id) {
		this.courses.remove(id);
	}

}