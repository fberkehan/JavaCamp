
public class Main {

	public static void main(String[] args) {
		
		User student1 = new Student(1, "Mert", "mbk****@gmail.com");
		UserManager studentManager = new StudentManager();
		
		studentManager.addUser(student1);
		
		User instructor1 = new Instructor(1, "Engin Demiroğ", "engin****@gmail.com");
		
		UserManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor1);

	}

}
