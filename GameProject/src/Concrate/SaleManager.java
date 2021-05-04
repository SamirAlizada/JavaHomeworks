package Concrate;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class SaleManager implements SaleService{
	
	@Override
	public void sale(User user, Game game, Campaign campaign, Sale sale) {
		System.out.println(user.getFullName()+" isimli kullan�c� "+game.getGameName()+" isimli oyunu "+campaign.getCampaignName()+" kampanyas�ndan yararlanarak "+sale.getSaleType()+" ile "+sale.getSaleDate()+" tarihinde sat�n ald�.");
	}
	
}
