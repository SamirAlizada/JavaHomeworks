
public class InstructorManager extends BaseUserManager {
	
	@Override
	public void courseAdd(InstructorManager instructorManager) {
		System.out.println("JAVA/REACT kurus baþarýyla sisteme eklendi.");
		
	}	

	
	@Override
	public void courseUpdate(InstructorManager instructorManager) {
		System.out.println("C#/ANGULAR kursu baþarýyla güncellendi.");;
	}

	
	@Override
	public void courseDelete(InstructorManager instructorManager) {
		System.out.println("Web Geliþtirici kursu sistemden silindi.");
	}

	
	@Override
	public void instructorRegister(InstructorManager instructorManager) {
		System.out.println("Sisteme kayýt oldunuz.");
	}

	
	@Override
	public void instructorLogIn(InstructorManager instructorManager) {
		System.out.println("Sisteme giriþ yaptýnýz.");
	}

	
	@Override
	public void instructorExit(InstructorManager instructorManager) {
		System.out.println("Sistemden çýkýþ yaptýnýz.");
	}
	
}
