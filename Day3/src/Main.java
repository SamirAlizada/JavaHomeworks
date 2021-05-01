
public class Main {

	public static void main(String[] args) {

		BaseUserManager baseUserManager = new BaseUserManager();

		Student student1 = new Student();
		student1.set_id(1);
		student1.set_studentNumber(16);
		student1.set_firstName("Furkan");
		student1.set_lastName("�eri");
		student1.set_email("furkancerii2@gmail.com");
		student1.set_courseName("Java / React");

		Student student2 = new Student();
		student2.set_id(2);
		student2.set_studentNumber(34);
		student2.set_firstName("Ali");
		student2.set_lastName("Veli");
		student2.set_email("aliveli@aliveli.com");
		student2.set_courseName("C# / Angular");

		Student[] students = { student1, student2 };
		for (Student student : students) {
			baseUserManager.studentRegister(new StudentManager());
			System.out.println("��renci Numaras� :" + student.get_studentNumber());
			System.out.println("�sim :" + student.get_firstName());
			System.out.println("Soyisim :" + student.get_lastName());
			System.out.println("Email :" + student.get_email());
			System.out.println();
			baseUserManager.studentLogIn(new StudentManager());
			System.out.println(student.get_firstName()+" "+student.get_lastName());
			System.out.print("E�itim ald���n�z kurslar :");
			baseUserManager.studentAddedCourses(new StudentManager());
			baseUserManager.studentExit(new StudentManager());
			System.out.println("----------------------------------------------");
		}

		Instructor instructor1 = new Instructor();
		instructor1.set_id(1);
		instructor1.set_firstName("Engin");
		instructor1.set_lastName("Demiro�");
		instructor1.set_email("engindemirog@gmail.com");
		instructor1.setStudentCount(30000);

		Instructor[] instructors = { instructor1 };
		for (Instructor instructor : instructors) {
			baseUserManager.instructorRegister(new InstructorManager());
			System.out.println("�sim :" + instructor.get_firstName());
			System.out.println("Soyisim :" + instructor.get_lastName());
			System.out.println("Email :" + instructor.get_email());
			System.out.println("��renci say�s� :" + instructor.getStudentCount());
			System.out.println();
			baseUserManager.instructorLogIn(new InstructorManager());
			System.out.println(instructor1.get_firstName() + " " + instructor1.get_lastName());
			System.out.println();
			System.out.print("Sisteme y�kledi�iniz kurslar :");
			baseUserManager.courseAdd(new InstructorManager());	
			System.out.print("Sistemden kald�r�lan kurslar :");
			baseUserManager.courseDelete(new InstructorManager());
			System.out.print("G�ncellenen kurslar          :");
			baseUserManager.courseUpdate(new InstructorManager());
			baseUserManager.instructorExit(new InstructorManager());
			
			System.out.println("----------------------------------------------");
		}

	}

}
