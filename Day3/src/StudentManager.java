
public class StudentManager extends BaseUserManager{
	
	@Override
	public void studentLogIn(StudentManager studentManager) {
		System.out.println("Sisteme giriş yaptınız.");
	}

	
	@Override
	public void studentRegister(StudentManager studentManager) {
		System.out.println("Sisteme kayıt oldunuz.");
	}

	
	@Override
	public void studentExit(StudentManager studentManager) {
		System.out.println("Sistemden çıkış yaptınız.");
	}
	@Override
	public void studentAddedCourses(StudentManager studentManager) {
		System.out.println("JAVA/REACT");
	}
}
