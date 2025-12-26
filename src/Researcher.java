import java.util.*;

public class Researcher extends Employee {

	private String area;
	private Map<UUID, Institute> institutes = new HashMap<UUID, Institute>();

	public String getArea() {
		return this.area;
	}

	/**
	 * 
	 * @param area
	 */
	public void setArea(String area) {
		this.area = area;
	}

	public List<Institute> getInstitutes() {
		return new ArrayList<Institute>(institutes.values());
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		this.institutes.put(institute.id(), institute);
	}

	/**
	 * 
	 * @param id
	 */
	public void removeInstitute(UUID id) {
		this.institutes.remove(id);
	}

}