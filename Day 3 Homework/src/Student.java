
public class Student extends User {

	private String seviye;
	private String projects;
	private String status;

	public Student() {

		System.out.println("Ogrenci");
	}

	public Student(String seviye, String projects, String status) {

		this.seviye = seviye;
		this.projects = projects;
		this.status = status;
	}

	public String getSeviye() {
		return seviye;
	}

	public void setSeviye(String seviye) {
		this.seviye = seviye;
	}

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
