
public class StudentManager extends BaseUserManager{
	
	@Override
	public void studentLogIn(StudentManager studentManager) {
		System.out.println("Sisteme giri� yapt�n�z.");
	}

	
	@Override
	public void studentRegister(StudentManager studentManager) {
		System.out.println("Sisteme kay�t oldunuz.");
	}

	
	@Override
	public void studentExit(StudentManager studentManager) {
		System.out.println("Sistemden ��k�� yapt�n�z.");
	}
	@Override
	public void studentAddedCourses(StudentManager studentManager) {
		System.out.println("JAVA/REACT");
	}
}
