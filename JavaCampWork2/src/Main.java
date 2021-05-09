
public class Main {

	public static void main(String[] args) {
	Instructor instructor1 = new Instructor(1, "Engin Demiro�", "MCP,PMP and ITIL .."); // Yeni E�itmen Tan�mlama
	Student student1 = new Student(1, "Mert Bekir"); // Yeni ��renci Tan�mlama
	Course course1 = new Course(1, "Java Camp", "6 Ay s�recek Java Kamp�", instructor1); // Yeni Kurs Tan�mlama(JAVA)
	Course course2 = new Course(2, "C# Camp", "2 Ay s�recek C# Kamp�", instructor1); // Yeni Kurs Tan�mlama (C#)
	CourseManager courseManager = new CourseManager(); //Kurs ile ilgili i�leri yapabilmek i�in KursManager Referans�
	
	courseManager.joinCourse(course1, student1); //��renci 1'i Kurs 1'e Kay�t etmek

	StudentManager studentManager = new StudentManager(); // ��renci ile ilgili i�ler i�in StudentManager referans�
	studentManager.getRegisteredCourses(student1); // ��renci 1 'in kay�tl� kurslar�n� g�ster
	}

}
