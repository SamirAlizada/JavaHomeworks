
public class StudentManager {
	CoursesManager coursesManager=new CoursesManager();
	public void showCourse() {
		System.out.println("E�itim ald���n�z kurslar :"+coursesManager.courseName[0]);
		System.out.println("E�itim ald���n�z kurslar :"+coursesManager.courseName[1]);
	}

}
