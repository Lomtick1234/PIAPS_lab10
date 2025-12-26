import java.util.List;

public class Contribution {

	private List<Researcher> researchers;
	private Project project;

	public List<Researcher> getResearchers() {
		return this.researchers;
	}

	/**
	 * 
	 * @param researchers
	 */
	public void setResearchers(List<Researcher> researchers) {
		this.researchers = researchers;
	}

	public Project getProject() {
		return this.project;
	}

	/**
	 * 
	 * @param project
	 */
	public void setProject(Project project) {
		this.project = project;
	}

}