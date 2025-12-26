import java.util.List;
import java.util.UUID;

public class Faculty {

	private UUID id;
	private String name;
	private List<Institute> institutes;

	public UUID id() {
		return id;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public List<Institute> getInstitutes() {
		return institutes;
	}

	/**
	 * 
	 * @param institutes
	 */
	public void setInstitutes(List<Institute> institutes) {
		this.institutes = institutes;
	}

}