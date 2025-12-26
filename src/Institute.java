import java.util.List;
import java.util.UUID;

public class Institute {

	private UUID id;
	private String name;
	private List<Researcher> employees;
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

	public List<Researcher> getEmployees() {
		return employees;
	}

	/**
	 * 
	 * @param employees
	 */
	public void setEmployees(List<Researcher> employees) {
		this.employees = List.copyOf(employees);

	}

}