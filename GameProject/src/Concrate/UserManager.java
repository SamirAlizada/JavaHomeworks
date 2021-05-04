package Concrate;
import Abstract.UserService;
import Abstract.Verification;
import Entities.User;

public class UserManager implements UserService{
	Verification verification;
	
	public UserManager(Verification verification) {
		this.verification=verification;
	}

	@Override
	public void register(User user) {
		if (verification.checkIfRealPerson(user)) {
			System.out.println("Oyuncu sisteme eklendi."+"\n"+"\n"+"Oyuncu ismi :"+user.getFullName()+"\n"+"Oyuncu kimlik numarasý :"+user.getNationalityId()+"\n"+"Oyuncu doðum tarihi :"+user.getBirthYear()+"\n"+"Oyuncunun sistemdeki ID numarasý :"+user.getId()+"\n");
		}else {
			System.out.println("Kullanýcý bilgileri doðrulanamadý. Sisteme kayýt yapýlamadý.");
		}

	}
	@Override
	public void updateData(User user) {
		System.out.println("Oyuncu bilgileri güncellendi : "+user.getFullName());

	}
	@Override
	public void deleteData(User user) {
		System.out.println("Oyuncu bilgileri silindi : "+user.getFullName()+" "+user.getNationalityId()+" "+user.getBirthYear()+" "+user.getId());
	}
}
