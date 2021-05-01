
public class Instructor extends User {

	private String branch;
	private boolean isAdmin;

	public Instructor() {

		System.out.println("Egitmen");
	}

	public Instructor(String branch, boolean isAdmin) {

		this.branch = branch;
		this.isAdmin = isAdmin;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}
