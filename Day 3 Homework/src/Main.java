
public class Main {

	public static void main(String[] args) {

		Instructor ınstructor1 = new Instructor();
		ınstructor1.setBranch("Kodlama");
		ınstructor1.setAdmin(true);
		ınstructor1.setId(1);
		ınstructor1.setPassword(123123);
		ınstructor1.setUserName("Engin Demiroğ");
		ınstructor1.setEmail("ınstructor1.mail");
		UserManager userManager = new UserManager();
		userManager.add(ınstructor1);

		Student student1 = new Student();
		student1.setEmail("student1.mail");
		student1.setId(1);
		student1.setPassword(123125);
		student1.setProjects("c# camp projesi");
		student1.setSeviye("3 seviye");
		student1.setStatus("Orta Düzey");
		student1.setUserName("mehmet");
		
		userManager.add(student1);
		
		User[] users ={ınstructor1,student1};
		
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
