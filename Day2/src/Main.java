
public class Main {

	public static void main(String[] args) {
		StudentManager studentManager=new StudentManager();
		CoursesManager coursesManager=new CoursesManager();
		Student student1=new Student(1, "Furkan �eri",studentManager.coursesManager.courseName[0]);
		Student student2=new Student();
		student2.id=2;
		student2.name="Ali Veli";
		student2.courseName=coursesManager.courseName[1];
		
		Student[] students= {student1,student2};
		for (Student student : students) {
			System.out.println("��renci : "+student.name);			
			System.out.println("��rencinin ald��� kurs :"+studentManager.coursesManager.courseName[0]);
			break;			
		}
		System.out.println();
		System.out.println("��renci :"+student2.name);
		System.out.println("��rencinin ald��� kurs :"+studentManager.coursesManager.courseName[1]);
		
		
		
		

	}

}
