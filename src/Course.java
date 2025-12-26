import java.util.UUID;

public class Course {

	private UUID id;
	private String name;

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

}