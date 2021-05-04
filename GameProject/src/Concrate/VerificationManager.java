package Concrate;
import Abstract.Verification;
import Entities.User;

public class VerificationManager implements Verification{
	User user;
	
	private String fullName=("Furkan Çeri");
	private String nationalityId=("18265684842");
	private String birthYear=("1995");
	
	@Override
	public boolean checkIfRealPerson(User user) {
		if ((this.fullName.equals(user.getFullName()))&&(this.nationalityId.equals(user.getNationalityId()))&&(this.birthYear.equals(user.getBirthYear()))) {
			return true;
		}else {
			return false;
		}
		
	}

}
