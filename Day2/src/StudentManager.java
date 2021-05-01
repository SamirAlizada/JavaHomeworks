
public class StudentManager {
	CoursesManager coursesManager=new CoursesManager();
	public void showCourse() {
		System.out.println("Eğitim aldığınız kurslar :"+coursesManager.courseName[0]);
		System.out.println("Eğitim aldığınız kurslar :"+coursesManager.courseName[1]);
	}

}
