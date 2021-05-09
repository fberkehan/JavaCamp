
public class StudentManager {
	
	
public void getRegisteredCourses(Student student) {
	System.out.println("---- Kurslar Listeleniyor----");
	for(Course course: student.registeredCourses)
	{
		System.out.println(course.name);
	}
	System.out.println("---- Kurslar Listelendi : " + student.name + " ----");
}

}
