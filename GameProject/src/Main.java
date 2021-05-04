import java.time.LocalDate;
import Concrate.CampaignManager;
import Concrate.GameManager;
import Concrate.SaleManager;
import Concrate.UserManager;
import Concrate.VerificationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User user=new User(1, "Furkan Çeri", "18265684842", "1995");
		UserManager userManager=new UserManager(new VerificationManager());
		userManager.save(user);
		userManager.updateData(user);
		userManager.deleteData(user);
		
		System.out.println("-------------------------------------------------------");
		
		Campaign campaign=new Campaign(1, "Yýlbaþý indirimleri", LocalDate.now(), 50);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.addData(campaign);
		campaignManager.updateData(campaign);
		campaignManager.deleteData(campaign);
		
		System.out.println("--------------------------------------------------------------------------");
				
		Game game1=new Game(1, "Knight Online", 25, 5000);
		Game game2=new Game(2, "Crusader Kings III", 60, 3500);
		Game[] games = {game1,game2};
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.update(game2);
		gameManager.getAll(games);
		gameManager.delete(game1);
		
		System.out.println("--------------------------------------------------------------------------");
		
		Sale sale=new Sale(1, "kredi kartý", LocalDate.now());
		SaleManager saleManager=new SaleManager();
		saleManager.sale(user, game2, campaign, sale);
	}

}
