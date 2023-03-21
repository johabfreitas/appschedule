package entities;

public class BusinessContact {

	private String activity;
	private String employee;
	private String name;

	public BusinessContact() {
	}

	public BusinessContact(String activity, String employee, String name) {
		this.activity = activity;
		this.employee = employee;
		this.name = name;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getData() {

	}
}
