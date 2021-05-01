
public class Main {

	public static void main(String[] args) {

		Instructor �nstructor1 = new Instructor();
		�nstructor1.setBranch("Kodlama");
		�nstructor1.setAdmin(true);
		�nstructor1.setId(1);
		�nstructor1.setPassword(123123);
		�nstructor1.setUserName("Engin Demiro�");
		�nstructor1.setEmail("�nstructor1.mail");
		UserManager userManager = new UserManager();
		userManager.add(�nstructor1);

		Student student1 = new Student();
		student1.setEmail("student1.mail");
		student1.setId(1);
		student1.setPassword(123125);
		student1.setProjects("c# camp projesi");
		student1.setSeviye("3 seviye");
		student1.setStatus("Orta D�zey");
		student1.setUserName("mehmet");
		
		userManager.add(student1);
		
		User[] users ={�nstructor1,student1};
		
		userManager.addMultiple(users);

		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.egitimYayinlandi();

		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");

		instructorManager.egitimSilindi();

		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");
		StudentManager studentManager = new StudentManager();
		studentManager.buyCours();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");
		studentManager.bitirVeDevamEt();
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-");
		studentManager.coursBitti();

	}

}
