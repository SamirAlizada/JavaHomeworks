
public class InstructorManager extends BaseUserManager {
	
	@Override
	public void courseAdd(InstructorManager instructorManager) {
		System.out.println("JAVA/REACT kurus ba�ar�yla sisteme eklendi.");
		
	}	

	
	@Override
	public void courseUpdate(InstructorManager instructorManager) {
		System.out.println("C#/ANGULAR kursu ba�ar�yla g�ncellendi.");;
	}

	
	@Override
	public void courseDelete(InstructorManager instructorManager) {
		System.out.println("Web Geli�tirici kursu sistemden silindi.");
	}

	
	@Override
	public void instructorRegister(InstructorManager instructorManager) {
		System.out.println("Sisteme kay�t oldunuz.");
	}

	
	@Override
	public void instructorLogIn(InstructorManager instructorManager) {
		System.out.println("Sisteme giri� yapt�n�z.");
	}

	
	@Override
	public void instructorExit(InstructorManager instructorManager) {
		System.out.println("Sistemden ��k�� yapt�n�z.");
	}
	
}
