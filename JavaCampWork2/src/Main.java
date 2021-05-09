
public class Main {

	public static void main(String[] args) {
	Instructor instructor1 = new Instructor(1, "Engin Demiroğ", "MCP,PMP and ITIL .."); // Yeni Eğitmen Tanımlama
	Student student1 = new Student(1, "Mert Bekir"); // Yeni Öğrenci Tanımlama
	Course course1 = new Course(1, "Java Camp", "6 Ay sürecek Java Kampı", instructor1); // Yeni Kurs Tanımlama(JAVA)
	Course course2 = new Course(2, "C# Camp", "2 Ay sürecek C# Kampı", instructor1); // Yeni Kurs Tanımlama (C#)
	CourseManager courseManager = new CourseManager(); //Kurs ile ilgili işleri yapabilmek için KursManager Referansı
	
	courseManager.joinCourse(course1, student1); //Öğrenci 1'i Kurs 1'e Kayıt etmek

	StudentManager studentManager = new StudentManager(); // Öğrenci ile ilgili işler için StudentManager referansı
	studentManager.getRegisteredCourses(student1); // Öğrenci 1 'in kayıtlı kurslarını göster
	}

}
