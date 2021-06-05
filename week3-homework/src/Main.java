
public class Main {

	public static void main(String[] args) {
		
		Student ozge = new Student();
		ozge.studentName = "Ozge";
		ozge.userNumber = "12345";
		
		Instructor ahmet = new Instructor();
		ahmet.instructorName = "Ahmet";
		ahmet.userNumber = "23456";
		
		UserManager userManager = new UserManager();
		userManager.add(ozge);
		userManager.add(ahmet);
	}

}
