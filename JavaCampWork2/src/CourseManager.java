
public class CourseManager {
	
public void joinCourse(Course course, Student student) {
	student.registeredCourses = new Course[]{course};
	System.out.println(course.name + " İsimli Kursa Kayıt Yapıldı.");
}

}
